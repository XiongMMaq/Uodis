package com.zuche.uodis.params;

import com.zuche.uodis.utils.SafeEncoder;

public enum BitOP {
  AND, OR, XOR, NOT;

  public final byte[] raw;

  private BitOP() {
    this.raw = SafeEncoder.encode(name());
  }
}
