package com.tfy.wlwztfy.bean;

import android.text.TextUtils;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

/**
 * 侠影情缘详情实体
 * Created by Tse on 2018/11/28.
 */

public class QyDetailBean {
    public String name;
    public String result;
    public List<XYBean> list;

    public void setText(TextView tvNames, TextView tvResult) {

        if (!TextUtils.isEmpty(name)) {
            tvNames.setText(name);
        }

        if (!TextUtils.isEmpty(result) && tvResult != null) {
            tvResult.setText(result);
            return;
        }

        if (list == null) {
            return;
        }

        String str;
        int gongji = 0;
        int fangyu = 0;
        int shengming = 0;
        int zhenqi = 0;
        int mingzhong = 0;
        int duoshan = 0;
        int baoji = 0;
        int baokang = 0;
        int baoshangjia = 0;
        int baoshangjian = 0;
        int quanjingtong = 0;
        int quankangxing = 0;

        StringBuilder names = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            XYBean xyBean = list.get(i);
            names.append(xyBean.name).append("、");
            if (tvResult != null) {
                List<XYAttrBean> attrList = xyBean.attrList;
                for (int j = 0; j < attrList.size(); j++) {
                    XYAttrBean xy = attrList.get(j);
                    boolean isEnable = xy.isEnable(list);
                    if (!isEnable) {
                        continue;
                    }
                    gongji += xy.type == AttrType.GONGJI ? xy.value : 0;
                    fangyu += xy.type == AttrType.FANGYU ? xy.value : 0;
                    shengming += xy.type == AttrType.SHENGMING ? xy.value : 0;
                    zhenqi += xy.type == AttrType.ZHENQI ? xy.value : 0;
                    mingzhong += xy.type == AttrType.MINGZHONG ? xy.value : 0;
                    duoshan += xy.type == AttrType.DUOSHAN ? xy.value : 0;
                    baoji += xy.type == AttrType.BAOJI ? xy.value : 0;
                    baokang += xy.type == AttrType.BAOKANG ? xy.value : 0;
                    baoshangjia += xy.type == AttrType.BAOSHANGJIA ? xy.value : 0;
                    baoshangjian += xy.type == AttrType.BAOSHANGJIAN ? xy.value : 0;
                    quanjingtong += xy.type == AttrType.QUANJINGTONG ? xy.value : 0;
                    quankangxing += xy.type == AttrType.QUANKANGXING ? xy.value : 0;
                }
            }
        }
        str = "攻击+" + gongji + "\n" +
                "防御+" + fangyu + "\n" +
                "生命+" + shengming + "\n" +
                "真气+" + zhenqi + "\n" +
                "命中+" + mingzhong + "\n" +
                "躲闪+" + duoshan + "\n" +
                "暴击+" + baoji + "\n" +
                "暴抗+" + baokang + "\n" +
                "暴伤加成+" + baoshangjia + "\n" +
                "暴伤减免+" + baoshangjian + "\n" +
                "全精通+" + quanjingtong + "\n" +
                "全抗性+" + quankangxing;

        tvNames.setText(name = names.deleteCharAt(names.length() - 1).toString());
        if (tvResult != null) {
            tvResult.setText(result = str);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QyDetailBean bean = (QyDetailBean) o;
        return equals(name, bean.name);
    }

    @Override
    public int hashCode() {
        return hash(name);
    }

    static boolean equals(Object a, Object b) {
        return (a == b) || (a != null && a.equals(b));
    }

    static int hash(Object... values) {
        return Arrays.hashCode(values);
    }

}
