package org.fretron.usermanager.commonModules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.freton.usermanager.resource.UserResource;
import org.glassfish.grizzly.http.server.HttpServer;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HttpModule_ServerFactory implements Factory<HttpServer> {
  private final HttpModule module;

  private final Provider<String> serverIpProvider;

  private final Provider<Integer> serverPortProvider;

  private final Provider<UserResource> userResourceProvider;

  public HttpModule_ServerFactory(
      HttpModule module,
      Provider<String> serverIpProvider,
      Provider<Integer> serverPortProvider,
      Provider<UserResource> userResourceProvider) {
    this.module = module;
    this.serverIpProvider = serverIpProvider;
    this.serverPortProvider = serverPortProvider;
    this.userResourceProvider = userResourceProvider;
  }

  @Override
  public HttpServer get() {
    return provideInstance(module, serverIpProvider, serverPortProvider, userResourceProvider);
  }

  public static HttpServer provideInstance(
      HttpModule module,
      Provider<String> serverIpProvider,
      Provider<Integer> serverPortProvider,
      Provider<UserResource> userResourceProvider) {
    return proxyServer(
        module, serverIpProvider.get(), serverPortProvider.get(), userResourceProvider.get());
  }

  public static HttpModule_ServerFactory create(
      HttpModule module,
      Provider<String> serverIpProvider,
      Provider<Integer> serverPortProvider,
      Provider<UserResource> userResourceProvider) {
    return new HttpModule_ServerFactory(
        module, serverIpProvider, serverPortProvider, userResourceProvider);
  }

  public static HttpServer proxyServer(
      HttpModule instance, String serverIp, int serverPort, UserResource userResource) {
    return Preconditions.checkNotNull(
        instance.server(serverIp, serverPort, userResource),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
