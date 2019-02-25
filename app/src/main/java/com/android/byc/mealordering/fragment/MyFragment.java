package com.android.byc.mealordering.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.byc.mealordering.R;
import com.android.byc.mealordering.activity.order.EditActivity;
import com.android.byc.mealordering.activity.order.MyCollectionActivity;
import com.android.byc.mealordering.activity.order.SoftSetting;
import com.android.byc.mealordering.activity.order.ToastActivity;
import com.android.byc.mealordering.activity.user.LoginActivity;
import com.android.byc.mealordering.common.Constant;
import com.android.byc.mealordering.listener.IBtnCallListener;

/**
 * @author yu
 * @version 1.0
 * @date 2019/2/22 14:42
 * @description
 */
public class MyFragment extends Fragment implements IBtnCallListener {

    private View view;

    private RelativeLayout contactLayout;
    private RelativeLayout editLayout;
    private RelativeLayout settingLayout;

    private Bundle bundle;
    private String account;//账号

    private TextView tv_1;//
    private TextView tv_2;
    private TextView myCollection;
    private TextView editMsg;
    private TextView toast;
    private TextView softSetting;

    //@Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_my,container,false);
        initView(view);
        return view;
    }

    public void initView(View view){
        tv_1 = (TextView)view.findViewById(R.id.text_01);
        tv_2 = (TextView)view.findViewById(R.id.text_02);
        myCollection = view.findViewById(R.id.my_collection);
        editMsg = view.findViewById(R.id.edit_msg);
        toast = view.findViewById(R.id.toast);
        softSetting = view.findViewById(R.id.soft_setting);
        myCollection.setOnClickListener(new InfooClass());
        editMsg.setOnClickListener(new InfooClass());
        toast.setOnClickListener(new InfooClass());
        softSetting.setOnClickListener(new InfooClass());
        myFragmentTransfermsg();

        contactLayout = (RelativeLayout)view.findViewById(R.id.mime_layout_02);
        //contactLayout.get(new GetTouristInfoByIdThread());

        editLayout = (RelativeLayout)view.findViewById(R.id.mime_layout_05);
        editLayout.setOnClickListener(new EditInfoClass());

        settingLayout = (RelativeLayout)view.findViewById(R.id.mime_layout_07);
        settingLayout.setOnClickListener(new SoftWareSettingClass());

    }


    class EditInfoClass implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            Intent intent = new Intent(getActivity(), LoginActivity.class);
            intent.putExtra("account", account);
            startActivity(intent);
            //getActivity().finish();
        }

    }

    class SoftWareSettingClass implements View.OnClickListener {

        @Override
        public void onClick(View v) {

        }

    }


    @Override
    public void homePageFragmentTransfermsg() {
        // TODO Auto-generated method stub

    }

    @Override
    public void orderFragmentTransfermsg() {
        // TODO Auto-generated method stub

    }

    @Override
    public void foundFragmentTransfermsg() {
        // TODO Auto-generated method stub

    }

    @Override
    public void myFragmentTransfermsg() {
        bundle = getArguments();
        account = bundle.getString("account");
        if(Constant.LoginMsg.isLogin){
            tv_1.setText("已登录");
            tv_2.setText("账号:"+account);
        }
        System.out.println("由Activity传输过来的信息:"+account);
    }

   class InfooClass implements View.OnClickListener {
       @Override
       public void onClick(View view) {
           switch (view.getId()){
               case R.id.my_collection:
                   Intent intent = new Intent(getActivity(), MyCollectionActivity.class);
                   intent.putExtra("account", account);
                   startActivity(intent);
                   break;
               case R.id.toast:
                   Intent intent1 = new Intent(getActivity(), ToastActivity.class);
                   intent1.putExtra("account", account);
                   startActivity(intent1);
                   break;
               case R.id.edit_msg:
                   Intent intent2 = new Intent(getActivity(), EditActivity.class);
                   intent2.putExtra("account", account);
                   startActivity(intent2);
                   break;
               case R.id.soft_setting:
                   Intent intent3 = new Intent(getActivity(), SoftSetting.class);
                   intent3.putExtra("account", account);
                   startActivity(intent3);
                   break;

           }
       }
   }
}
