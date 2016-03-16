package com.github.gfx.android.realmapp;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Item extends RealmObject {

    @PrimaryKey
    public long id;
}
