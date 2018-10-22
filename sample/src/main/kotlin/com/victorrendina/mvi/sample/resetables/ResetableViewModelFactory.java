package com.victorrendina.mvi.sample.resetables;

import android.support.annotation.Nullable;
import com.victorrendina.mvi.di.InjectableViewModelFactory;
import com.victorrendina.mvi.MviArgs;
import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

// TODO This factory needs to be automatically generated by the @MviViewModel annotation
public class ResetableViewModelFactory implements InjectableViewModelFactory<ResettableViewModel, ResettableViewState, MviArgs> {

    @Inject
    public ResetableViewModelFactory() {
    }

    @NotNull
    @Override
    public ResettableViewModel create(@NotNull ResettableViewState initialState, @Nullable MviArgs arguments) {
        return new ResettableViewModel(initialState);
    }
}
