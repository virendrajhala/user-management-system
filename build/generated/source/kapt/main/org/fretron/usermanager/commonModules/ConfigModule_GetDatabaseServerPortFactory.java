package org.fretron.usermanager.commonModules;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ConfigModule_GetDatabaseServerPortFactory implements Factory<Integer> {
  private final ConfigModule module;

  public ConfigModule_GetDatabaseServerPortFactory(ConfigModule module) {
    this.module = module;
  }

  @Override
  public Integer get() {
    return provideInstance(module);
  }

  public static Integer provideInstance(ConfigModule module) {
    return proxyGetDatabaseServerPort(module);
  }

  public static ConfigModule_GetDatabaseServerPortFactory create(ConfigModule module) {
    return new ConfigModule_GetDatabaseServerPortFactory(module);
  }

  public static int proxyGetDatabaseServerPort(ConfigModule instance) {
    return instance.getDatabaseServerPort();
  }
}
