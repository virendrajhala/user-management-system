package org.fretron.usermanager.commonModules;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.freton.usermanager.resource.UserResource;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HttpModule_Factory implements Factory<HttpModule> {
  private final Provider<UserResource> userResourceProvider;

  public HttpModule_Factory(Provider<UserResource> userResourceProvider) {
    this.userResourceProvider = userResourceProvider;
  }

  @Override
  public HttpModule get() {
    return provideInstance(userResourceProvider);
  }

  public static HttpModule provideInstance(Provider<UserResource> userResourceProvider) {
    return new HttpModule(userResourceProvider.get());
  }

  public static HttpModule_Factory create(Provider<UserResource> userResourceProvider) {
    return new HttpModule_Factory(userResourceProvider);
  }

  public static HttpModule newHttpModule(UserResource userResource) {
    return new HttpModule(userResource);
  }
}
