package org.freton.usermanager.resource;

import com.fasterxml.jackson.databind.ObjectMapper;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.freton.usermanager.service.UserService;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UserResource_Factory implements Factory<UserResource> {
  private final Provider<UserService> userServiceProvider;

  private final Provider<ObjectMapper> mapperProvider;

  public UserResource_Factory(
      Provider<UserService> userServiceProvider, Provider<ObjectMapper> mapperProvider) {
    this.userServiceProvider = userServiceProvider;
    this.mapperProvider = mapperProvider;
  }

  @Override
  public UserResource get() {
    return provideInstance(userServiceProvider, mapperProvider);
  }

  public static UserResource provideInstance(
      Provider<UserService> userServiceProvider, Provider<ObjectMapper> mapperProvider) {
    return new UserResource(userServiceProvider.get(), mapperProvider.get());
  }

  public static UserResource_Factory create(
      Provider<UserService> userServiceProvider, Provider<ObjectMapper> mapperProvider) {
    return new UserResource_Factory(userServiceProvider, mapperProvider);
  }

  public static UserResource newUserResource(UserService userService, ObjectMapper mapper) {
    return new UserResource(userService, mapper);
  }
}
