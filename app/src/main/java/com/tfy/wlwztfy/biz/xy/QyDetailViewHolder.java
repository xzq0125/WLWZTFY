package com.tfy.wlwztfy.biz.xy;

import android.view.View;
import android.widget.TextView;

import com.tfy.wlwztfy.R;
import com.tfy.wlwztfy.base.RecyclePagerAdapter;
import com.tfy.wlwztfy.bean.AttrType;
import com.tfy.wlwztfy.bean.QyDetailBean;
import com.tfy.wlwztfy.bean.XYAttrBean;
import com.tfy.wlwztfy.bean.XYBean;

import java.util.List;

/**
 * QyDetailViewHolder
 * Created by Tse on 2018/11/28.
 */

public class QyDetailViewHolder extends RecyclePagerAdapter.PagerViewHolder<QyDetailBean> {

    TextView tvNames, tvResult;

    public QyDetailViewHolder(View itemView) {
        super(itemView);
        tvNames = itemView.findViewById(R.id.tv_names);
        tvResult = itemView.findViewById(R.id.tv_result);
    }

    @Override
    public void setData(QyDetailBean data) {

        List<XYBean> list = data.list;
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

        tvNames.setText(names.deleteCharAt(names.length() - 1).toString());
        tvResult.setText(str);
    }
}
