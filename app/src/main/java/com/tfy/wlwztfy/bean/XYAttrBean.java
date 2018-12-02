package com.tfy.wlwztfy.bean;

import java.util.List;

/**
 * 侠影属性实体
 * Created by Tse on 2018/11/25.
 */

public class XYAttrBean {
    public int type;//类型
    public int value;//值
    public String qyTitle;//情缘标题
    public boolean isEnable;//是否激活
    public int targetId;//情缘id


    /**
     * 情缘是否激活
     *
     * @param list 侠影列表（6个一组）
     * @return 是否激活
     */
    public boolean isQyEnable(List<XYBean> list) {
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
