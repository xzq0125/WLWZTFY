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
                    boolean isQyEnable = xy.isQyEnable(list);
                    if (!isQyEnable) {
                        continue;
                    }
                    count++;
                    double rate = 0;
                    if (xy.type == AttrType.GONGJI) {
                        gongji += xy.value;
                        rate = 363 / 120;
                    } else if (xy.type == AttrType.FANGYU) {
                        fangyu += xy.value;
                        rate = 363 / 120;
                    } else if (xy.type == AttrType.SHENGMING) {
                        shengming += xy.value;
                        rate = 174 / 5800;
                    } else if (xy.type == AttrType.ZHENQI) {
                        zhenqi += xy.value;
                        rate = 81 / 510;
                    } else if (xy.type == AttrType.MINGZHONG) {
                        mingzhong += xy.value;
                        rate = 61 / 290;
                    } else if (xy.type == AttrType.DUOSHAN) {
                        duoshan += xy.value;
                        rate = 63 / 90;
                    } else if (xy.type == AttrType.BAOJI) {
                        baoji += xy.value;
                        rate = 54 / 90;
                    } else if (xy.type == AttrType.BAOKANG) {
                        baokang += xy.value;
                        rate = 53 / 290;
                    } else if (xy.type == AttrType.BAOSHANGJIA) {
                        baoshangjia += xy.value;
                        rate = 72 / 26;
                    } else if (xy.type == AttrType.BAOSHANGJIAN) {
                        baoshangjian += xy.value;
                        rate = 72 / 26;
                    } else if (xy.type == AttrType.QUANJINGTONG) {
                        quanjingtong += xy.value;
                        rate = 7 / 3;
                    } else if (xy.type == AttrType.QUANKANGXING) {
                        quankangxing += xy.value;
                        rate = 26 / 11;
                    }
                    zhanli += (rate * xy.value);
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

    private int count;
    private int zhanli;

    public String getValue() {
        return "情缘激活" + count + "，战力+" + zhanli + "\n" + "（模拟战力）";
    }
}
