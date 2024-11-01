package com.example.myapplication.network;

import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;

@OriginatingElement(
    topLevelClass = AppModule.class
)
@InstallIn(SingletonComponent.class)
@Module(
    includes = AppModule.class
)
public final class HiltWrapper_AppModule {
}
