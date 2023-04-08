// Generated by Dagger (https://dagger.dev).
package com.example.portalcategory.di;

import com.example.portalcategory.data.api.ApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApplicationModule_ProvideApiServiceFactory implements Factory<ApiService> {
  private final ApplicationModule module;

  private final Provider<Retrofit> retrofitProvider;

  public ApplicationModule_ProvideApiServiceFactory(ApplicationModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ApiService get() {
    return provideApiService(module, retrofitProvider.get());
  }

  public static ApplicationModule_ProvideApiServiceFactory create(ApplicationModule module,
      Provider<Retrofit> retrofitProvider) {
    return new ApplicationModule_ProvideApiServiceFactory(module, retrofitProvider);
  }

  public static ApiService provideApiService(ApplicationModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.provideApiService(retrofit));
  }
}
