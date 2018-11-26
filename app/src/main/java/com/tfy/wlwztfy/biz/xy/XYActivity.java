package com.tfy.wlwztfy.biz.xy;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.tfy.wlwztfy.R;
import com.tfy.wlwztfy.bean.AttrType;
import com.tfy.wlwztfy.bean.XYAttrBean;
import com.tfy.wlwztfy.bean.XYBean;
import com.xzq.divider.Divider;

import java.util.List;

public class XYActivity extends AppCompatActivity {

    public static void start(Context context) {
        Intent starter = new Intent(context, XYActivity.class);
        context.startActivity(starter);
    }

    private TextView tvShow;
    private RecyclerView recyclerView;
    private XYAdapter xyAdapter = new XYAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xy);
        tvShow = findViewById(R.id.tv_show);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(Divider.create(this));
        recyclerView.setAdapter(xyAdapter);
        xyAdapter.setData(XyFactory.getXyList());
    }

    public void show(View view) {
        TextView textView = (TextView) view;
        if (TextUtils.equals("显示", textView.getText())) {
            textView.setText("隐藏");
            tvShow.setVisibility(View.VISIBLE);
            recyclerView.setVisibility(View.GONE);
        } else {
            textView.setText("显示");
            tvShow.setVisibility(View.GONE);
            recyclerView.setVisibility(View.VISIBLE);
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

        List[] lists  = xyAdapter.getSelectedXyList();
        List<Integer> idList = lists[1];
        List<XYBean> selectedList = lists[0];

        for (int i = 0; i < selectedList.size(); i++) {
            XYBean xyBean = selectedList.get(i);
            List<XYAttrBean> list = xyBean.attrList;
            for (int j = 0; j < list.size(); j++) {
                XYAttrBean xy = list.get(j);
                boolean isEnable = xy.isEnable(idList);
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
        tvShow.setText(str);

    }
}
