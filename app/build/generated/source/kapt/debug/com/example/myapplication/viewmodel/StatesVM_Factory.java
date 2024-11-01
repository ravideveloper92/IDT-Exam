// Generated by Dagger (https://dagger.dev).
package com.example.myapplication.viewmodel;

import android.content.Context;
import com.example.myapplication.repository.Repository;
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
public final class StatesVM_Factory implements Factory<StatesVM> {
  private final Provider<Repository> repositoryProvider;

  private final Provider<Context> contextProvider;

  public StatesVM_Factory(Provider<Repository> repositoryProvider,
      Provider<Context> contextProvider) {
    this.repositoryProvider = repositoryProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public StatesVM get() {
    return newInstance(repositoryProvider.get(), contextProvider.get());
  }

  public static StatesVM_Factory create(Provider<Repository> repositoryProvider,
      Provider<Context> contextProvider) {
    return new StatesVM_Factory(repositoryProvider, contextProvider);
  }

  public static StatesVM newInstance(Repository repository, Context context) {
    return new StatesVM(repository, context);
  }
}
