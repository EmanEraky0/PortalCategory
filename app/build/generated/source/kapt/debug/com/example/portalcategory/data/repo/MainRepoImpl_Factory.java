// Generated by Dagger (https://dagger.dev).
package com.example.portalcategory.data.repo;

import com.example.portalcategory.data.api.ApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainRepoImpl_Factory implements Factory<MainRepoImpl> {
  private final Provider<ApiService> apiServiceProvider;

  public MainRepoImpl_Factory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public MainRepoImpl get() {
    return newInstance(apiServiceProvider.get());
  }

  public static MainRepoImpl_Factory create(Provider<ApiService> apiServiceProvider) {
    return new MainRepoImpl_Factory(apiServiceProvider);
  }

  public static MainRepoImpl newInstance(ApiService apiService) {
    return new MainRepoImpl(apiService);
  }
}
