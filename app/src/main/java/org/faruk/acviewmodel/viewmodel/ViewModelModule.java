package org.faruk.acviewmodel.viewmodel;

import android.arch.lifecycle.ViewModel;

import org.faruk.acviewmodel.home.ListViewModel;
import org.faruk.acviewmodel.home.SelectedRepoViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

/**
 * Created by farukyavuz on 30.03.2018.
 * Copyright (c) 2018 Hürriyet to present
 * All rights reserved.
 */
@Module
public abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(ListViewModel.class)
    abstract ViewModel bindListViewModel(ListViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(SelectedRepoViewModel.class)
    abstract ViewModel bindSelectedRepoViewModel(SelectedRepoViewModel viewModel);
}
