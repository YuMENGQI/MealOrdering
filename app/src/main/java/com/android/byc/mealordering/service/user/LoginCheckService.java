package com.android.byc.mealordering.service.user;

import com.android.byc.mealordering.entity.Parameter;
import com.android.byc.mealordering.service.SyncHttp;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yu
 * @version 1.0
 * @date 2019/2/22 14:44
 * @description
 */
public class LoginCheckService {
    public String loginCheck(String url,String account,String password){
        String id = "";
        //同步加载的类
        SyncHttp syncHttp = new SyncHttp();
        //数组列表
        List<Parameter> params = new ArrayList<Parameter>();
        params.add(new Parameter("account",account));
        params.add(new Parameter("password",password));
        try{
            //获取返回的数据
            String retStr = syncHttp.httpPost(url, params);
            //JSONObject类
            JSONObject jsonObject = new JSONObject(retStr);
            int retCode = jsonObject.getInt("ret");

            if(retCode == 0){
                id = account;
            }else if(retCode == 1){
                id = "error";
            }
        }catch (Exception e) {

        }

        return id;
    }
}
