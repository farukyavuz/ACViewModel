package org.faruk.acviewmodel.base;

import org.faruk.acviewmodel.details.DetailsFragment;
import org.faruk.acviewmodel.home.ListFragment;
import org.faruk.acviewmodel.networking.NetworkModule;
import org.faruk.acviewmodel.viewmodel.ViewModelModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by farukyavuz on 30.03.2018.
 * Copyright (c) 2018 Hürriyet to present
 * All rights reserved.
 */
@Singleton
@Component(modules = {
        NetworkModule.class,
        ViewModelModule.class,
})
public interface ApplicationComponent {

    void inject(ListFragment listFragment);

    void inject(DetailsFragment detailsFragment);
}