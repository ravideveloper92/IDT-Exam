// Generated by Dagger (https://dagger.dev).
package com.example.myapplication.network;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class NetworkModule_ProvideStatesAPIServiceFactory implements Factory<StatesAPIService> {
  @Override
  public StatesAPIService get() {
    return provideStatesAPIService();
  }

  public static NetworkModule_ProvideStatesAPIServiceFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static StatesAPIService provideStatesAPIService() {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideStatesAPIService());
  }

  private static final class InstanceHolder {
    private static final NetworkModule_ProvideStatesAPIServiceFactory INSTANCE = new NetworkModule_ProvideStatesAPIServiceFactory();
  }
}