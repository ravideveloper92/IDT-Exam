package com.example.myapplication.network;

import com.example.myapplication.model.StateDetails;
import retrofit2.Response;
import retrofit2.http.GET;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/myapplication/network/StatesAPIService;", "", "StatesList", "Lretrofit2/Response;", "", "Lcom/example/myapplication/model/StateDetails;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public abstract interface StatesAPIService {
    
    @retrofit2.http.GET(value = "states")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object StatesList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.example.myapplication.model.StateDetails>>> $completion);
}