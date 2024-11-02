package com.example.myapplication.ui;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.example.myapplication.R;
import com.example.myapplication.adapter.StatesAdapter;
import com.example.myapplication.databinding.FragmentHomeBinding;
import com.example.myapplication.model.Response;
import com.example.myapplication.model.StateDetails;
import dagger.hilt.android.AndroidEntryPoint;
import com.example.myapplication.viewmodel.StatesVM;
import kotlinx.coroutines.Dispatchers;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\u0012\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0014\u0010 \u001a\u00020\u0013*\u00020\u00062\u0006\u0010!\u001a\u00020\"H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006#"}, d2 = {"Lcom/example/myapplication/ui/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "TAG", "", "_binding", "Lcom/example/myapplication/databinding/FragmentHomeBinding;", "binding", "getBinding", "()Lcom/example/myapplication/databinding/FragmentHomeBinding;", "searchAdapter", "Lcom/example/myapplication/adapter/StatesAdapter;", "viewModel", "Lcom/example/myapplication/viewmodel/StatesVM;", "getViewModel", "()Lcom/example/myapplication/viewmodel/StatesVM;", "viewModel$delegate", "Lkotlin/Lazy;", "filter", "", "keyword", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "detailLoader", "stateDetails", "Lcom/example/myapplication/model/StateDetails;", "app_release"})
public final class HomeFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "HomeFragment";
    private com.example.myapplication.adapter.StatesAdapter searchAdapter;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private com.example.myapplication.databinding.FragmentHomeBinding _binding;
    
    public HomeFragment() {
        super();
    }
    
    private final com.example.myapplication.viewmodel.StatesVM getViewModel() {
        return null;
    }
    
    private final com.example.myapplication.databinding.FragmentHomeBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void detailLoader(com.example.myapplication.databinding.FragmentHomeBinding $this$detailLoader, com.example.myapplication.model.StateDetails stateDetails) {
    }
    
    private final void filter(java.lang.String keyword) {
    }
}