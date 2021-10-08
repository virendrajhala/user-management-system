package org.fretron.usermanager.commonModules;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ConfigModule_GetServerPortFactory implements Factory<Integer> {
  private final ConfigModule module;

  public ConfigModule_GetServerPortFactory(ConfigModule module) {
    this.module = module;
  }

  @Override
  public Integer get() {
    return provideInstance(module);
  }

  public static Integer provideInstance(ConfigModule module) {
    return proxyGetServerPort(module);
  }

  public static ConfigModule_GetServerPortFactory create(ConfigModule module) {
    return new ConfigModule_GetServerPortFactory(module);
  }

  public static int proxyGetServerPort(ConfigModule instance) {
    return instance.getServerPort();
  }
}
