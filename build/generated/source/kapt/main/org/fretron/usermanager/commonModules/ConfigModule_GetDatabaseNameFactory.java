package org.fretron.usermanager.commonModules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ConfigModule_GetDatabaseNameFactory implements Factory<String> {
  private final ConfigModule module;

  public ConfigModule_GetDatabaseNameFactory(ConfigModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideInstance(module);
  }

  public static String provideInstance(ConfigModule module) {
    return proxyGetDatabaseName(module);
  }

  public static ConfigModule_GetDatabaseNameFactory create(ConfigModule module) {
    return new ConfigModule_GetDatabaseNameFactory(module);
  }

  public static String proxyGetDatabaseName(ConfigModule instance) {
    return Preconditions.checkNotNull(
        instance.getDatabaseName(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
