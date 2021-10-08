package org.fretron.usermanager.commonModules;

import com.mongodb.MongoClient;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DatabaseModule_GetMongoClientFactory implements Factory<MongoClient> {
  private final DatabaseModule module;

  public DatabaseModule_GetMongoClientFactory(DatabaseModule module) {
    this.module = module;
  }

  @Override
  public MongoClient get() {
    return provideInstance(module);
  }

  public static MongoClient provideInstance(DatabaseModule module) {
    return proxyGetMongoClient(module);
  }

  public static DatabaseModule_GetMongoClientFactory create(DatabaseModule module) {
    return new DatabaseModule_GetMongoClientFactory(module);
  }

  public static MongoClient proxyGetMongoClient(DatabaseModule instance) {
    return Preconditions.checkNotNull(
        instance.getMongoClient(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
