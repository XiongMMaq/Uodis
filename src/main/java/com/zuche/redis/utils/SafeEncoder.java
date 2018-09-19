package com.zuche.redis.utils;

import com.zuche.redis.atomic.Protocol;
import com.zuche.redis.exceptions.FrameworkRedisException;
import java.io.UnsupportedEncodingException;

/**
 * The only reason to have this is to be able to compatible with java 1.5 :(
 */
public final class SafeEncoder {
  private SafeEncoder(){
    throw new InstantiationError( "Must not instantiate this class" );
  }

  public static byte[][] encodeMany(final String... strs) {
    byte[][] many = new byte[strs.length][];
    for (int i = 0; i < strs.length; i++) {
      many[i] = encode(strs[i]);
    }
    return many;
  }

  public static byte[] encode(final String str) {
    try {
      if (str == null) {
        throw new FrameworkRedisException("value sent to redis cannot be null");
      }
      return str.getBytes(Protocol.CHARSET);
    } catch (UnsupportedEncodingException e) {
      throw new FrameworkRedisException(e);
    }
  }

  public static String encode(final byte[] data) {
    try {
      return new String(data, Protocol.CHARSET);
    } catch (UnsupportedEncodingException e) {
      throw new FrameworkRedisException(e);
    }
  }
}
