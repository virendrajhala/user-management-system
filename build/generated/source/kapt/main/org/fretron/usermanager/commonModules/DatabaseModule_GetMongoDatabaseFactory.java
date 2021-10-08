package org.fretron.usermanager.commonModules;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DatabaseModule_GetMongoDatabaseFactory implements Factory<MongoDatabase> {
  private final DatabaseModule module;

  private final Provider<String> databaseNameProvider;

  private final Provider<MongoClient> mongoClientProvider;

  public DatabaseModule_GetMongoDatabaseFactory(
      DatabaseModule module,
      Provider<String> databaseNameProvider,
      Provider<MongoClient> mongoClientProvider) {
    this.module = module;
    this.databaseNameProvider = databaseNameProvider;
    this.mongoClientProvider = mongoClientProvider;
  }

  @Override
  public MongoDatabase get() {
    return provideInstance(module, databaseNameProvider, mongoClientProvider);
  }

  public static MongoDatabase provideInstance(
      DatabaseModule module,
      Provider<String> databaseNameProvider,
      Provider<MongoClient> mongoClientProvider) {
    return proxyGetMongoDatabase(module, databaseNameProvider.get(), mongoClientProvider.get());
  }

  public static DatabaseModule_GetMongoDatabaseFactory create(
      DatabaseModule module,
      Provider<String> databaseNameProvider,
      Provider<MongoClient> mongoClientProvider) {
    return new DatabaseModule_GetMongoDatabaseFactory(
        module, databaseNameProvider, mongoClientProvider);
  }

  public static MongoDatabase proxyGetMongoDatabase(
      DatabaseModule instance, String databaseName, MongoClient mongoClient) {
    return Preconditions.checkNotNull(
        instance.getMongoDatabase(databaseName, mongoClient),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
