package org.faruk.acviewmodel.networking;

import com.squareup.moshi.Moshi;

import org.faruk.acviewmodel.model.ModelAdapterFactory;

import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

/**
 * Created by farukyavuz on 30.03.2018.
 * Copyright (c) 2018 Hürriyet to present
 * All rights reserved.
 */
public class RepoApi {

    private static final String BASE_URL = "https://api.github.com/";

    private static Retrofit retrofit;
    private static RepoService repoService;

    public static RepoService getInstance() {
        if (repoService != null) {
            return repoService;
        }
        if (retrofit == null) {
            initializeRetrofit();
        }
        repoService = retrofit.create(RepoService.class);
        return repoService;
    }

    private static void initializeRetrofit() {
        Moshi moshi = new Moshi.Builder()
                .add(ModelAdapterFactory.create())
                .build();

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(MoshiConverterFactory.create(moshi))
                .build();

//        retrofit = new Retrofit.Builder()
//                .baseUrl(BASE_URL)
//                .addConverterFactory(MoshiConverterFactory.create())
//                .build();
    }

    private RepoApi() {

    }
}
