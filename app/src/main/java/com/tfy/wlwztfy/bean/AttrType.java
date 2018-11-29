package com.tfy.wlwztfy.bean;

/**
 * AttrType
 * Created by Tse on 2018/11/25.
 */

public class AttrType {
    public static final int GONGJI = 0;
    public static final int FANGYU = 1;
    public static final int SHENGMING = 2;
    public static final int ZHENQI = 3;
    public static final int MINGZHONG = 4;
    public static final int DUOSHAN = 5;
    public static final int BAOJI = 6;
    public static final int BAOKANG = 7;
    public static final int BAOSHANGJIA = 8;
    public static final int BAOSHANGJIAN = 9;

    public static final int QUANJINGTONG = 10;
    public static final int QUANKANGXING= 11;

    public static String getString(int type){
        switch (type){
            case GONGJI:return "攻击";
            case FANGYU:return "防御";
            case SHENGMING:return "生命";
            case ZHENQI:return "真气";
            case MINGZHONG:return "命中";
            case DUOSHAN:return "躲闪";
            case BAOJI:return "暴击";
            case BAOKANG:return "暴抗";
            case BAOSHANGJIA:return "暴伤加成";
            case BAOSHANGJIAN:return "暴伤减免";
            case QUANJINGTONG:return "全精通";
            case QUANKANGXING:return "全抗性";
        }
        return "";
    }

}
