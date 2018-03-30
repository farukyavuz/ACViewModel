package org.faruk.acviewmodel.model;

import com.google.auto.value.AutoValue;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import javax.annotation.Nullable;

/**
 * Created by farukyavuz on 29.03.2018.
 * Copyright (c) 2018 Hürriyet to present
 * All rights reserved.
 */
@AutoValue
public abstract class Repo {
    public abstract long id();

    public abstract String name();

    @Nullable
    public abstract String description();

    public abstract User owner();

    @Json(name = "stargazers_count")
    public abstract long stars();

    @Json(name = "forks_count")
    public abstract long forks();

    public static JsonAdapter<Repo> moshiAdapter(Moshi moshi) {
        return new AutoValue_Repo.MoshiJsonAdapter(moshi);
    }

}
