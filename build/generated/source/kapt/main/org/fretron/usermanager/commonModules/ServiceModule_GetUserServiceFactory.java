package org.fretron.usermanager.commonModules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.freton.usermanager.repository.UserRepository;
import org.freton.usermanager.service.UserService;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ServiceModule_GetUserServiceFactory implements Factory<UserService> {
  private final ServiceModule module;

  private final Provider<UserRepository> userRepositoryProvider;

  public ServiceModule_GetUserServiceFactory(
      ServiceModule module, Provider<UserRepository> userRepositoryProvider) {
    this.module = module;
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public UserService get() {
    return provideInstance(module, userRepositoryProvider);
  }

  public static UserService provideInstance(
      ServiceModule module, Provider<UserRepository> userRepositoryProvider) {
    return proxyGetUserService(module, userRepositoryProvider.get());
  }

  public static ServiceModule_GetUserServiceFactory create(
      ServiceModule module, Provider<UserRepository> userRepositoryProvider) {
    return new ServiceModule_GetUserServiceFactory(module, userRepositoryProvider);
  }

  public static UserService proxyGetUserService(
      ServiceModule instance, UserRepository userRepository) {
    return Preconditions.checkNotNull(
        instance.getUserService(userRepository),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
