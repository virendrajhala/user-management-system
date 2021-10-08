package org.fretron.usermanager.commonModules;

import com.mongodb.client.MongoDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DatabaseModule_GetMongoDatabaseFactory implements Factory<MongoDatabase> {
  private final DatabaseModule module;

  public DatabaseModule_GetMongoDatabaseFactory(DatabaseModule module) {
    this.module = module;
  }

  @Override
  public MongoDatabase get() {
    return provideInstance(module);
  }

  public static MongoDatabase provideInstance(DatabaseModule module) {
    return proxyGetMongoDatabase(module);
  }

  public static DatabaseModule_GetMongoDatabaseFactory create(DatabaseModule module) {
    return new DatabaseModule_GetMongoDatabaseFactory(module);
  }

  public static MongoDatabase proxyGetMongoDatabase(DatabaseModule instance) {
    return Preconditions.checkNotNull(
        instance.getMongoDatabase(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
