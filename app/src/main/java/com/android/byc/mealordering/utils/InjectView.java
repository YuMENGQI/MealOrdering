package com.android.byc.mealordering.utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author yu
 * @version 1.0
 * @date 2019/2/22 14:46
 * @description
 */
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface InjectView {
    /**
     * The resource id of the View to find and inject.
     */
    public int value();
}
