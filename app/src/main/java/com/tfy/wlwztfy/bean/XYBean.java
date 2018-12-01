package com.tfy.wlwztfy.bean;

import android.text.TextUtils;

import com.tfy.wlwztfy.R;

import java.util.List;

/**
 * XYBean
 * Created by Tse on 2018/11/25.
 */

public class XYBean {
    public int id;//id
    public String name;//名字
    public List<XYAttrBean> attrList;//情缘列表
    public boolean isSelected;//是否选中
    public int lev;
    private String qyString;

    public String getQyString() {
        if (!TextUtils.isEmpty(qyString)) {
            return qyString;
        }
        if (attrList != null) {
            StringBuilder sb = new StringBuilder();
            for (XYAttrBean attr :
                    attrList) {
                String qyTarget = XYId.getNameById(attr.targetId);
                String s = attr.qyTitle + ":" + "与" + qyTarget + "齐上阵,"
                        + AttrType.getString(attr.type) + "+" + attr.value;
                sb.append(s).append("\n");
            }
            return qyString = sb.deleteCharAt(sb.length() - 1).toString();
        }
        return "";
    }

    public int getLevColor() {
        switch (lev){
            case XyLev.ORANGE:return R.color.color_lev_1;
            case XyLev.VIOLET:return R.color.color_lev_2;
            case XyLev.BLUE:return R.color.color_lev_3;
            case XyLev.GREEN:return R.color.color_lev_4;
            default: return  R.color.colorFF333333;
        }
    }
}
