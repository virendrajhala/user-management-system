package org.fretron.usermanager.commonModules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ConfigModule_GetDatabaseServerIpFactory implements Factory<String> {
  private final ConfigModule module;

  public ConfigModule_GetDatabaseServerIpFactory(ConfigModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideInstance(module);
  }

  public static String provideInstance(ConfigModule module) {
    return proxyGetDatabaseServerIp(module);
  }

  public static ConfigModule_GetDatabaseServerIpFactory create(ConfigModule module) {
    return new ConfigModule_GetDatabaseServerIpFactory(module);
  }

  public static String proxyGetDatabaseServerIp(ConfigModule instance) {
    return Preconditions.checkNotNull(
        instance.getDatabaseServerIp(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
