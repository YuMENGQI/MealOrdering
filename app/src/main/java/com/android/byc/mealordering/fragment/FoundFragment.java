package com.android.byc.mealordering.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.byc.mealordering.R;

/**
 * @author yu
 * @version 1.0
 * @date 2019/2/22 14:41
 * @description
 */
public class FoundFragment extends Fragment {
    private View view;

    //@Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_found,container,false);
        return view;
    }
}
