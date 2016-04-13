package com.github.gfx.android.requeryapp;

import io.requery.Entity;
import io.requery.Generated;
import io.requery.Key;
import io.requery.Persistable;

@Entity
public abstract class Item implements Persistable {

    @Key
    @Generated
    long id;
}
