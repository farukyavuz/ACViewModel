package org.faruk.acviewmodel.model;

import com.ryanharter.auto.value.moshi.MoshiAdapterFactory;
import com.squareup.moshi.JsonAdapter;

/**
 * Created by farukyavuz on 30.03.2018.
 * Copyright (c) 2018 Hürriyet to present
 * All rights reserved.
 */
@MoshiAdapterFactory
public abstract class ModelAdapterFactory implements JsonAdapter.Factory {

    public static JsonAdapter.Factory create() {
        return new AutoValueMoshi_ModelAdapterFactory();
    }
}
