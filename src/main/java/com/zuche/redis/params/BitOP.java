package com.zuche.redis.params;

import com.zuche.redis.utils.SafeEncoder;

public enum BitOP {
  AND, OR, XOR, NOT;

  public final byte[] raw;

  private BitOP() {
    this.raw = SafeEncoder.encode(name());
  }
}
