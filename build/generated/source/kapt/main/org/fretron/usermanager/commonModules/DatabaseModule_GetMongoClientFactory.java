package org.fretron.usermanager.commonModules;

import com.mongodb.MongoClient;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DatabaseModule_GetMongoClientFactory implements Factory<MongoClient> {
  private final DatabaseModule module;

  private final Provider<String> databaseServerIpProvider;

  private final Provider<Integer> databaseServerPortProvider;

  public DatabaseModule_GetMongoClientFactory(
      DatabaseModule module,
      Provider<String> databaseServerIpProvider,
      Provider<Integer> databaseServerPortProvider) {
    this.module = module;
    this.databaseServerIpProvider = databaseServerIpProvider;
    this.databaseServerPortProvider = databaseServerPortProvider;
  }

  @Override
  public MongoClient get() {
    return provideInstance(module, databaseServerIpProvider, databaseServerPortProvider);
  }

  public static MongoClient provideInstance(
      DatabaseModule module,
      Provider<String> databaseServerIpProvider,
      Provider<Integer> databaseServerPortProvider) {
    return proxyGetMongoClient(
        module, databaseServerIpProvider.get(), databaseServerPortProvider.get());
  }

  public static DatabaseModule_GetMongoClientFactory create(
      DatabaseModule module,
      Provider<String> databaseServerIpProvider,
      Provider<Integer> databaseServerPortProvider) {
    return new DatabaseModule_GetMongoClientFactory(
        module, databaseServerIpProvider, databaseServerPortProvider);
  }

  public static MongoClient proxyGetMongoClient(
      DatabaseModule instance, String databaseServerIp, int databaseServerPort) {
    return Preconditions.checkNotNull(
        instance.getMongoClient(databaseServerIp, databaseServerPort),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
