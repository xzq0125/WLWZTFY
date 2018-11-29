package com.tfy.wlwztfy.bean;

import android.text.TextUtils;

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

    public String qyString;

    public String getQyString() {
        if (!TextUtils.isEmpty(qyString)) {
            return qyString;
        }
        if (attrList != null) {
            StringBuilder sb = new StringBuilder();
            for (XYAttrBean attr :
                    attrList) {
                String qyTarget = XYId.getNameById(attr.targetId);
                String s = attr.info + ":" + "与" + qyTarget + "齐上阵"
                        + AttrType.getString(attr.type) + "+" + attr.value;
                sb.append(s).append("\n");
            }
            return qyString = sb.deleteCharAt(sb.length() - 1).toString();
        }
        return "";
    }
}
