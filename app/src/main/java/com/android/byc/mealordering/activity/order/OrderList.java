package com.android.byc.mealordering.activity.order;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.android.byc.mealordering.R;
import com.android.byc.mealordering.fragment.Finish;
import com.android.byc.mealordering.fragment.OrderFragment;

/**
 * @author yu
 * @version 1.0
 * @date 2019/2/25 11:18
 * @description
 */
public class OrderList extends AppCompatActivity implements View.OnClickListener{
    private ImageView titleBack;
    private Button listSubmit;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_main);
        titleBack = findViewById(R.id.fml_title_back);
        listSubmit = findViewById(R.id.m_list_submit);
        titleBack.setOnClickListener(this);
        listSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (R.id.fml_title_back == view.getId()) {
            Intent intent = new Intent(this, OrderFragment.class);
            startActivity(intent);
        } else if (R.id.m_list_submit == view.getId()){
            Intent intent = new Intent(this, Finish.class);
            startActivity(intent);
        }
    }
}
