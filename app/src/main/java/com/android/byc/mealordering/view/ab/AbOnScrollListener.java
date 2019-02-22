package com.android.byc.mealordering.view.ab;

/**
 * @author yu
 * @version 1.0
 * @date 2019/2/22 14:48
 * @description
 */
public interface AbOnScrollListener {
    public void onScroll(int arg1);

    /**
     * ����ֹͣ.
     */
    public void onScrollStoped();

    /**
     * �����������.
     */
    public void onScrollToLeft();

    /**
     * ���������ұ�.
     */
    public void onScrollToRight();
}
