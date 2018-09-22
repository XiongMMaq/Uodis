package com.zuche.uodis.support;


import com.zuche.uodis.utils.SafeEncoder;

public enum ListPosition {
  BEFORE, AFTER;
  public final byte[] raw;

  private ListPosition() {
    raw = SafeEncoder.encode(name());
  }
}
