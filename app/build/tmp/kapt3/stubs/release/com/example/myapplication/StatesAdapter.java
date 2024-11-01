package com.example.myapplication;

import android.graphics.Typeface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myapplication.model.StateDetails;
import java.lang.Thread.State;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)B9\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0002\u0010\fJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u001eH\u0016J\u0018\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001eH\u0016J\u0014\u0010&\u001a\u00020\u000b2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00050(R\u000e\u0010\r\u001a\u00020\u000eX\u0082D\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006*"}, d2 = {"Lcom/example/myapplication/StatesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/myapplication/StatesAdapter$VH;", "stateDetails", "Ljava/util/ArrayList;", "Lcom/example/myapplication/model/StateDetails;", "Lkotlin/collections/ArrayList;", "highlightState", "", "callBackfunction", "Lkotlin/Function1;", "", "(Ljava/util/ArrayList;ZLkotlin/jvm/functions/Function1;)V", "TAG", "", "getCallBackfunction", "()Lkotlin/jvm/functions/Function1;", "getHighlightState", "()Z", "getStateDetails", "()Ljava/util/ArrayList;", "setStateDetails", "(Ljava/util/ArrayList;)V", "value", "state_selected", "getState_selected", "()Lcom/example/myapplication/model/StateDetails;", "setState_selected", "(Lcom/example/myapplication/model/StateDetails;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateList", "filter", "", "VH", "app_release"})
public final class StatesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.myapplication.StatesAdapter.VH> {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.myapplication.model.StateDetails> stateDetails;
    private final boolean highlightState = false;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.example.myapplication.model.StateDetails, kotlin.Unit> callBackfunction = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "StatesAdapter";
    @org.jetbrains.annotations.Nullable()
    private com.example.myapplication.model.StateDetails state_selected;
    
    public StatesAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.myapplication.model.StateDetails> stateDetails, boolean highlightState, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.myapplication.model.StateDetails, kotlin.Unit> callBackfunction) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.myapplication.model.StateDetails> getStateDetails() {
        return null;
    }
    
    public final void setStateDetails(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.myapplication.model.StateDetails> p0) {
    }
    
    public final boolean getHighlightState() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.example.myapplication.model.StateDetails, kotlin.Unit> getCallBackfunction() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.myapplication.model.StateDetails getState_selected() {
        return null;
    }
    
    public final void setState_selected(@org.jetbrains.annotations.Nullable()
    com.example.myapplication.model.StateDetails value) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.example.myapplication.StatesAdapter.VH onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.StatesAdapter.VH holder, int position) {
    }
    
    public final void updateList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.myapplication.model.StateDetails> filter) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/myapplication/StatesAdapter$VH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "app_release"})
    public static final class VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public VH(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}