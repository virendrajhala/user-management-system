package org.fretron.usermanager.component;

import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.freton.usermanager.repository.UserRepository;
import org.freton.usermanager.resource.UserResource;
import org.freton.usermanager.service.UserService;
import org.fretron.usermanager.commonModules.ConfigModule;
import org.fretron.usermanager.commonModules.ConfigModule_GetJacksonObjectMapperFactory;
import org.fretron.usermanager.commonModules.DatabaseModule;
import org.fretron.usermanager.commonModules.DatabaseModule_GetMongoClientFactory;
import org.fretron.usermanager.commonModules.DatabaseModule_GetMongoDatabaseFactory;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private ConfigModule configModule;

  private DatabaseModule databaseModule;

  private DaggerAppComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static AppComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.configModule = builder.configModule;
    this.databaseModule = builder.databaseModule;
  }

  @Override
  public UserResource getUserResource() {
    return new UserResource(
        getUserService(),
        ConfigModule_GetJacksonObjectMapperFactory.proxyGetJacksonObjectMapper(configModule));
  }

  @Override
  public UserService getUserService() {
    return new UserService(getUserRepository());
  }

  @Override
  public UserRepository getUserRepository() {
    return new UserRepository(
        DatabaseModule_GetMongoClientFactory.proxyGetMongoClient(databaseModule),
        DatabaseModule_GetMongoDatabaseFactory.proxyGetMongoDatabase(databaseModule),
        ConfigModule_GetJacksonObjectMapperFactory.proxyGetJacksonObjectMapper(configModule));
  }

  public static final class Builder {
    private DatabaseModule databaseModule;

    private ConfigModule configModule;

    private Builder() {}

    public AppComponent build() {
      if (databaseModule == null) {
        this.databaseModule = new DatabaseModule();
      }
      if (configModule == null) {
        this.configModule = new ConfigModule();
      }
      return new DaggerAppComponent(this);
    }

    public Builder configModule(ConfigModule configModule) {
      this.configModule = Preconditions.checkNotNull(configModule);
      return this;
    }

    public Builder databaseModule(DatabaseModule databaseModule) {
      this.databaseModule = Preconditions.checkNotNull(databaseModule);
      return this;
    }
  }
}
