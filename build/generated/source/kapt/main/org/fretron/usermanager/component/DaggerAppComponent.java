package org.fretron.usermanager.component;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.freton.usermanager.repository.UserRepository;
import org.freton.usermanager.resource.UserResource;
import org.freton.usermanager.service.UserService;
import org.fretron.usermanager.commonModules.ConfigModule;
import org.fretron.usermanager.commonModules.ConfigModule_GetDatabaseNameFactory;
import org.fretron.usermanager.commonModules.ConfigModule_GetDatabaseServerIpFactory;
import org.fretron.usermanager.commonModules.ConfigModule_GetJacksonObjectMapperFactory;
import org.fretron.usermanager.commonModules.ConfigModule_GetServerIpFactory;
import org.fretron.usermanager.commonModules.DatabaseModule;
import org.fretron.usermanager.commonModules.DatabaseModule_GetMongoClientFactory;
import org.fretron.usermanager.commonModules.DatabaseModule_GetMongoDatabaseFactory;
import org.fretron.usermanager.commonModules.HttpModule;
import org.fretron.usermanager.commonModules.HttpModule_ServerFactory;
import org.fretron.usermanager.commonModules.RepositoryModule;
import org.fretron.usermanager.commonModules.RepositoryModule_GetUserRepositoryFactory;
import org.fretron.usermanager.commonModules.ServiceModule;
import org.fretron.usermanager.commonModules.ServiceModule_GetUserServiceFactory;
import org.glassfish.grizzly.http.server.HttpServer;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private HttpModule httpModule;

  private ConfigModule configModule;

  private ServiceModule serviceModule;

  private RepositoryModule repositoryModule;

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

  private MongoClient getNamedMongoClient() {
    return DatabaseModule_GetMongoClientFactory.proxyGetMongoClient(
        databaseModule,
        ConfigModule_GetDatabaseServerIpFactory.proxyGetDatabaseServerIp(configModule),
        configModule.getDatabaseServerPort());
  }

  private MongoDatabase getNamedMongoDatabase() {
    return DatabaseModule_GetMongoDatabaseFactory.proxyGetMongoDatabase(
        databaseModule,
        ConfigModule_GetDatabaseNameFactory.proxyGetDatabaseName(configModule),
        getNamedMongoClient());
  }

  private UserRepository getNamedUserRepository() {
    return RepositoryModule_GetUserRepositoryFactory.proxyGetUserRepository(
        repositoryModule,
        getNamedMongoClient(),
        getNamedMongoDatabase(),
        ConfigModule_GetJacksonObjectMapperFactory.proxyGetJacksonObjectMapper(configModule));
  }

  private UserService getNamedUserService() {
    return ServiceModule_GetUserServiceFactory.proxyGetUserService(
        serviceModule, getNamedUserRepository());
  }

  private UserResource getUserResource() {
    return new UserResource(
        getNamedUserService(),
        ConfigModule_GetJacksonObjectMapperFactory.proxyGetJacksonObjectMapper(configModule));
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.httpModule = builder.httpModule;
    this.configModule = builder.configModule;
    this.serviceModule = builder.serviceModule;
    this.repositoryModule = builder.repositoryModule;
    this.databaseModule = builder.databaseModule;
  }

  @Override
  public HttpServer getHttpServer() {
    return HttpModule_ServerFactory.proxyServer(
        httpModule,
        ConfigModule_GetServerIpFactory.proxyGetServerIp(configModule),
        configModule.getServerPort(),
        getUserResource());
  }

  public static final class Builder {
    private ConfigModule configModule;

    private DatabaseModule databaseModule;

    private RepositoryModule repositoryModule;

    private ServiceModule serviceModule;

    private HttpModule httpModule;

    private Builder() {}

    public AppComponent build() {
      if (configModule == null) {
        this.configModule = new ConfigModule();
      }
      if (databaseModule == null) {
        this.databaseModule = new DatabaseModule();
      }
      if (repositoryModule == null) {
        this.repositoryModule = new RepositoryModule();
      }
      if (serviceModule == null) {
        this.serviceModule = new ServiceModule();
      }
      if (httpModule == null) {
        this.httpModule = new HttpModule();
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

    public Builder httpModule(HttpModule httpModule) {
      this.httpModule = Preconditions.checkNotNull(httpModule);
      return this;
    }

    public Builder serviceModule(ServiceModule serviceModule) {
      this.serviceModule = Preconditions.checkNotNull(serviceModule);
      return this;
    }

    public Builder repositoryModule(RepositoryModule repositoryModule) {
      this.repositoryModule = Preconditions.checkNotNull(repositoryModule);
      return this;
    }
  }
}
