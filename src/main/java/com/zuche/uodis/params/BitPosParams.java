package com.zuche.uodis.params;

import com.zuche.uodis.base.Protocol;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BitPosParams {
  private List<byte[]> params = new ArrayList<byte[]>();

  public BitPosParams() {
  }

  public BitPosParams(long start) {
    params.add(Protocol.toByteArray(start));
  }

  public BitPosParams(long start, long end) {
    this(start);

    params.add(Protocol.toByteArray(end));
  }

  public Collection<byte[]> getParams() {
    return Collections.unmodifiableCollection(params);
  }
}
