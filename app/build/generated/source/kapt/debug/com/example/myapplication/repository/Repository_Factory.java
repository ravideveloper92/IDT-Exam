// Generated by Dagger (https://dagger.dev).
package com.example.myapplication.repository;

import com.example.myapplication.network.StatesAPIService;
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
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class Repository_Factory implements Factory<Repository> {
  private final Provider<StatesAPIService> apiServiceProvider;

  public Repository_Factory(Provider<StatesAPIService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public Repository get() {
    return newInstance(apiServiceProvider.get());
  }

  public static Repository_Factory create(Provider<StatesAPIService> apiServiceProvider) {
    return new Repository_Factory(apiServiceProvider);
  }

  public static Repository newInstance(StatesAPIService apiService) {
    return new Repository(apiService);
  }
}
