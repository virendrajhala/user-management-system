package org.fretron.usermanager.commonModules;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.freton.usermanager.repository.UserRepository;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RepositoryModule_GetUserRepositoryFactory implements Factory<UserRepository> {
  private final RepositoryModule module;

  private final Provider<MongoClient> mongoClientProvider;

  private final Provider<MongoDatabase> mongoDatabaseProvider;

  private final Provider<ObjectMapper> objectMapperProvider;

  public RepositoryModule_GetUserRepositoryFactory(
      RepositoryModule module,
      Provider<MongoClient> mongoClientProvider,
      Provider<MongoDatabase> mongoDatabaseProvider,
      Provider<ObjectMapper> objectMapperProvider) {
    this.module = module;
    this.mongoClientProvider = mongoClientProvider;
    this.mongoDatabaseProvider = mongoDatabaseProvider;
    this.objectMapperProvider = objectMapperProvider;
  }

  @Override
  public UserRepository get() {
    return provideInstance(
        module, mongoClientProvider, mongoDatabaseProvider, objectMapperProvider);
  }

  public static UserRepository provideInstance(
      RepositoryModule module,
      Provider<MongoClient> mongoClientProvider,
      Provider<MongoDatabase> mongoDatabaseProvider,
      Provider<ObjectMapper> objectMapperProvider) {
    return proxyGetUserRepository(
        module, mongoClientProvider.get(), mongoDatabaseProvider.get(), objectMapperProvider.get());
  }

  public static RepositoryModule_GetUserRepositoryFactory create(
      RepositoryModule module,
      Provider<MongoClient> mongoClientProvider,
      Provider<MongoDatabase> mongoDatabaseProvider,
      Provider<ObjectMapper> objectMapperProvider) {
    return new RepositoryModule_GetUserRepositoryFactory(
        module, mongoClientProvider, mongoDatabaseProvider, objectMapperProvider);
  }

  public static UserRepository proxyGetUserRepository(
      RepositoryModule instance,
      MongoClient mongoClient,
      MongoDatabase mongoDatabase,
      ObjectMapper objectMapper) {
    return Preconditions.checkNotNull(
        instance.getUserRepository(mongoClient, mongoDatabase, objectMapper),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
