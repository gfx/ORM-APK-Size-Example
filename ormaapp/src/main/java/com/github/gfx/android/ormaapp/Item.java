package com.github.gfx.android.ormaapp;

import com.github.gfx.android.orma.annotation.PrimaryKey;
import com.github.gfx.android.orma.annotation.Table;

@Table
public class Item {

    @PrimaryKey
    public long id;
}
