package com.example.myapplication.viewmodel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.lifecycle.ViewModel;
import com.example.myapplication.model.DataWrapper;
import com.example.myapplication.model.Response;
import com.example.myapplication.model.StateDetails;
import com.example.myapplication.repository.Repository;
import com.google.gson.Gson;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import java.io.IOException;
import java.net.SocketTimeoutException;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0017\u001a\u00020\u0018H\u0007J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u000e\u0010\u001c\u001a\u00020\u0018H\u0082@\u00a2\u0006\u0002\u0010\u001dJ\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0013J\u000e\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR#\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\""}, d2 = {"Lcom/example/myapplication/viewmodel/StatesVM;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/myapplication/repository/Repository;", "context", "Landroid/content/Context;", "(Lcom/example/myapplication/repository/Repository;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "getStatesListLv", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/example/myapplication/model/Response;", "", "Lcom/example/myapplication/model/StateDetails;", "getGetStatesListLv", "()Lkotlinx/coroutines/flow/StateFlow;", "getRepository", "()Lcom/example/myapplication/repository/Repository;", "stateDetailsflow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "statesList", "getStatesList", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "fetchAllStatesList", "", "getJsonDataFromAsset", "", "fileName", "getMockData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSATScore", "updateStates", "stateDetails", "Companion", "app_release"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class StatesVM extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.myapplication.repository.Repository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.myapplication.model.Response<java.util.List<com.example.myapplication.model.StateDetails>>> statesList = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.myapplication.model.StateDetails> stateDetailsflow = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "StatesVM";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.myapplication.viewmodel.StatesVM.Companion Companion = null;
    
    @javax.inject.Inject()
    public StatesVM(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.repository.Repository repository, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myapplication.repository.Repository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<com.example.myapplication.model.Response<java.util.List<com.example.myapplication.model.StateDetails>>> getStatesList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.myapplication.model.Response<java.util.List<com.example.myapplication.model.StateDetails>>> getGetStatesListLv() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void fetchAllStatesList() {
    }
    
    private final java.lang.Object getMockData(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<com.example.myapplication.model.StateDetails> getSATScore() {
        return null;
    }
    
    public final void updateStates(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.model.StateDetails stateDetails) {
    }
    
    private final java.lang.String getJsonDataFromAsset(android.content.Context context, java.lang.String fileName) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/myapplication/viewmodel/StatesVM$Companion;", "", "()V", "TAG", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}