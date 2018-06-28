package com.tfy.wlwztfy.sp;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.reflect.TypeToken;
import com.tfy.wlwztfy.App;
import com.tfy.wlwztfy.bean.QaADto;
import com.tfy.wlwztfy.utils.EntitySerializer;

import java.util.List;

/**
 * 缓存SP数据
 * Created by Wesley on 2018/1/16.
 */

public class CacheSPManager {

    private static final String SP_CACHE_INFO = "cache_info";// 缓存数据

    //KEY
    private static final String KEY_QA = "qa";

    /**
     * 获取缓存信息 SharedPreferences
     *
     * @param context Context
     * @return SharedPreferences
     */
    private static SharedPreferences getCacheInfoSharedPreferences(
            Context context) {
        if (context == null)
            return getCacheInfoSharedPreferences(App.getApp());
        return context.getSharedPreferences(SP_CACHE_INFO, Context.MODE_PRIVATE);
    }


    /**
     * 存储问答列表
     *
     * @param context  Context
     * @param cateList 建议问答列表
     */
    public static void putQaList(Context context, List<?> cateList) {
        String json;
        try {
            json = EntitySerializer.serializerList(cateList);
        } catch (Exception e) {
            json = null;
        }
        getCacheInfoSharedPreferences(context).edit()
                .putString(KEY_QA, json).apply();
    }

    /**
     * 获取问答列表
     *
     * @param context Context
     * @return 问答列表
     */
    public static List<QaADto> getQaList(Context context) {
        String json = getCacheInfoSharedPreferences(context).getString(KEY_QA, null);
        List<QaADto> list;
        try {
            list = EntitySerializer.deserializerType(json,
                    new TypeToken<List<QaADto>>() {
                    }.getType());
        } catch (Exception e) {
            list = null;
        }
        return list;
    }

}
