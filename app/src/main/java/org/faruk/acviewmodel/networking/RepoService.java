package org.faruk.acviewmodel.networking;

import org.faruk.acviewmodel.model.Repo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by farukyavuz on 29.03.2018.
 * Copyright (c) 2018 Hürriyet to present
 * All rights reserved.
 */
public interface RepoService {

    @GET("orgs/Google/repos")
    Call<List<Repo>> getRepositories();

}