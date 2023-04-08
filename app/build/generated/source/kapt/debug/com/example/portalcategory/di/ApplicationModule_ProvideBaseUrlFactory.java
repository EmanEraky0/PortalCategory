// Generated by Dagger (https://dagger.dev).
package com.example.portalcategory.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApplicationModule_ProvideBaseUrlFactory implements Factory<String> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideBaseUrlFactory(ApplicationModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideBaseUrl(module);
  }

  public static ApplicationModule_ProvideBaseUrlFactory create(ApplicationModule module) {
    return new ApplicationModule_ProvideBaseUrlFactory(module);
  }

  public static String provideBaseUrl(ApplicationModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideBaseUrl());
  }
}
