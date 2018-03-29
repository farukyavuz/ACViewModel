package org.faruk.acviewmodel.networking;

import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

/**
 * Created by farukyavuz on 29.03.2018.
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
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(MoshiConverterFactory.create())
                .build();
    }

    private RepoApi() {
    }

}
