package org.fretron.usermanager.commonModules;

import com.fasterxml.jackson.databind.ObjectMapper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ConfigModule_GetJacksonObjectMapperFactory implements Factory<ObjectMapper> {
  private final ConfigModule module;

  public ConfigModule_GetJacksonObjectMapperFactory(ConfigModule module) {
    this.module = module;
  }

  @Override
  public ObjectMapper get() {
    return provideInstance(module);
  }

  public static ObjectMapper provideInstance(ConfigModule module) {
    return proxyGetJacksonObjectMapper(module);
  }

  public static ConfigModule_GetJacksonObjectMapperFactory create(ConfigModule module) {
    return new ConfigModule_GetJacksonObjectMapperFactory(module);
  }

  public static ObjectMapper proxyGetJacksonObjectMapper(ConfigModule instance) {
    return Preconditions.checkNotNull(
        instance.getJacksonObjectMapper(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
