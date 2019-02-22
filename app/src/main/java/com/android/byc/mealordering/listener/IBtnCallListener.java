package com.android.byc.mealordering.listener;

/**
 * @author yu
 * @version 1.0
 * @date 2019/2/22 14:42
 * @description
 */
public interface IBtnCallListener {
    //发送消息到HomePageFragment
    public void homePageFragmentTransfermsg();
    //发送消息到OrderFragment
    public void orderFragmentTransfermsg();
    //发送数据到FoundFragment
    public void foundFragmentTransfermsg();
    //发生数据到MyFragment
    public void myFragmentTransfermsg();
}
