// Generated by Dagger (https://dagger.dev).
package com.example.myapplication.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class StatesVM_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
  @Override
  public Boolean get() {
    return provide();
  }

  public static StatesVM_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static boolean provide() {
    return StatesVM_HiltModules.KeyModule.provide();
  }

  private static final class InstanceHolder {
    private static final StatesVM_HiltModules_KeyModule_ProvideFactory INSTANCE = new StatesVM_HiltModules_KeyModule_ProvideFactory();
  }
}