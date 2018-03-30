package org.faruk.acviewmodel.model;

import com.google.auto.value.AutoValue;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

/**
 * Created by farukyavuz on 29.03.2018.
 * Copyright (c) 2018 Hürriyet to present
 * All rights reserved.
 */
@AutoValue
public abstract class User {
    public abstract String login();

    public static JsonAdapter<User> moshiAdapter(Moshi moshi) {
        return new AutoValue_User.MoshiJsonAdapter(moshi);
    }
}

//public class User {
//    public final String login;
//
//    public User(String login) {
//        this.login = login;
//    }
//}