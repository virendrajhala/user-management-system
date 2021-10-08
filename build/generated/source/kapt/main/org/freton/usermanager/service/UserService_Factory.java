package org.freton.usermanager.service;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.freton.usermanager.repository.UserRepository;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UserService_Factory implements Factory<UserService> {
  private final Provider<UserRepository> userRepoProvider;

  public UserService_Factory(Provider<UserRepository> userRepoProvider) {
    this.userRepoProvider = userRepoProvider;
  }

  @Override
  public UserService get() {
    return provideInstance(userRepoProvider);
  }

  public static UserService provideInstance(Provider<UserRepository> userRepoProvider) {
    return new UserService(userRepoProvider.get());
  }

  public static UserService_Factory create(Provider<UserRepository> userRepoProvider) {
    return new UserService_Factory(userRepoProvider);
  }

  public static UserService newUserService(UserRepository userRepo) {
    return new UserService(userRepo);
  }
}
