package com.tfy.wlwztfy.biz.xy;

import com.tfy.wlwztfy.bean.AttrType;
import com.tfy.wlwztfy.bean.XYAttrBean;
import com.tfy.wlwztfy.bean.XYBean;
import com.tfy.wlwztfy.bean.XYId;

import java.util.ArrayList;
import java.util.List;

/**
 * XyFactory
 * Created by Tse on 2018/11/26.
 */

public class XyFactory {


    public static List<XYBean> getXyList() {

        List<XYBean> list = new ArrayList<>();

        //==========佟湘玉=============//
        XYBean bean = new XYBean();
        bean.name = "佟湘玉";
        bean.id = XYId.txy;
        bean.attrList = new ArrayList<>();

        //吕轻侯
        XYAttrBean attr = new XYAttrBean();
        attr.type = AttrType.QUANJINGTONG;
        attr.info = "账房先生";
        attr.value = 320;
        attr.targetId = XYId.lqh;
        bean.attrList.add(attr);

        //白展堂
        attr = new XYAttrBean();
        attr.type = AttrType.BAOJI;
        attr.info = "芳心暗许";
        attr.value = 1750;
        attr.targetId = XYId.bzt;
        bean.attrList.add(attr);

        //郭芙蓉
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.info = "同福女主";
        attr.value = 730;
        attr.targetId = XYId.gfr;
        bean.attrList.add(attr);

        //莫小贝
        attr = new XYAttrBean();
        attr.type = AttrType.DUOSHAN;
        attr.info = "侄嫂之情";
        attr.value = 1750;
        attr.targetId = XYId.mxb;
        bean.attrList.add(attr);

        list.add(bean);

        //==========郭芙蓉=============//

        bean = new XYBean();
        bean.name = "郭芙蓉";
        bean.id = XYId.gfr;
        bean.attrList = new ArrayList<>();

        //郭巨侠
        attr = new XYAttrBean();
        attr.type = AttrType.BAOSHANGJIA;
        attr.info = "严父叛女";
        attr.value = 320;
        attr.targetId = XYId.gjx;
        bean.attrList.add(attr);

        //吕轻侯
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.info = "欢喜冤家";
        attr.value = 58300;
        attr.targetId = XYId.lqh;
        bean.attrList.add(attr);

        //佟湘玉
        attr = new XYAttrBean();
        attr.type = AttrType.ZHENQI;
        attr.info = "打工还债";
        attr.value = 10200;
        attr.targetId = XYId.txy;
        bean.attrList.add(attr);

        //祝无双
        attr = new XYAttrBean();
        attr.type = AttrType.MINGZHONG;
        attr.info = "才艺比赛";
        attr.value = 5850;
        attr.targetId = XYId.zws;
        bean.attrList.add(attr);

        list.add(bean);

        //==========祝无双=============//
        bean = new XYBean();
        bean.name = "祝无双";
        bean.id = XYId.zws;
        bean.attrList = new ArrayList<>();

        //白展堂
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.info = "葵花结缘";
        attr.value = 58300;
        attr.targetId = XYId.bzt;
        bean.attrList.add(attr);

        //李秀莲
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.info = "厨艺达人";
        attr.value = 730;
        attr.targetId = XYId.lxl;
        bean.attrList.add(attr);

        //吕轻侯
        attr = new XYAttrBean();
        attr.type = AttrType.QUANKANGXING;
        attr.info = "情深缘浅";
        attr.value = 320;
        attr.targetId = XYId.lqh;
        bean.attrList.add(attr);

        //燕小六
        attr = new XYAttrBean();
        attr.type = AttrType.BAOSHANGJIA;
        attr.info = "终得良人";
        attr.value = 320;
        attr.targetId = XYId.yxl;
        bean.attrList.add(attr);

        list.add(bean);

        //==========吕轻侯=============//
        bean = new XYBean();
        bean.name = "吕轻侯";
        bean.id = XYId.lqh;
        bean.attrList = new ArrayList<>();

        //佟湘玉
        attr = new XYAttrBean();
        attr.type = AttrType.BAOJI;
        attr.info = "客栈易主";
        attr.value = 1750;
        attr.targetId = XYId.txy;
        bean.attrList.add(attr);

        //郭巨侠
        attr = new XYAttrBean();
        attr.type = AttrType.QUANKANGXING;
        attr.info = "未来岳父";
        attr.value = 320;
        attr.targetId = XYId.gjx;
        bean.attrList.add(attr);

        //姬无命
        attr = new XYAttrBean();
        attr.type = AttrType.QUANJINGTONG;
        attr.info = "扬名关中";
        attr.value = 320;
        attr.targetId = XYId.jwm;
        bean.attrList.add(attr);

        //郭芙蓉
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.info = "相识相恋";
        attr.value = 730;
        attr.targetId = XYId.gfr;
        bean.attrList.add(attr);

        list.add(bean);

        //==========李秀莲=============//
        bean = new XYBean();
        bean.name = "李秀莲";
        bean.id = XYId.lxl;
        bean.attrList = new ArrayList<>();

        //佟湘玉
        attr = new XYAttrBean();
        attr.type = AttrType.BAOSHANGJIA;
        attr.info = "客栈大厨";
        attr.value = 320;
        attr.targetId = XYId.txy;
        bean.attrList.add(attr);

        //祝无双
        attr = new XYAttrBean();
        attr.type = AttrType.DUOSHAN;
        attr.info = "无心插柳";
        attr.value = 1750;
        attr.targetId = XYId.zws;
        bean.attrList.add(attr);

        //郭芙蓉
        attr = new XYAttrBean();
        attr.type = AttrType.BAOKANG;
        attr.info = "真假掌法";
        attr.value = 5850;
        attr.targetId = XYId.gfr;
        bean.attrList.add(attr);

        //杨蕙兰
        attr = new XYAttrBean();
        attr.type = AttrType.MINGZHONG;
        attr.info = "苦苦单恋";
        attr.value = 5850;
        attr.targetId = XYId.yhl;
        bean.attrList.add(attr);

        list.add(bean);

        //==========南宫残花=============//
        bean = new XYBean();
        bean.name = "南宫残花";
        bean.id = XYId.ngch;
        bean.attrList = new ArrayList<>();

        //佟湘玉
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.info = "唠叨师妹";
        attr.value = 550;
        attr.targetId = XYId.txy;
        bean.attrList.add(attr);

        //祝无双
        attr = new XYAttrBean();
        attr.type = AttrType.DUOSHAN;
        attr.info = "胸怀爱心";
        attr.value = 1320;
        attr.targetId = XYId.zws;
        bean.attrList.add(attr);

        //吕轻侯
        attr = new XYAttrBean();
        attr.type = AttrType.QUANJINGTONG;
        attr.info = "唠叨之神";
        attr.value = 240;
        attr.targetId = XYId.lqh;
        bean.attrList.add(attr);

        //李秀莲
        attr = new XYAttrBean();
        attr.type = AttrType.DUOSHAN;
        attr.info = "素食主义";
        attr.value = 1320;
        attr.targetId = XYId.lxl;
        bean.attrList.add(attr);

        list.add(bean);


        //==========公孙乌龙=============//
        bean = new XYBean();
        bean.name = "公孙乌龙";
        bean.id = XYId.gswl;
        bean.attrList = new ArrayList<>();

        //岳松涛
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.info = "反派高手";
        attr.value = 910;
        attr.targetId = XYId.yst;
        bean.attrList.add(attr);

        //白三娘
        attr = new XYAttrBean();
        attr.type = AttrType.BAOJI;
        attr.info = "千里追杀";
        attr.value = 2190;
        attr.targetId = XYId.bsn;
        bean.attrList.add(attr);

        //吕轻侯
        attr = new XYAttrBean();
        attr.type = AttrType.BAOKANG;
        attr.info = "拜师求道";
        attr.value = 7320;
        attr.targetId = XYId.lqh;
        bean.attrList.add(attr);

        //姬无命
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.info = "倒霉徒儿";
        attr.value = 910;
        attr.targetId = XYId.jwm;
        bean.attrList.add(attr);

        list.add(bean);


        //==========莫小宝=============//
        bean = new XYBean();
        bean.name = "莫小宝";
        bean.id = XYId.mxb2;
        bean.attrList = new ArrayList<>();

        //凌腾云
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.info = "持正不阿";
        attr.value = 91000;
        attr.targetId = XYId.lty;
        bean.attrList.add(attr);

        //展堂
        attr = new XYAttrBean();
        attr.type = AttrType.MINGZHONG;
        attr.info = "展堂";
        attr.value = 9150;
        attr.targetId = XYId.zt;
        bean.attrList.add(attr);

        //祝小芸
        attr = new XYAttrBean();
        attr.type = AttrType.BAOJI;
        attr.info = "情如兄妹";
        attr.value = 2738;
        attr.targetId = XYId.zxy;
        bean.attrList.add(attr);

        //银长老
        attr = new XYAttrBean();
        attr.type = AttrType.ZHENQI;
        attr.info = "立场不同";
        attr.value = 15875;
        attr.targetId = XYId.yzl;
        bean.attrList.add(attr);
        list.add(bean);

        //==========断指轩辕=============//
        bean = new XYBean();
        bean.name = "断指轩辕";
        bean.id = XYId.dzxy;
        bean.attrList = new ArrayList<>();

        //佟伯达
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.info = "父母恩勤";
        attr.value = 91000;
        attr.targetId = XYId.tbd;
        bean.attrList.add(attr);

        //李秀莲
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.info = "含辛茹苦";
        attr.value = 1138;
        attr.targetId = XYId.lxl;
        bean.attrList.add(attr);

        //公孙乌龙
        attr = new XYAttrBean();
        attr.type = AttrType.MINGZHONG;
        attr.info = "水火不容";
        attr.value = 9150;
        attr.targetId = XYId.gswl;
        bean.attrList.add(attr);

        //姬无病
        attr = new XYAttrBean();
        attr.type = AttrType.ZHENQI;
        attr.info = "不共戴天";
        attr.value = 15875;
        attr.targetId = XYId.jwb;
        bean.attrList.add(attr);
        list.add(bean);

        //==========画画老人=============//
        bean = new XYBean();
        bean.name = "画画老人";
        bean.id = XYId.hhlr;
        bean.attrList = new ArrayList<>();

        //江小道
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.info = "不堪一击";
        attr.value = 91000;
        attr.targetId = XYId.jxd;
        bean.attrList.add(attr);

        //断指轩辕
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.info = "白发婆娑";
        attr.value = 1138;
        attr.targetId = XYId.dzxy;
        bean.attrList.add(attr);

        //姬无力
        attr = new XYAttrBean();
        attr.type = AttrType.BAOJI;
        attr.info = "天壤之别";
        attr.value = 2738;
        attr.targetId = XYId.jwl;
        bean.attrList.add(attr);

        //佟伯达
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.info = "老而益壮";
        attr.value = 1138;
        attr.targetId = XYId.tbd;
        bean.attrList.add(attr);
        list.add(bean);

        //==========上官云顿=============//
        bean = new XYBean();
        bean.name = "上官云顿";
        bean.id = XYId.sgyd;
        bean.attrList = new ArrayList<>();

        //岳松涛
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.info = "黑白两道";
        attr.value = 730;
        attr.targetId = XYId.yst;
        bean.attrList.add(attr);

        //公孙乌龙
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.info = "独行杀手";
        attr.value = 730;
        attr.targetId = XYId.gswl;
        bean.attrList.add(attr);

        //姬无命
        attr = new XYAttrBean();
        attr.type = AttrType.QUANKANGXING;
        attr.info = "心狠手辣";
        attr.value = 320;
        attr.targetId = XYId.jwm;
        bean.attrList.add(attr);

        //李秀莲
        attr = new XYAttrBean();
        attr.type = AttrType.QUANJINGTONG;
        attr.info = "空手拿蟹";
        attr.value = 320;
        attr.targetId = XYId.lxl;
        bean.attrList.add(attr);
        list.add(bean);

        //==========展红菱=============//
        bean = new XYBean();
        bean.name = "展红菱";
        bean.id = XYId.zhl;
        bean.attrList = new ArrayList<>();

        //白展堂
        attr = new XYAttrBean();
        attr.type = AttrType.BAOJI;
        attr.info = "曾经沧海";
        attr.value = 1750;
        attr.targetId = XYId.bzt;
        bean.attrList.add(attr);

        //郭芙蓉
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.info = "侠女之风";
        attr.value = 58300;
        attr.targetId = XYId.gfr;
        bean.attrList.add(attr);

        //追风
        attr = new XYAttrBean();
        attr.type = AttrType.DUOSHAN;
        attr.info = "捕快神侣";
        attr.value = 1750;
        attr.targetId = XYId.zf;
        bean.attrList.add(attr);

        //吕轻侯
        attr = new XYAttrBean();
        attr.type = AttrType.BAOSHANGJIA;
        attr.info = "神笔书生";
        attr.value = 320;
        attr.targetId = XYId.lqh;
        bean.attrList.add(attr);
        list.add(bean);

        //==========金长老=============//
        bean = new XYBean();
        bean.name = "金长老";
        bean.id = XYId.jzl;
        bean.attrList = new ArrayList<>();

        //银长老
        attr = new XYAttrBean();
        attr.type = AttrType.BAOSHANGJIAN;
        attr.info = "互相猜忌";
        attr.value = 400;
        attr.targetId = XYId.yzl;
        bean.attrList.add(attr);

        //凌腾云
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.info = "势不两立";
        attr.value = 913;
        attr.targetId = XYId.lty;
        bean.attrList.add(attr);

        //平谷一点红
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.info = "黑道高手";
        attr.value = 913;
        attr.targetId = XYId.pgydh;
        bean.attrList.add(attr);

        //祝小芸
        attr = new XYAttrBean();
        attr.type = AttrType.BAOKANG;
        attr.info = "分庭抗礼";
        attr.value = 7313;
        attr.targetId = XYId.zxy;
        bean.attrList.add(attr);
        list.add(bean);

        //==========银长老=============//
        bean = new XYBean();
        bean.name = "银长老";
        bean.id = XYId.yzl;
        bean.attrList = new ArrayList<>();

        //金长老
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.info = "同归于尽";
        attr.value = 913;
        attr.targetId = XYId.jzl;
        bean.attrList.add(attr);

        //莫小宝
        attr = new XYAttrBean();
        attr.type = AttrType.QUANKANGXING;
        attr.info = "邪不胜正";
        attr.value = 400;
        attr.targetId = XYId.mxb2;
        bean.attrList.add(attr);

        //白展堂
        attr = new XYAttrBean();
        attr.type = AttrType.BAOJI;
        attr.info = "针锋相对";
        attr.value = 2188;
        attr.targetId = XYId.bzt;
        bean.attrList.add(attr);

        //美丽
        attr = new XYAttrBean();
        attr.type = AttrType.ZHENQI;
        attr.info = "邪门歪道";
        attr.value = 12750;
        attr.targetId = XYId.ml;
        bean.attrList.add(attr);
        list.add(bean);

        //==========佟石头=============//
        bean = new XYBean();
        bean.name = "佟石头";
        bean.id = XYId.tst;
        bean.attrList = new ArrayList<>();

        //莫太冲
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.info = "沾亲带故";
        attr.value = 913;
        attr.targetId = XYId.mtc;
        bean.attrList.add(attr);

        //莫小宝
        attr = new XYAttrBean();
        attr.type = AttrType.DUOSHAN;
        attr.info = "郎舅关系";
        attr.value = 2188;
        attr.targetId = XYId.mxb2;
        bean.attrList.add(attr);

        //诸葛孔方
        attr = new XYAttrBean();
        attr.type = AttrType.ZHENQI;
        attr.info = "资质平平";
        attr.value = 12750;
        attr.targetId = XYId.zgkf;
        bean.attrList.add(attr);

        //画画老人
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.info = "霄壤之别";
        attr.value = 913;
        attr.targetId = XYId.hhlr;
        bean.attrList.add(attr);
        list.add(bean);

        //==========包大仁=============//
        bean = new XYBean();
        bean.name = "包大仁";
        bean.id = XYId.bdr;
        bean.attrList = new ArrayList<>();

        //白眉
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.info = "一龙一蛇";
        attr.value = 72875;
        attr.targetId = XYId.bm;
        bean.attrList.add(attr);

        //平谷一点红
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.info = "刚柔井济";
        attr.value = 913;
        attr.targetId = XYId.pgydh;
        bean.attrList.add(attr);

        //吕轻侯
        attr = new XYAttrBean();
        attr.type = AttrType.DUOSHAN;
        attr.info = "咄咄逼人";
        attr.value = 2188;
        attr.targetId = XYId.lqh;
        bean.attrList.add(attr);

        //白展堂
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.info = "不死小强";
        attr.value = 913;
        attr.targetId = XYId.bzt;
        bean.attrList.add(attr);
        list.add(bean);

        //==========吴守义=============//
        bean = new XYBean();
        bean.name = "吴守义";
        bean.id = XYId.wsy;
        bean.attrList = new ArrayList<>();

        //打折
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.info = "目断魂销";
        attr.value = 913;
        attr.targetId = XYId.dz;
        bean.attrList.add(attr);

        //江小道
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.info = "心如死灰";
        attr.value = 72875;
        attr.targetId = XYId.jxd;
        bean.attrList.add(attr);

        //金长老
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.info = "生不如死";
        attr.value = 913;
        attr.targetId = XYId.jzl;
        bean.attrList.add(attr);

        //银长老
        attr = new XYAttrBean();
        attr.type = AttrType.ZHENQI;
        attr.info = "痛不欲生";
        attr.value = 12750;
        attr.targetId = XYId.yzl;
        bean.attrList.add(attr);
        list.add(bean);

        //==========莫小贝=============//
        bean = new XYBean();
        bean.name = "莫小贝";
        bean.id = XYId.mxb;
        bean.attrList = new ArrayList<>();

        //祝无双
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.info = "单纯无暇";
        attr.value = 43700;
        attr.targetId = XYId.zws;
        bean.attrList.add(attr);

        //岳松涛
        attr = new XYAttrBean();
        attr.type = AttrType.BAOSHANGJIA;
        attr.info = "五岳盟主";
        attr.value = 240;
        attr.targetId = XYId.yst;
        bean.attrList.add(attr);

        //佟湘玉
        attr = new XYAttrBean();
        attr.type = AttrType.QUANKANGXING;
        attr.info = "相依为命";
        attr.value = 240;
        attr.targetId = XYId.txy;
        bean.attrList.add(attr);

        //陆一鸣
        attr = new XYAttrBean();
        attr.type = AttrType.BAOKANG;
        attr.info = "衡山忠徒";
        attr.value = 4390;
        attr.targetId = XYId.lym;
        bean.attrList.add(attr);
        list.add(bean);

        //==========燕小六=============//
        bean = new XYBean();
        bean.name = "燕小六";
        bean.id = XYId.yxl;
        bean.attrList = new ArrayList<>();

        //祝无双
        attr = new XYAttrBean();
        attr.type = AttrType.QUANJINGTONG;
        attr.info = "捕快搭档";
        attr.value = 240;
        attr.targetId = XYId.zws;
        bean.attrList.add(attr);

        //一二三
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.info = "痛失爱犬";
        attr.value = 550;
        attr.targetId = XYId.yes;
        bean.attrList.add(attr);

        //邢育森
        attr = new XYAttrBean();
        attr.type = AttrType.MINGZHONG;
        attr.info = "知遇之恩";
        attr.value = 4390;
        attr.targetId = XYId.xys;
        bean.attrList.add(attr);

        //小米
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.info = "吹拉弹唱";
        attr.value = 43700;
        attr.targetId = XYId.xm;
        bean.attrList.add(attr);
        list.add(bean);

        //==========展堂=============//
        bean = new XYBean();
        bean.name = "展堂";
        bean.id = XYId.zt;
        bean.attrList = new ArrayList<>();

        //祝无双
        attr = new XYAttrBean();
        attr.type = AttrType.ZHENQI;
        attr.info = "流水无情";
        attr.value = 12750;
        attr.targetId = XYId.zws;
        bean.attrList.add(attr);

        //平谷一点红
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.info = "怪声怪气";
        attr.value = 913;
        attr.targetId = XYId.pgydh;
        bean.attrList.add(attr);

        //佟湘玉
        attr = new XYAttrBean();
        attr.type = AttrType.MINGZHONG;
        attr.info = "心思缜密";
        attr.value = 7313;
        attr.targetId = XYId.txy;
        bean.attrList.add(attr);

        //姬无命
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.info = "不可一世";
        attr.value = 913;
        attr.targetId = XYId.jwm;
        bean.attrList.add(attr);
        list.add(bean);

        //==========莫太冲=============//
        bean = new XYBean();
        bean.name = "莫太冲";
        bean.id = XYId.mtc;
        bean.attrList = new ArrayList<>();

        //缺德道人
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.info = "未逢敌手";
        attr.value = 1138;
        attr.targetId = XYId.qddr;
        bean.attrList.add(attr);

        //莫小宝
        attr = new XYAttrBean();
        attr.type = AttrType.MINGZHONG;
        attr.info = "子承父业";
        attr.value = 9150;
        attr.targetId = XYId.mxb2;
        bean.attrList.add(attr);

        //凌腾云
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.info = "正道先锋";
        attr.value = 1138;
        attr.targetId = XYId.lty;
        bean.attrList.add(attr);

        //佟石头
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.info = "桀骜不驯";
        attr.value = 91000;
        attr.targetId = XYId.tst;
        bean.attrList.add(attr);
        list.add(bean);

        //==========缺德道人=============//
        bean = new XYBean();
        bean.name = "缺德道人";
        bean.id = XYId.qddr;
        bean.attrList = new ArrayList<>();

        //莫太冲
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.info = "武林至尊";
        attr.value = 1138;
        attr.targetId = XYId.mtc;
        bean.attrList.add(attr);

        //凌腾云
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.info = "长江后浪";
        attr.value = 91000;
        attr.targetId = XYId.lty;
        bean.attrList.add(attr);

        //平谷一点红
        attr = new XYAttrBean();
        attr.type = AttrType.MINGZHONG;
        attr.info = "相形见绌";
        attr.value = 9150;
        attr.targetId = XYId.pgydh;
        bean.attrList.add(attr);

        //诸葛孔方
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.info = "事后诸葛";
        attr.value = 1138;
        attr.targetId = XYId.zgkf;
        bean.attrList.add(attr);
        list.add(bean);

        //==========打折=============//
        bean = new XYBean();
        bean.name = "打折";
        bean.id = XYId.dz;
        bean.attrList = new ArrayList<>();

        //美丽
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.info = "浓妆艳抹";
        attr.value = 688;
        attr.targetId = XYId.ml;
        bean.attrList.add(attr);

        //祝无双
        attr = new XYAttrBean();
        attr.type = AttrType.QUANJINGTONG;
        attr.info = "黯然失色";
        attr.value = 300;
        attr.targetId = XYId.zws;
        bean.attrList.add(attr);

        //南宫残花
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.info = "相形见绌";
        attr.value = 688;
        attr.targetId = XYId.ngch;
        bean.attrList.add(attr);

        //小米
        attr = new XYAttrBean();
        attr.type = AttrType.MINGZHONG;
        attr.info = "事后诸葛";
        attr.value = 5488;
        attr.targetId = XYId.xm;
        bean.attrList.add(attr);
        list.add(bean);

        //==========祝小芸=============//
        bean = new XYBean();
        bean.name = "祝小芸";
        bean.id = XYId.zxy;
        bean.attrList = new ArrayList<>();

        //莫小宝
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.info = "同气连枝";
        attr.value = 54625;
        attr.targetId = XYId.mxb2;
        bean.attrList.add(attr);

        //打折
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.info = "云泥之别";
        attr.value = 688;
        attr.targetId = XYId.dz;
        bean.attrList.add(attr);

        //陆一鸣
        attr = new XYAttrBean();
        attr.type = AttrType.BAOKANG;
        attr.info = "一脉同气";
        attr.value = 5488;
        attr.targetId = XYId.lym;
        bean.attrList.add(attr);

        //莫小贝
        attr = new XYAttrBean();
        attr.type = AttrType.MINGZHONG;
        attr.info = "相亲相爱";
        attr.value = 5488;
        attr.targetId = XYId.mxb;
        bean.attrList.add(attr);
        list.add(bean);

        //==========凌腾云=============//
        bean = new XYBean();
        bean.name = "凌腾云";
        bean.id = XYId.lty;
        bean.attrList = new ArrayList<>();

        //莫小宝
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.info = "正派人士";
        attr.value = 1138;
        attr.targetId = XYId.mxb2;
        bean.attrList.add(attr);

        //平谷一点红
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.info = "黑白分明";
        attr.value = 91000;
        attr.targetId = XYId.pgydh;
        bean.attrList.add(attr);

        //展堂
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.info = "一代名捕";
        attr.value = 1138;
        attr.targetId = XYId.zt;
        bean.attrList.add(attr);

        //金长老
        attr = new XYAttrBean();
        attr.type = AttrType.DUOSHAN;
        attr.info = "黑白两道";
        attr.value = 2738;
        attr.targetId = XYId.jzl;
        bean.attrList.add(attr);
        list.add(bean);

        //==========平谷一点红=============//
        bean = new XYBean();
        bean.name = "平谷一点红";
        bean.id = XYId.pgydh;
        bean.attrList = new ArrayList<>();

        //郭巨侠
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.info = "剑气凌人";
        attr.value = 1138;
        attr.targetId = XYId.gjx;
        bean.attrList.add(attr);

        //白展堂
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.info = "偷袭被捕";
        attr.value = 1138;
        attr.targetId = XYId.bzt;
        bean.attrList.add(attr);

        //吕轻侯
        attr = new XYAttrBean();
        attr.type = AttrType.ZHENQI;
        attr.info = "眉宇英武";
        attr.value = 15875;
        attr.targetId = XYId.lqh;
        bean.attrList.add(attr);

        //展堂
        attr = new XYAttrBean();
        attr.type = AttrType.BAOSHANGJIA;
        attr.info = "惺惺相惜";
        attr.value = 500;
        attr.targetId = XYId.zt;
        bean.attrList.add(attr);
        list.add(bean);

        //==========诸葛孔方=============//
        bean = new XYBean();
        bean.name = "诸葛孔方";
        bean.id = XYId.zgkf;
        bean.attrList = new ArrayList<>();

        //缺德道人
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.info = "德高望重";
        attr.value = 913;
        attr.targetId = XYId.qddr;
        bean.attrList.add(attr);

        //莫太冲
        attr = new XYAttrBean();
        attr.type = AttrType.BAOJI;
        attr.info = "宽厚慈祥";
        attr.value = 2188;
        attr.targetId = XYId.mtc;
        bean.attrList.add(attr);

        //佟石头
        attr = new XYAttrBean();
        attr.type = AttrType.BAOKANG;
        attr.info = "尊师重道";
        attr.value = 7313;
        attr.targetId = XYId.tst;
        bean.attrList.add(attr);

        //白眉
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.info = "慈眉善目";
        attr.value = 913;
        attr.targetId = XYId.bm;
        bean.attrList.add(attr);
        list.add(bean);

        return list;
    }
}
