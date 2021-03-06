package com.zuche.uodis.commands;



import com.zuche.uodis.support.Module;

import java.util.List;

public interface ModuleCommands {
  String moduleLoad(String path);
  String moduleUnload(String name);
  List<Module> moduleList();
}
