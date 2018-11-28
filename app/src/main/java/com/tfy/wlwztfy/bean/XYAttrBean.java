package com.tfy.wlwztfy.bean;

import java.util.List;

/**
 * 侠影属性实体
 * Created by Tse on 2018/11/25.
 */

public class XYAttrBean {
    public int type;//类型
    public int value;//值
    public String info;//描述信息
    public boolean isEnable;//是否激活
    public int targetId;//情缘id

    public boolean isEnable(List<XYBean> list) {
        if (list != null) {
            for (XYBean xy :
                    list) {
                if (xy.id == targetId) {
                    isEnable = true;
                    break;
                }
            }
        }
        return isEnable;
    }
}
