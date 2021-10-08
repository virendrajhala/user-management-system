package org.freton.usermanager.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UserRepository_Factory implements Factory<UserRepository> {
  private final Provider<MongoClient> mongoProvider;

  private final Provider<MongoDatabase> dbProvider;

  private final Provider<ObjectMapper> mapperProvider;

  public UserRepository_Factory(
      Provider<MongoClient> mongoProvider,
      Provider<MongoDatabase> dbProvider,
      Provider<ObjectMapper> mapperProvider) {
    this.mongoProvider = mongoProvider;
    this.dbProvider = dbProvider;
    this.mapperProvider = mapperProvider;
  }

  @Override
  public UserRepository get() {
    return provideInstance(mongoProvider, dbProvider, mapperProvider);
  }

  public static UserRepository provideInstance(
      Provider<MongoClient> mongoProvider,
      Provider<MongoDatabase> dbProvider,
      Provider<ObjectMapper> mapperProvider) {
    return new UserRepository(mongoProvider.get(), dbProvider.get(), mapperProvider.get());
  }

  public static UserRepository_Factory create(
      Provider<MongoClient> mongoProvider,
      Provider<MongoDatabase> dbProvider,
      Provider<ObjectMapper> mapperProvider) {
    return new UserRepository_Factory(mongoProvider, dbProvider, mapperProvider);
  }

  public static UserRepository newUserRepository(
      MongoClient mongo, MongoDatabase db, ObjectMapper mapper) {
    return new UserRepository(mongo, db, mapper);
  }
}
