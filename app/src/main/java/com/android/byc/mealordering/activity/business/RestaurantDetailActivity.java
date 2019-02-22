package com.android.byc.mealordering.activity.business;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.byc.mealordering.R;

/**
 * @author yu
 * @version 1.0
 * @date 2019/2/22 14:31
 * @description
 */
public class RestaurantDetailActivity extends AppCompatActivity implements View.OnClickListener {

        /**
         * 商品总价
         */
        TextView mListAllPrice;

        /**
         * 物品总数量
         */
        TextView mListAllNum;

        public static int SELECTPOSITION = 0;

        /**
         * 购物车布局
         */
        RelativeLayout mCarLay;


    @Override
    protected void onCreate( Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_restaurant_main);
        mListAllPrice = findViewById(R.id.m_list_all_price);
        mCarLay = findViewById(R.id.m_list_car_lay);
        mListAllNum = findViewById(R.id.m_list_num);
        mListAllNum.setOnClickListener(this);
        mCarLay.setOnClickListener(this);
        mListAllPrice.setOnClickListener(this);
        initView();
    }

    public void initView(){

        }

    @Override
    public void onClick(View view) {

    }
}
