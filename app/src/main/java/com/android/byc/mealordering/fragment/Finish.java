package com.android.byc.mealordering.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.android.byc.mealordering.R;

/**
 * @author yu
 * @version 1.0
 * @date 2019/2/25 11:32
 * @description
 */
public class Finish extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list_order);
    }
}
