package org.fretron.usermanager.component;

import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.fretron.usermanager.commonModules.ConfigModule;
import org.fretron.usermanager.commonModules.DatabaseModule;
import org.fretron.usermanager.commonModules.HttpModule;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private DaggerAppComponent(Builder builder) {}

  public static Builder builder() {
    return new Builder();
  }

  public static AppComponent create() {
    return new Builder().build();
  }

  public static final class Builder {
    private Builder() {}

    public AppComponent build() {
      return new DaggerAppComponent(this);
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder configModule(ConfigModule configModule) {
      Preconditions.checkNotNull(configModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder databaseModule(DatabaseModule databaseModule) {
      Preconditions.checkNotNull(databaseModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder httpModule(HttpModule httpModule) {
      Preconditions.checkNotNull(httpModule);
      return this;
    }
  }
}
