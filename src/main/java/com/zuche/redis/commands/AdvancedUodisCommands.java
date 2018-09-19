package com.zuche.redis.commands;



import com.zuche.redis.support.Slowlog;

import java.util.List;

public interface AdvancedUodisCommands {
  List<String> configGet(String pattern);

  String configSet(String parameter, String value);

  String slowlogReset();

  Long slowlogLen();

  List<Slowlog> slowlogGet();

  List<Slowlog> slowlogGet(long entries);

  Long objectRefcount(String key);

  String objectEncoding(String key);

  Long objectIdletime(String key);
}
