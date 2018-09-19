package com.zuche.redis.commands;



import com.zuche.redis.support.Module;

import java.util.List;

public interface ModuleCommands {
  String moduleLoad(String path);
  String moduleUnload(String name);
  List<Module> moduleList();
}
