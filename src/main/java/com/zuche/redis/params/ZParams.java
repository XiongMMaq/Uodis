package com.zuche.redis.params;



import com.zuche.redis.atomic.Protocol;
import com.zuche.redis.utils.SafeEncoder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static com.zuche.redis.atomic.Protocol.Keyword.AGGREGATE;
import static com.zuche.redis.atomic.Protocol.Keyword.WEIGHTS;


public class ZParams {
  public enum Aggregate {
    SUM, MIN, MAX;

    public final byte[] raw;

    Aggregate() {
      raw = SafeEncoder.encode(name());
    }
  }

  private List<byte[]> params = new ArrayList<byte[]>();

  /**
   * Set weights.
   * @param weights weights.
   */
  public ZParams weights(final double... weights) {
    params.add(WEIGHTS.raw);
    for (final double weight : weights) {
      params.add(Protocol.toByteArray(weight));
    }

    return this;
  }

  public Collection<byte[]> getParams() {
    return Collections.unmodifiableCollection(params);
  }

  public ZParams aggregate(final Aggregate aggregate) {
    params.add(AGGREGATE.raw);
    params.add(aggregate.raw);
    return this;
  }
}
