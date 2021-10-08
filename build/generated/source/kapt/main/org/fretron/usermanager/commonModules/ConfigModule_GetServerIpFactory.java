package org.fretron.usermanager.commonModules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ConfigModule_GetServerIpFactory implements Factory<String> {
  private final ConfigModule module;

  public ConfigModule_GetServerIpFactory(ConfigModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideInstance(module);
  }

  public static String provideInstance(ConfigModule module) {
    return proxyGetServerIp(module);
  }

  public static ConfigModule_GetServerIpFactory create(ConfigModule module) {
    return new ConfigModule_GetServerIpFactory(module);
  }

  public static String proxyGetServerIp(ConfigModule instance) {
    return Preconditions.checkNotNull(
        instance.getServerIp(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
