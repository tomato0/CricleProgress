package com.gionee.wsq.cricleprogress;

import android.content.Context;
import android.util.TypedValue;

/**
 * Created by wangshaoqiang
 * on 16-12-14.
 * 单位转换工具类
 */
public class UnitUtils {

    public static int dpToPx(int dp, Context context) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.getResources().getDisplayMetrics());
    }

    public static int spToPx(int sp,Context context) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, sp, context.getResources().getDisplayMetrics());
    }


}
