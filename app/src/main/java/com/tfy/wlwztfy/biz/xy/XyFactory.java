package com.tfy.wlwztfy.biz.xy;

import com.tfy.wlwztfy.bean.AttrType;
import com.tfy.wlwztfy.bean.XYAttrBean;
import com.tfy.wlwztfy.bean.XYBean;
import com.tfy.wlwztfy.bean.XYId;
import com.tfy.wlwztfy.bean.XyLev;

import java.util.ArrayList;
import java.util.List;

/**
 * 侠影生成工厂
 * Created by Tse on 2018/11/26.
 */

class XyFactory {

    private static final List<XYBean> XY_LIST = new ArrayList<>();

    static List<XYBean> getXyList() {

        if (!XY_LIST.isEmpty()) {
            return XY_LIST;
        }

        //==========佟湘玉=============//
        XYBean bean = new XYBean();
        bean.name = "佟湘玉";
        bean.lev = XyLev.VIOLET;
        bean.id = XYId.txy;
        bean.attrList = new ArrayList<>();

        //吕轻侯
        XYAttrBean attr = new XYAttrBean();
        attr.type = AttrType.QUANJINGTONG;
        attr.qyTitle = "账房先生";
        attr.value = 320;
        attr.targetId = XYId.lqh;
        bean.attrList.add(attr);

        //白展堂
        attr = new XYAttrBean();
        attr.type = AttrType.BAOJI;
        attr.qyTitle = "芳心暗许";
        attr.value = 1750;
        attr.targetId = XYId.bzt;
        bean.attrList.add(attr);

        //郭芙蓉
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.qyTitle = "同福女主";
        attr.value = 730;
        attr.targetId = XYId.gfr;
        bean.attrList.add(attr);

        //莫小贝
        attr = new XYAttrBean();
        attr.type = AttrType.DUOSHAN;
        attr.qyTitle = "侄嫂之情";
        attr.value = 1750;
        attr.targetId = XYId.mxb;
        bean.attrList.add(attr);

        XY_LIST.add(bean);

        //==========郭芙蓉=============//

        bean = new XYBean();
        bean.name = "郭芙蓉";
        bean.lev = XyLev.VIOLET;
        bean.id = XYId.gfr;
        bean.attrList = new ArrayList<>();

        //郭巨侠
        attr = new XYAttrBean();
        attr.type = AttrType.BAOSHANGJIA;
        attr.qyTitle = "严父叛女";
        attr.value = 320;
        attr.targetId = XYId.gjx;
        bean.attrList.add(attr);

        //吕轻侯
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.qyTitle = "欢喜冤家";
        attr.value = 58300;
        attr.targetId = XYId.lqh;
        bean.attrList.add(attr);

        //佟湘玉
        attr = new XYAttrBean();
        attr.type = AttrType.ZHENQI;
        attr.qyTitle = "打工还债";
        attr.value = 10200;
        attr.targetId = XYId.txy;
        bean.attrList.add(attr);

        //祝无双
        attr = new XYAttrBean();
        attr.type = AttrType.MINGZHONG;
        attr.qyTitle = "才艺比赛";
        attr.value = 5850;
        attr.targetId = XYId.zws;
        bean.attrList.add(attr);

        XY_LIST.add(bean);

        //==========祝无双=============//
        bean = new XYBean();
        bean.name = "祝无双";
        bean.lev = XyLev.VIOLET;
        bean.id = XYId.zws;
        bean.attrList = new ArrayList<>();

        //白展堂
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.qyTitle = "葵花结缘";
        attr.value = 58300;
        attr.targetId = XYId.bzt;
        bean.attrList.add(attr);

        //李秀莲
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.qyTitle = "厨艺达人";
        attr.value = 730;
        attr.targetId = XYId.lxl;
        bean.attrList.add(attr);

        //吕轻侯
        attr = new XYAttrBean();
        attr.type = AttrType.QUANKANGXING;
        attr.qyTitle = "情深缘浅";
        attr.value = 320;
        attr.targetId = XYId.lqh;
        bean.attrList.add(attr);

        //燕小六
        attr = new XYAttrBean();
        attr.type = AttrType.BAOSHANGJIA;
        attr.qyTitle = "终得良人";
        attr.value = 320;
        attr.targetId = XYId.yxl;
        bean.attrList.add(attr);

        XY_LIST.add(bean);

        //==========吕轻侯=============//
        bean = new XYBean();
        bean.name = "吕轻侯";
        bean.lev = XyLev.VIOLET;
        bean.id = XYId.lqh;
        bean.attrList = new ArrayList<>();

        //佟湘玉
        attr = new XYAttrBean();
        attr.type = AttrType.BAOJI;
        attr.qyTitle = "客栈易主";
        attr.value = 1750;
        attr.targetId = XYId.txy;
        bean.attrList.add(attr);

        //郭巨侠
        attr = new XYAttrBean();
        attr.type = AttrType.QUANKANGXING;
        attr.qyTitle = "未来岳父";
        attr.value = 320;
        attr.targetId = XYId.gjx;
        bean.attrList.add(attr);

        //姬无命
        attr = new XYAttrBean();
        attr.type = AttrType.QUANJINGTONG;
        attr.qyTitle = "扬名关中";
        attr.value = 320;
        attr.targetId = XYId.jwm;
        bean.attrList.add(attr);

        //郭芙蓉
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.qyTitle = "相识相恋";
        attr.value = 730;
        attr.targetId = XYId.gfr;
        bean.attrList.add(attr);

        XY_LIST.add(bean);

        //==========李秀莲=============//
        bean = new XYBean();
        bean.name = "李秀莲";
        bean.lev = XyLev.VIOLET;
        bean.id = XYId.lxl;
        bean.attrList = new ArrayList<>();

        //佟湘玉
        attr = new XYAttrBean();
        attr.type = AttrType.BAOSHANGJIA;
        attr.qyTitle = "客栈大厨";
        attr.value = 320;
        attr.targetId = XYId.txy;
        bean.attrList.add(attr);

        //祝无双
        attr = new XYAttrBean();
        attr.type = AttrType.DUOSHAN;
        attr.qyTitle = "无心插柳";
        attr.value = 1750;
        attr.targetId = XYId.zws;
        bean.attrList.add(attr);

        //郭芙蓉
        attr = new XYAttrBean();
        attr.type = AttrType.BAOKANG;
        attr.qyTitle = "真假掌法";
        attr.value = 5850;
        attr.targetId = XYId.gfr;
        bean.attrList.add(attr);

        //杨蕙兰
        attr = new XYAttrBean();
        attr.type = AttrType.MINGZHONG;
        attr.qyTitle = "苦苦单恋";
        attr.value = 5850;
        attr.targetId = XYId.yhl;
        bean.attrList.add(attr);

        XY_LIST.add(bean);

        //==========南宫残花=============//
        bean = new XYBean();
        bean.name = "南宫残花";
        bean.lev = XyLev.BLUE;
        bean.id = XYId.ngch;
        bean.attrList = new ArrayList<>();

        //佟湘玉
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.qyTitle = "唠叨师妹";
        attr.value = 550;
        attr.targetId = XYId.txy;
        bean.attrList.add(attr);

        //祝无双
        attr = new XYAttrBean();
        attr.type = AttrType.DUOSHAN;
        attr.qyTitle = "胸怀爱心";
        attr.value = 1320;
        attr.targetId = XYId.zws;
        bean.attrList.add(attr);

        //吕轻侯
        attr = new XYAttrBean();
        attr.type = AttrType.QUANJINGTONG;
        attr.qyTitle = "唠叨之神";
        attr.value = 240;
        attr.targetId = XYId.lqh;
        bean.attrList.add(attr);

        //李秀莲
        attr = new XYAttrBean();
        attr.type = AttrType.DUOSHAN;
        attr.qyTitle = "素食主义";
        attr.value = 1320;
        attr.targetId = XYId.lxl;
        bean.attrList.add(attr);

        XY_LIST.add(bean);


        //==========公孙乌龙=============//
        bean = new XYBean();
        bean.name = "公孙乌龙";
        bean.lev = XyLev.ORANGE;
        bean.id = XYId.gswl;
        bean.attrList = new ArrayList<>();

        //岳松涛
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.qyTitle = "反派高手";
        attr.value = 910;
        attr.targetId = XYId.yst;
        bean.attrList.add(attr);

        //白三娘
        attr = new XYAttrBean();
        attr.type = AttrType.BAOJI;
        attr.qyTitle = "千里追杀";
        attr.value = 2190;
        attr.targetId = XYId.bsn;
        bean.attrList.add(attr);

        //吕轻侯
        attr = new XYAttrBean();
        attr.type = AttrType.BAOKANG;
        attr.qyTitle = "拜师求道";
        attr.value = 7320;
        attr.targetId = XYId.lqh;
        bean.attrList.add(attr);

        //姬无命
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.qyTitle = "倒霉徒儿";
        attr.value = 910;
        attr.targetId = XYId.jwm;
        bean.attrList.add(attr);

        XY_LIST.add(bean);


        //==========莫小宝=============//
        bean = new XYBean();
        bean.name = "莫小宝";
        bean.lev = XyLev.ORANGE;
        bean.id = XYId.mxb2;
        bean.attrList = new ArrayList<>();

        //凌腾云
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.qyTitle = "持正不阿";
        attr.value = 91000;
        attr.targetId = XYId.lty;
        bean.attrList.add(attr);

        //展堂
        attr = new XYAttrBean();
        attr.type = AttrType.MINGZHONG;
        attr.qyTitle = "眉宇清秀";
        attr.value = 9150;
        attr.targetId = XYId.zt;
        bean.attrList.add(attr);

        //祝小芸
        attr = new XYAttrBean();
        attr.type = AttrType.BAOJI;
        attr.qyTitle = "情如兄妹";
        attr.value = 2738;
        attr.targetId = XYId.zxy;
        bean.attrList.add(attr);

        //银长老
        attr = new XYAttrBean();
        attr.type = AttrType.ZHENQI;
        attr.qyTitle = "立场不同";
        attr.value = 15875;
        attr.targetId = XYId.yzl;
        bean.attrList.add(attr);
        XY_LIST.add(bean);

        //==========断指轩辕=============//
        bean = new XYBean();
        bean.name = "断指轩辕";
        bean.lev = XyLev.ORANGE;
        bean.id = XYId.dzxy;
        bean.attrList = new ArrayList<>();

        //佟伯达
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.qyTitle = "父母恩勤";
        attr.value = 91000;
        attr.targetId = XYId.tbd;
        bean.attrList.add(attr);

        //李秀莲
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.qyTitle = "含辛茹苦";
        attr.value = 1138;
        attr.targetId = XYId.lxl;
        bean.attrList.add(attr);

        //公孙乌龙
        attr = new XYAttrBean();
        attr.type = AttrType.MINGZHONG;
        attr.qyTitle = "水火不容";
        attr.value = 9150;
        attr.targetId = XYId.gswl;
        bean.attrList.add(attr);

        //姬无病
        attr = new XYAttrBean();
        attr.type = AttrType.ZHENQI;
        attr.qyTitle = "不共戴天";
        attr.value = 15875;
        attr.targetId = XYId.jwb;
        bean.attrList.add(attr);
        XY_LIST.add(bean);

        //==========画画老人=============//
        bean = new XYBean();
        bean.name = "画画老人";
        bean.lev = XyLev.ORANGE;
        bean.id = XYId.hhlr;
        bean.attrList = new ArrayList<>();

        //江小道
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.qyTitle = "不堪一击";
        attr.value = 91000;
        attr.targetId = XYId.jxd;
        bean.attrList.add(attr);

        //断指轩辕
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.qyTitle = "白发婆娑";
        attr.value = 1138;
        attr.targetId = XYId.dzxy;
        bean.attrList.add(attr);

        //姬无力
        attr = new XYAttrBean();
        attr.type = AttrType.BAOJI;
        attr.qyTitle = "天壤之别";
        attr.value = 2738;
        attr.targetId = XYId.jwl;
        bean.attrList.add(attr);

        //佟伯达
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.qyTitle = "老而益壮";
        attr.value = 1138;
        attr.targetId = XYId.tbd;
        bean.attrList.add(attr);
        XY_LIST.add(bean);

        //==========上官云顿=============//
        bean = new XYBean();
        bean.name = "上官云顿";
        bean.lev = XyLev.VIOLET;
        bean.id = XYId.sgyd;
        bean.attrList = new ArrayList<>();

        //岳松涛
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.qyTitle = "黑白两道";
        attr.value = 730;
        attr.targetId = XYId.yst;
        bean.attrList.add(attr);

        //公孙乌龙
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.qyTitle = "独行杀手";
        attr.value = 730;
        attr.targetId = XYId.gswl;
        bean.attrList.add(attr);

        //姬无命
        attr = new XYAttrBean();
        attr.type = AttrType.QUANKANGXING;
        attr.qyTitle = "心狠手辣";
        attr.value = 320;
        attr.targetId = XYId.jwm;
        bean.attrList.add(attr);

        //李秀莲
        attr = new XYAttrBean();
        attr.type = AttrType.QUANJINGTONG;
        attr.qyTitle = "空手拿蟹";
        attr.value = 320;
        attr.targetId = XYId.lxl;
        bean.attrList.add(attr);
        XY_LIST.add(bean);

        //==========展红菱=============//
        bean = new XYBean();
        bean.name = "展红菱";
        bean.lev = XyLev.VIOLET;
        bean.id = XYId.zhl;
        bean.attrList = new ArrayList<>();

        //白展堂
        attr = new XYAttrBean();
        attr.type = AttrType.BAOJI;
        attr.qyTitle = "曾经沧海";
        attr.value = 1750;
        attr.targetId = XYId.bzt;
        bean.attrList.add(attr);

        //郭芙蓉
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.qyTitle = "侠女之风";
        attr.value = 58300;
        attr.targetId = XYId.gfr;
        bean.attrList.add(attr);

        //追风
        attr = new XYAttrBean();
        attr.type = AttrType.DUOSHAN;
        attr.qyTitle = "捕快神侣";
        attr.value = 1750;
        attr.targetId = XYId.zf;
        bean.attrList.add(attr);

        //吕轻侯
        attr = new XYAttrBean();
        attr.type = AttrType.BAOSHANGJIA;
        attr.qyTitle = "神笔书生";
        attr.value = 320;
        attr.targetId = XYId.lqh;
        bean.attrList.add(attr);
        XY_LIST.add(bean);

        //==========金长老=============//
        bean = new XYBean();
        bean.name = "金长老";
        bean.lev = XyLev.VIOLET;
        bean.id = XYId.jzl;
        bean.attrList = new ArrayList<>();

        //银长老
        attr = new XYAttrBean();
        attr.type = AttrType.BAOSHANGJIAN;
        attr.qyTitle = "互相猜忌";
        attr.value = 400;
        attr.targetId = XYId.yzl;
        bean.attrList.add(attr);

        //凌腾云
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.qyTitle = "势不两立";
        attr.value = 913;
        attr.targetId = XYId.lty;
        bean.attrList.add(attr);

        //平谷一点红
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.qyTitle = "黑道高手";
        attr.value = 913;
        attr.targetId = XYId.pgydh;
        bean.attrList.add(attr);

        //祝小芸
        attr = new XYAttrBean();
        attr.type = AttrType.BAOKANG;
        attr.qyTitle = "分庭抗礼";
        attr.value = 7313;
        attr.targetId = XYId.zxy;
        bean.attrList.add(attr);
        XY_LIST.add(bean);

        //==========银长老=============//
        bean = new XYBean();
        bean.name = "银长老";
        bean.lev = XyLev.VIOLET;
        bean.id = XYId.yzl;
        bean.attrList = new ArrayList<>();

        //金长老
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.qyTitle = "同归于尽";
        attr.value = 913;
        attr.targetId = XYId.jzl;
        bean.attrList.add(attr);

        //莫小宝
        attr = new XYAttrBean();
        attr.type = AttrType.QUANKANGXING;
        attr.qyTitle = "邪不胜正";
        attr.value = 400;
        attr.targetId = XYId.mxb2;
        bean.attrList.add(attr);

        //展堂
        attr = new XYAttrBean();
        attr.type = AttrType.BAOJI;
        attr.qyTitle = "针锋相对";
        attr.value = 2188;
        attr.targetId = XYId.zt;
        bean.attrList.add(attr);

        //美丽
        attr = new XYAttrBean();
        attr.type = AttrType.ZHENQI;
        attr.qyTitle = "邪门歪道";
        attr.value = 12750;
        attr.targetId = XYId.ml;
        bean.attrList.add(attr);
        XY_LIST.add(bean);

        //==========佟石头=============//
        bean = new XYBean();
        bean.name = "佟石头";
        bean.lev = XyLev.VIOLET;
        bean.id = XYId.tst;
        bean.attrList = new ArrayList<>();

        //莫太冲
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.qyTitle = "沾亲带故";
        attr.value = 913;
        attr.targetId = XYId.mtc;
        bean.attrList.add(attr);

        //莫小宝
        attr = new XYAttrBean();
        attr.type = AttrType.DUOSHAN;
        attr.qyTitle = "郎舅关系";
        attr.value = 2188;
        attr.targetId = XYId.mxb2;
        bean.attrList.add(attr);

        //诸葛孔方
        attr = new XYAttrBean();
        attr.type = AttrType.ZHENQI;
        attr.qyTitle = "资质平平";
        attr.value = 12750;
        attr.targetId = XYId.zgkf;
        bean.attrList.add(attr);

        //画画老人
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.qyTitle = "霄壤之别";
        attr.value = 913;
        attr.targetId = XYId.hhlr;
        bean.attrList.add(attr);
        XY_LIST.add(bean);

        //==========包大仁=============//
        bean = new XYBean();
        bean.name = "包大仁";
        bean.lev = XyLev.VIOLET;
        bean.id = XYId.bdr;
        bean.attrList = new ArrayList<>();

        //白眉
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.qyTitle = "一龙一蛇";
        attr.value = 72875;
        attr.targetId = XYId.bm;
        bean.attrList.add(attr);

        //平谷一点红
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.qyTitle = "刚柔井济";
        attr.value = 913;
        attr.targetId = XYId.pgydh;
        bean.attrList.add(attr);

        //吕轻侯
        attr = new XYAttrBean();
        attr.type = AttrType.DUOSHAN;
        attr.qyTitle = "咄咄逼人";
        attr.value = 2188;
        attr.targetId = XYId.lqh;
        bean.attrList.add(attr);

        //白展堂
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.qyTitle = "不死小强";
        attr.value = 913;
        attr.targetId = XYId.bzt;
        bean.attrList.add(attr);
        XY_LIST.add(bean);

        //==========吴守义=============//
        bean = new XYBean();
        bean.name = "吴守义";
        bean.lev = XyLev.VIOLET;
        bean.id = XYId.wsy;
        bean.attrList = new ArrayList<>();

        //打折
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.qyTitle = "目断魂销";
        attr.value = 913;
        attr.targetId = XYId.dz;
        bean.attrList.add(attr);

        //江小道
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.qyTitle = "心如死灰";
        attr.value = 72875;
        attr.targetId = XYId.jxd;
        bean.attrList.add(attr);

        //金长老
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.qyTitle = "生不如死";
        attr.value = 913;
        attr.targetId = XYId.jzl;
        bean.attrList.add(attr);

        //银长老
        attr = new XYAttrBean();
        attr.type = AttrType.ZHENQI;
        attr.qyTitle = "痛不欲生";
        attr.value = 12750;
        attr.targetId = XYId.yzl;
        bean.attrList.add(attr);
        XY_LIST.add(bean);

        //==========莫小贝=============//
        bean = new XYBean();
        bean.name = "莫小贝";
        bean.lev = XyLev.BLUE;
        bean.id = XYId.mxb;
        bean.attrList = new ArrayList<>();

        //祝无双
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.qyTitle = "单纯无暇";
        attr.value = 43700;
        attr.targetId = XYId.zws;
        bean.attrList.add(attr);

        //岳松涛
        attr = new XYAttrBean();
        attr.type = AttrType.BAOSHANGJIA;
        attr.qyTitle = "五岳盟主";
        attr.value = 240;
        attr.targetId = XYId.yst;
        bean.attrList.add(attr);

        //佟湘玉
        attr = new XYAttrBean();
        attr.type = AttrType.QUANKANGXING;
        attr.qyTitle = "相依为命";
        attr.value = 240;
        attr.targetId = XYId.txy;
        bean.attrList.add(attr);

        //陆一鸣
        attr = new XYAttrBean();
        attr.type = AttrType.BAOKANG;
        attr.qyTitle = "衡山忠徒";
        attr.value = 4390;
        attr.targetId = XYId.lym;
        bean.attrList.add(attr);
        XY_LIST.add(bean);

        //==========燕小六=============//
        bean = new XYBean();
        bean.name = "燕小六";
        bean.lev = XyLev.BLUE;
        bean.id = XYId.yxl;
        bean.attrList = new ArrayList<>();

        //祝无双
        attr = new XYAttrBean();
        attr.type = AttrType.QUANJINGTONG;
        attr.qyTitle = "捕快搭档";
        attr.value = 240;
        attr.targetId = XYId.zws;
        bean.attrList.add(attr);

        //一二三
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.qyTitle = "痛失爱犬";
        attr.value = 550;
        attr.targetId = XYId.yes;
        bean.attrList.add(attr);

        //邢育森
        attr = new XYAttrBean();
        attr.type = AttrType.MINGZHONG;
        attr.qyTitle = "知遇之恩";
        attr.value = 4390;
        attr.targetId = XYId.xys;
        bean.attrList.add(attr);

        //小米
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.qyTitle = "吹拉弹唱";
        attr.value = 43700;
        attr.targetId = XYId.xm;
        bean.attrList.add(attr);
        XY_LIST.add(bean);

        //==========展堂=============//
        bean = new XYBean();
        bean.name = "展堂";
        bean.lev = XyLev.VIOLET;
        bean.id = XYId.zt;
        bean.attrList = new ArrayList<>();

        //祝无双
        attr = new XYAttrBean();
        attr.type = AttrType.ZHENQI;
        attr.qyTitle = "流水无情";
        attr.value = 12750;
        attr.targetId = XYId.zws;
        bean.attrList.add(attr);

        //平谷一点红
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.qyTitle = "怪声怪气";
        attr.value = 913;
        attr.targetId = XYId.pgydh;
        bean.attrList.add(attr);

        //佟湘玉
        attr = new XYAttrBean();
        attr.type = AttrType.MINGZHONG;
        attr.qyTitle = "心思缜密";
        attr.value = 7313;
        attr.targetId = XYId.txy;
        bean.attrList.add(attr);

        //姬无命
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.qyTitle = "不可一世";
        attr.value = 913;
        attr.targetId = XYId.jwm;
        bean.attrList.add(attr);
        XY_LIST.add(bean);

        //==========莫太冲=============//
        bean = new XYBean();
        bean.name = "莫太冲";
        bean.lev = XyLev.ORANGE;
        bean.id = XYId.mtc;
        bean.attrList = new ArrayList<>();

        //缺德道人
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.qyTitle = "未逢敌手";
        attr.value = 1138;
        attr.targetId = XYId.qddr;
        bean.attrList.add(attr);

        //莫小宝
        attr = new XYAttrBean();
        attr.type = AttrType.MINGZHONG;
        attr.qyTitle = "子承父业";
        attr.value = 9150;
        attr.targetId = XYId.mxb2;
        bean.attrList.add(attr);

        //凌腾云
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.qyTitle = "正道先锋";
        attr.value = 1138;
        attr.targetId = XYId.lty;
        bean.attrList.add(attr);

        //佟石头
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.qyTitle = "桀骜不驯";
        attr.value = 91000;
        attr.targetId = XYId.tst;
        bean.attrList.add(attr);
        XY_LIST.add(bean);

        //==========缺德道人=============//
        bean = new XYBean();
        bean.name = "缺德道人";
        bean.lev = XyLev.ORANGE;
        bean.id = XYId.qddr;
        bean.attrList = new ArrayList<>();

        //莫太冲
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.qyTitle = "武林至尊";
        attr.value = 1138;
        attr.targetId = XYId.mtc;
        bean.attrList.add(attr);

        //凌腾云
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.qyTitle = "长江后浪";
        attr.value = 91000;
        attr.targetId = XYId.lty;
        bean.attrList.add(attr);

        //平谷一点红
        attr = new XYAttrBean();
        attr.type = AttrType.MINGZHONG;
        attr.qyTitle = "相形见绌";
        attr.value = 9150;
        attr.targetId = XYId.pgydh;
        bean.attrList.add(attr);

        //诸葛孔方
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.qyTitle = "事后诸葛";
        attr.value = 1138;
        attr.targetId = XYId.zgkf;
        bean.attrList.add(attr);
        XY_LIST.add(bean);

        //==========打折=============//
        bean = new XYBean();
        bean.name = "打折";
        bean.lev = XyLev.BLUE;
        bean.id = XYId.dz;
        bean.attrList = new ArrayList<>();

        //美丽
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.qyTitle = "浓妆艳抹";
        attr.value = 688;
        attr.targetId = XYId.ml;
        bean.attrList.add(attr);

        //祝无双
        attr = new XYAttrBean();
        attr.type = AttrType.QUANJINGTONG;
        attr.qyTitle = "黯然失色";
        attr.value = 300;
        attr.targetId = XYId.zws;
        bean.attrList.add(attr);

        //南宫残花
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.qyTitle = "相形见绌";
        attr.value = 688;
        attr.targetId = XYId.ngch;
        bean.attrList.add(attr);

        //小米
        attr = new XYAttrBean();
        attr.type = AttrType.MINGZHONG;
        attr.qyTitle = "事后诸葛";
        attr.value = 5488;
        attr.targetId = XYId.xm;
        bean.attrList.add(attr);
        XY_LIST.add(bean);

        //==========祝小芸=============//
        bean = new XYBean();
        bean.name = "祝小芸";
        bean.lev = XyLev.BLUE;
        bean.id = XYId.zxy;
        bean.attrList = new ArrayList<>();

        //莫小宝
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.qyTitle = "同气连枝";
        attr.value = 54625;
        attr.targetId = XYId.mxb2;
        bean.attrList.add(attr);

        //打折
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.qyTitle = "云泥之别";
        attr.value = 688;
        attr.targetId = XYId.dz;
        bean.attrList.add(attr);

        //陆一鸣
        attr = new XYAttrBean();
        attr.type = AttrType.BAOKANG;
        attr.qyTitle = "一脉同气";
        attr.value = 5488;
        attr.targetId = XYId.lym;
        bean.attrList.add(attr);

        //莫小贝
        attr = new XYAttrBean();
        attr.type = AttrType.MINGZHONG;
        attr.qyTitle = "相亲相爱";
        attr.value = 5488;
        attr.targetId = XYId.mxb;
        bean.attrList.add(attr);
        XY_LIST.add(bean);

        //==========凌腾云=============//
        bean = new XYBean();
        bean.name = "凌腾云";
        bean.lev = XyLev.ORANGE;
        bean.id = XYId.lty;
        bean.attrList = new ArrayList<>();

        //莫小宝
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.qyTitle = "正派人士";
        attr.value = 1138;
        attr.targetId = XYId.mxb2;
        bean.attrList.add(attr);

        //平谷一点红
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.qyTitle = "黑白分明";
        attr.value = 91000;
        attr.targetId = XYId.pgydh;
        bean.attrList.add(attr);

        //展堂
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.qyTitle = "一代名捕";
        attr.value = 1138;
        attr.targetId = XYId.zt;
        bean.attrList.add(attr);

        //金长老
        attr = new XYAttrBean();
        attr.type = AttrType.DUOSHAN;
        attr.qyTitle = "黑白两道";
        attr.value = 2738;
        attr.targetId = XYId.jzl;
        bean.attrList.add(attr);
        XY_LIST.add(bean);

        //==========平谷一点红=============//
        bean = new XYBean();
        bean.name = "平谷一点红";
        bean.lev = XyLev.ORANGE;
        bean.id = XYId.pgydh;
        bean.attrList = new ArrayList<>();

        //郭巨侠
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.qyTitle = "剑气凌人";
        attr.value = 1138;
        attr.targetId = XYId.gjx;
        bean.attrList.add(attr);

        //白展堂
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.qyTitle = "偷袭被捕";
        attr.value = 1138;
        attr.targetId = XYId.bzt;
        bean.attrList.add(attr);

        //吕轻侯
        attr = new XYAttrBean();
        attr.type = AttrType.ZHENQI;
        attr.qyTitle = "眉宇英武";
        attr.value = 15875;
        attr.targetId = XYId.lqh;
        bean.attrList.add(attr);

        //展堂
        attr = new XYAttrBean();
        attr.type = AttrType.BAOSHANGJIA;
        attr.qyTitle = "惺惺相惜";
        attr.value = 500;
        attr.targetId = XYId.zt;
        bean.attrList.add(attr);
        XY_LIST.add(bean);

        //==========诸葛孔方=============//
        bean = new XYBean();
        bean.name = "诸葛孔方";
        bean.id = XYId.zgkf;
        bean.lev = XyLev.VIOLET;
        bean.attrList = new ArrayList<>();

        //缺德道人
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.qyTitle = "德高望重";
        attr.value = 913;
        attr.targetId = XYId.qddr;
        bean.attrList.add(attr);

        //莫太冲
        attr = new XYAttrBean();
        attr.type = AttrType.BAOJI;
        attr.qyTitle = "宽厚慈祥";
        attr.value = 2188;
        attr.targetId = XYId.mtc;
        bean.attrList.add(attr);

        //佟石头
        attr = new XYAttrBean();
        attr.type = AttrType.BAOKANG;
        attr.qyTitle = "尊师重道";
        attr.value = 7313;
        attr.targetId = XYId.tst;
        bean.attrList.add(attr);

        //白眉
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.qyTitle = "慈眉善目";
        attr.value = 913;
        attr.targetId = XYId.bm;
        bean.attrList.add(attr);
        XY_LIST.add(bean);

        //==========邢育森=============//
        bean = new XYBean();
        bean.name = "邢育森";
        bean.id = XYId.xys;
        bean.lev = XyLev.BLUE;
        bean.attrList = new ArrayList<>();

        //姬无命
        attr = new XYAttrBean();
        attr.type = AttrType.BAOSHANGJIA;
        attr.qyTitle = "歪打正着";
        attr.value = 240;
        attr.targetId = XYId.jwm;
        bean.attrList.add(attr);

        //燕小六
        attr = new XYAttrBean();
        attr.type = AttrType.ZHENQI;
        attr.qyTitle = "青出于蓝";
        attr.value = 7600;
        attr.targetId = XYId.yxl;
        bean.attrList.add(attr);

        //娄知县
        attr = new XYAttrBean();
        attr.type = AttrType.BAOJI;
        attr.qyTitle = "朝廷命官";
        attr.value = 1320;
        attr.targetId = XYId.lzx;
        bean.attrList.add(attr);

        //小米
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.qyTitle = "误入丐帮";
        attr.value = 550;
        attr.targetId = XYId.xm;
        bean.attrList.add(attr);
        XY_LIST.add(bean);


        //==========恭长老=============//
        bean = new XYBean();
        bean.name = "恭长老";
        bean.id = XYId.gzl;
        bean.lev = XyLev.BLUE;
        bean.attrList = new ArrayList<>();

        //白展堂
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.qyTitle = "后起之秀";
        attr.value = 550;
        attr.targetId = XYId.bzt;
        bean.attrList.add(attr);

        //郭芙蓉
        attr = new XYAttrBean();
        attr.type = AttrType.MINGZHONG;
        attr.qyTitle = "降龙惊涛";
        attr.value = 4390;
        attr.targetId = XYId.gfr;
        bean.attrList.add(attr);

        //郭巨侠
        attr = new XYAttrBean();
        attr.type = AttrType.BAOSHANGJIAN;
        attr.qyTitle = "掌力深厚";
        attr.value = 240;
        attr.targetId = XYId.gjx;
        bean.attrList.add(attr);

        //小米
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.qyTitle = "丐帮子弟";
        attr.value = 550;
        attr.targetId = XYId.xm;
        bean.attrList.add(attr);
        XY_LIST.add(bean);


        //==========追风=============//
        bean = new XYBean();
        bean.name = "追风";
        bean.id = XYId.zf;
        bean.lev = XyLev.BLUE;
        bean.attrList = new ArrayList<>();

        //郭巨侠
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.qyTitle = "师命难违";
        attr.value = 550;
        attr.targetId = XYId.gjx;
        bean.attrList.add(attr);

        //白三娘
        attr = new XYAttrBean();
        attr.type = AttrType.ZHENQI;
        attr.qyTitle = "六扇门人";
        attr.value = 7600;
        attr.targetId = XYId.bsn;
        bean.attrList.add(attr);

        //展红菱
        attr = new XYAttrBean();
        attr.type = AttrType.QUANKANGXING;
        attr.qyTitle = "心有所属";
        attr.value = 240;
        attr.targetId = XYId.zhl;
        bean.attrList.add(attr);

        //郭芙蓉
        attr = new XYAttrBean();
        attr.type = AttrType.DUOSHAN;
        attr.qyTitle = "任性师妹";
        attr.value = 1320;
        attr.targetId = XYId.gfr;
        bean.attrList.add(attr);
        XY_LIST.add(bean);


        //==========陆一鸣=============//
        bean = new XYBean();
        bean.name = "陆一鸣";
        bean.id = XYId.lym;
        bean.lev = XyLev.BLUE;
        bean.attrList = new ArrayList<>();

        //莫小贝
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.qyTitle = "衡山血脉";
        attr.value = 43700;
        attr.targetId = XYId.mxb;
        bean.attrList.add(attr);

        //佟湘玉
        attr = new XYAttrBean();
        attr.type = AttrType.ZHENQI;
        attr.qyTitle = "投身镖局";
        attr.value = 7600;
        attr.targetId = XYId.txy;
        bean.attrList.add(attr);

        //岳松涛
        attr = new XYAttrBean();
        attr.type = AttrType.QUANKANGXING;
        attr.qyTitle = "分属五岳";
        attr.value = 240;
        attr.targetId = XYId.yst;
        bean.attrList.add(attr);

        //追风
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.qyTitle = "江湖青年";
        attr.value = 550;
        attr.targetId = XYId.zf;
        bean.attrList.add(attr);
        XY_LIST.add(bean);


        //==========小米=============//
        bean = new XYBean();
        bean.name = "小米";
        bean.id = XYId.xm;
        bean.lev = XyLev.GREEN;
        bean.attrList = new ArrayList<>();

        //佟湘玉
        attr = new XYAttrBean();
        attr.type = AttrType.ZHENQI;
        attr.qyTitle = "不速之客";
        attr.value = 5100;
        attr.targetId = XYId.txy;
        bean.attrList.add(attr);

        //李秀莲
        attr = new XYAttrBean();
        attr.type = AttrType.BAOKANG;
        attr.qyTitle = "请少放盐";
        attr.value = 2930;
        attr.targetId = XYId.lxl;
        bean.attrList.add(attr);

        //恭长老
        attr = new XYAttrBean();
        attr.type = AttrType.QUANJINGTONG;
        attr.qyTitle = "四大长老";
        attr.value = 160;
        attr.targetId = XYId.gzl;
        bean.attrList.add(attr);

        //邢育森
        attr = new XYAttrBean();
        attr.type = AttrType.BAOSHANGJIAN;
        attr.qyTitle = "官职不保";
        attr.value = 160;
        attr.targetId = XYId.xys;
        bean.attrList.add(attr);
        XY_LIST.add(bean);


        //==========娄知县=============//
        bean = new XYBean();
        bean.name = "娄知县";
        bean.id = XYId.lzx;
        bean.lev = XyLev.GREEN;
        bean.attrList = new ArrayList<>();

        //邢育森
        attr = new XYAttrBean();
        attr.type = AttrType.QUANJINGTONG;
        attr.qyTitle = "淄衣捕头";
        attr.value = 160;
        attr.targetId = XYId.xys;
        bean.attrList.add(attr);

        //燕小六
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.qyTitle = "继任捕头";
        attr.value = 370;
        attr.targetId = XYId.yxl;
        bean.attrList.add(attr);

        //李秀莲
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.qyTitle = "远房亲戚";
        attr.value = 29100;
        attr.targetId = XYId.lxl;
        bean.attrList.add(attr);

        //一二三
        attr = new XYAttrBean();
        attr.type = AttrType.BAOSHANGJIAN;
        attr.qyTitle = "官府巡犬";
        attr.value = 160;
        attr.targetId = XYId.yes;
        bean.attrList.add(attr);
        XY_LIST.add(bean);


        //==========杨蕙兰=============//
        bean = new XYBean();
        bean.name = "杨蕙兰";
        bean.id = XYId.yhl;
        bean.lev = XyLev.GREEN;
        bean.attrList = new ArrayList<>();

        //李秀莲
        attr = new XYAttrBean();
        attr.type = AttrType.BAOSHANGJIA;
        attr.qyTitle = "资深备胎";
        attr.value = 160;
        attr.targetId = XYId.lxl;
        bean.attrList.add(attr);

        //祝无双
        attr = new XYAttrBean();
        attr.type = AttrType.DUOSHAN;
        attr.qyTitle = "善恶有别";
        attr.value = 880;
        attr.targetId = XYId.zws;
        bean.attrList.add(attr);

        //洪大师
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.qyTitle = "心术不正";
        attr.value = 370;
        attr.targetId = XYId.hds;
        bean.attrList.add(attr);

        //南宫残花
        attr = new XYAttrBean();
        attr.type = AttrType.BAOJI;
        attr.qyTitle = "任性两级";
        attr.value = 880;
        attr.targetId = XYId.ngch;
        bean.attrList.add(attr);
        XY_LIST.add(bean);


        //==========洪大师=============//
        bean = new XYBean();
        bean.name = "洪大师";
        bean.id = XYId.hds;
        bean.lev = XyLev.GREEN;
        bean.attrList = new ArrayList<>();

        //恭长老
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.qyTitle = "混迹街头";
        attr.value = 370;
        attr.targetId = XYId.gzl;
        bean.attrList.add(attr);

        //李秀莲
        attr = new XYAttrBean();
        attr.type = AttrType.BAOJI;
        attr.qyTitle = "假传神功";
        attr.value = 880;
        attr.targetId = XYId.lxl;
        bean.attrList.add(attr);

        //杨蕙兰
        attr = new XYAttrBean();
        attr.type = AttrType.ZHENQI;
        attr.qyTitle = "江湖骗术";
        attr.value = 5100;
        attr.targetId = XYId.yhl;
        bean.attrList.add(attr);

        //娄知县
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.qyTitle = "牢狱之灾";
        attr.value = 29100;
        attr.targetId = XYId.lzx;
        bean.attrList.add(attr);
        XY_LIST.add(bean);


        //==========一二三=============//
        bean = new XYBean();
        bean.name = "一二三";
        bean.id = XYId.yes;
        bean.lev = XyLev.GREEN;
        bean.attrList = new ArrayList<>();

        //燕小六
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.qyTitle = "巡街拍档";
        attr.value = 29100;
        attr.targetId = XYId.yxl;
        bean.attrList.add(attr);

        //娄知县
        attr = new XYAttrBean();
        attr.type = AttrType.MINGZHONG;
        attr.qyTitle = "县衙忠犬";
        attr.value = 2930;
        attr.targetId = XYId.lzx;
        bean.attrList.add(attr);

        //郭芙蓉
        attr = new XYAttrBean();
        attr.type = AttrType.BAOKANG;
        attr.qyTitle = "命绝双煞";
        attr.value = 2930;
        attr.targetId = XYId.gfr;
        bean.attrList.add(attr);

        //邢育森
        attr = new XYAttrBean();
        attr.type = AttrType.QUANKANGXING;
        attr.qyTitle = "衙门同僚";
        attr.value = 160;
        attr.targetId = XYId.xys;
        bean.attrList.add(attr);
        XY_LIST.add(bean);


        //==========岳松涛=============//
        bean = new XYBean();
        bean.name = "岳松涛";
        bean.id = XYId.yst;
        bean.lev = XyLev.ORANGE;
        bean.attrList = new ArrayList<>();

        //上官云顿
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.qyTitle = "心存恶念";
        attr.value = 72800;
        attr.targetId = XYId.sgyd;
        bean.attrList.add(attr);

        //公孙乌龙
        attr = new XYAttrBean();
        attr.type = AttrType.BAOSHANGJIA;
        attr.qyTitle = "隔空伤敌";
        attr.value = 400;
        attr.targetId = XYId.gswl;
        bean.attrList.add(attr);

        //姬无命
        attr = new XYAttrBean();
        attr.type = AttrType.MINGZHONG;
        attr.qyTitle = "致命掌力";
        attr.value = 7320;
        attr.targetId = XYId.jwm;
        bean.attrList.add(attr);

        //莫小贝
        attr = new XYAttrBean();
        attr.type = AttrType.BAOJI;
        attr.qyTitle = "盟主之争";
        attr.value = 2190;
        attr.targetId = XYId.mxb;
        bean.attrList.add(attr);
        XY_LIST.add(bean);

        //==========郭巨侠=============//
        bean = new XYBean();
        bean.name = "郭巨侠";
        bean.id = XYId.gjx;
        bean.lev = XyLev.ORANGE;
        bean.attrList = new ArrayList<>();

        //白三娘
        attr = new XYAttrBean();
        attr.type = AttrType.MINGZHONG;
        attr.qyTitle = "正派高手";
        attr.value = 7320;
        attr.targetId = XYId.bsn;
        bean.attrList.add(attr);

        //郭芙蓉
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.qyTitle = "父女情深";
        attr.value = 910;
        attr.targetId = XYId.gfr;
        bean.attrList.add(attr);

        //吕轻侯
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.qyTitle = "未来女婿";
        attr.value = 72800;
        attr.targetId = XYId.lqh;
        bean.attrList.add(attr);

        //展红菱
        attr = new XYAttrBean();
        attr.type = AttrType.ZHENQI;
        attr.qyTitle = "正义凛然";
        attr.value = 12700;
        attr.targetId = XYId.zhl;
        bean.attrList.add(attr);
        XY_LIST.add(bean);


        //==========白三娘=============//
        bean = new XYBean();
        bean.name = "白三娘";
        bean.id = XYId.bsn;
        bean.lev = XyLev.ORANGE;
        bean.attrList = new ArrayList<>();

        //展红菱
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.qyTitle = "女中豪杰";
        attr.value = 910;
        attr.targetId = XYId.zhl;
        bean.attrList.add(attr);
        XY_LIST.add(bean);

        //白展堂
        attr = new XYAttrBean();
        attr.type = AttrType.BAOSHANGJIAN;
        attr.qyTitle = "护子心切";
        attr.value = 400;
        attr.targetId = XYId.bzt;
        bean.attrList.add(attr);

        //公孙乌龙
        attr = new XYAttrBean();
        attr.type = AttrType.ZHENQI;
        attr.qyTitle = "同门师妹";
        attr.value = 12700;
        attr.targetId = XYId.gswl;
        bean.attrList.add(attr);

        //郭巨侠
        attr = new XYAttrBean();
        attr.type = AttrType.BAOKANG;
        attr.qyTitle = "惩恶扬善";
        attr.value = 7320;
        attr.targetId = XYId.gjx;
        bean.attrList.add(attr);


        //==========白展堂=============//
        bean = new XYBean();
        bean.name = "白展堂";
        bean.id = XYId.bzt;
        bean.lev = XyLev.ORANGE;
        bean.attrList = new ArrayList<>();

        //白三娘
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.qyTitle = "双面慈母";
        attr.value = 910;
        attr.targetId = XYId.bsn;
        bean.attrList.add(attr);
        XY_LIST.add(bean);

        //姬无命
        attr = new XYAttrBean();
        attr.type = AttrType.BAOKANG;
        attr.qyTitle = "盗圣盗神";
        attr.value = 7320;
        attr.targetId = XYId.jwm;
        bean.attrList.add(attr);

        //佟湘玉
        attr = new XYAttrBean();
        attr.type = AttrType.MINGZHONG;
        attr.qyTitle = "情定同福";
        attr.value = 7320;
        attr.targetId = XYId.txy;
        bean.attrList.add(attr);

        //郭巨侠
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.qyTitle = "免罪金牌";
        attr.value = 910;
        attr.targetId = XYId.gjx;
        bean.attrList.add(attr);


        //==========佟伯达=============//
        bean = new XYBean();
        bean.name = "佟伯达";
        bean.id = XYId.tbd;
        bean.lev = XyLev.ORANGE;
        bean.attrList = new ArrayList<>();

        //断指轩辕
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.qyTitle = "舐犊情深";
        attr.value = 1138;
        attr.targetId = XYId.dzxy;
        bean.attrList.add(attr);

        //佟湘玉
        attr = new XYAttrBean();
        attr.type = AttrType.ZHENQI;
        attr.qyTitle = "哀哀父母";
        attr.value = 15875;
        attr.targetId = XYId.txy;
        bean.attrList.add(attr);
        XY_LIST.add(bean);

        //姬无命
        attr = new XYAttrBean();
        attr.type = AttrType.DUOSHAN;
        attr.qyTitle = "势如水火";
        attr.value = 2738;
        attr.targetId = XYId.jwm;
        bean.attrList.add(attr);

        //姬无力
        attr = new XYAttrBean();
        attr.type = AttrType.MINGZHONG;
        attr.qyTitle = "你死我活";
        attr.value = 9150;
        attr.targetId = XYId.jwl;
        bean.attrList.add(attr);


        //==========白眉=============//
        bean = new XYBean();
        bean.name = "白眉";
        bean.id = XYId.bm;
        bean.lev = XyLev.ORANGE;
        bean.attrList = new ArrayList<>();

        //包大仁
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.qyTitle = "矛盾相向";
        attr.value = 91000;
        attr.targetId = XYId.bdr;
        bean.attrList.add(attr);

        //郭巨侠
        attr = new XYAttrBean();
        attr.type = AttrType.MINGZHONG;
        attr.qyTitle = "仙风道骨";
        attr.value = 9150;
        attr.targetId = XYId.gjx;
        bean.attrList.add(attr);
        XY_LIST.add(bean);

        //吕轻侯
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.qyTitle = "判若云泥";
        attr.value = 1138;
        attr.targetId = XYId.lqh;
        bean.attrList.add(attr);

        //白展堂
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.qyTitle = "流芳百世";
        attr.value = 1138;
        attr.targetId = XYId.bzt;
        bean.attrList.add(attr);


        //==========姬无命=============//
        bean = new XYBean();
        bean.name = "姬无命";
        bean.id = XYId.jwm;
        bean.lev = XyLev.VIOLET;
        bean.attrList = new ArrayList<>();

        //公孙乌龙
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.qyTitle = "师从恶人";
        attr.value = 58300;
        attr.targetId = XYId.gswl;
        bean.attrList.add(attr);

        //白展堂
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.qyTitle = "儿时发小";
        attr.value = 730;
        attr.targetId = XYId.bzt;
        bean.attrList.add(attr);
        XY_LIST.add(bean);

        //上官云顿
        attr = new XYAttrBean();
        attr.type = AttrType.DUOSHAN;
        attr.qyTitle = "一心向恶";
        attr.value = 1750;
        attr.targetId = XYId.sgyd;
        bean.attrList.add(attr);

        //吕轻侯
        attr = new XYAttrBean();
        attr.type = AttrType.BAOSHANGJIA;
        attr.qyTitle = "死于话多";
        attr.value = 320;
        attr.targetId = XYId.lqh;
        bean.attrList.add(attr);


        //==========姬无病=============//
        bean = new XYBean();
        bean.name = "姬无病";
        bean.id = XYId.jwb;
        bean.lev = XyLev.VIOLET;
        bean.attrList = new ArrayList<>();

        //姬无力
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.qyTitle = "如手如足";
        attr.value = 913;
        attr.targetId = XYId.jwl;
        bean.attrList.add(attr);

        //姬无命
        attr = new XYAttrBean();
        attr.type = AttrType.BAOJI;
        attr.qyTitle = "手足之情";
        attr.value = 2188;
        attr.targetId = XYId.jwm;
        bean.attrList.add(attr);
        XY_LIST.add(bean);

        //白展堂
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.qyTitle = "势不两存";
        attr.value = 913;
        attr.targetId = XYId.bzt;
        bean.attrList.add(attr);

        //断指轩辕
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.qyTitle = "风马不及";
        attr.value = 72875;
        attr.targetId = XYId.dzxy;
        bean.attrList.add(attr);


        //==========姬无力=============//
        bean = new XYBean();
        bean.name = "姬无力";
        bean.id = XYId.jwl;
        bean.lev = XyLev.VIOLET;
        bean.attrList = new ArrayList<>();

        //姬无病
        attr = new XYAttrBean();
        attr.type = AttrType.GONGJI;
        attr.qyTitle = "手足相连";
        attr.value = 913;
        attr.targetId = XYId.jwb;
        bean.attrList.add(attr);

        //姬无命
        attr = new XYAttrBean();
        attr.type = AttrType.BAOKANG;
        attr.qyTitle = "兄死弟及";
        attr.value = 7313;
        attr.targetId = XYId.jwm;
        bean.attrList.add(attr);
        XY_LIST.add(bean);

        //李秀莲
        attr = new XYAttrBean();
        attr.type = AttrType.DUOSHAN;
        attr.qyTitle = "鱼死网破";
        attr.value = 2188;
        attr.targetId = XYId.lxl;
        bean.attrList.add(attr);

        //佟伯达
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.qyTitle = "不关通痒";
        attr.value = 913;
        attr.targetId = XYId.tbd;
        bean.attrList.add(attr);


        //==========美丽=============//
        bean = new XYBean();
        bean.name = "美丽";
        bean.id = XYId.ml;
        bean.lev = XyLev.BLUE;
        bean.attrList = new ArrayList<>();

        //打折
        attr = new XYAttrBean();
        attr.type = AttrType.BAOSHANGJIA;
        attr.qyTitle = "花枝招展";
        attr.value = 300;
        attr.targetId = XYId.dz;
        bean.attrList.add(attr);

        //郭芙蓉
        attr = new XYAttrBean();
        attr.type = AttrType.ZHENQI;
        attr.qyTitle = "不可企及";
        attr.value = 9500;
        attr.targetId = XYId.gfr;
        bean.attrList.add(attr);
        XY_LIST.add(bean);

        //展红菱
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.qyTitle = "等而下之";
        attr.value = 54625;
        attr.targetId = XYId.zhl;
        bean.attrList.add(attr);

        //娄知县
        attr = new XYAttrBean();
        attr.type = AttrType.DUOSHAN;
        attr.qyTitle = "金玉其外";
        attr.value = 1650;
        attr.targetId = XYId.lzx;
        bean.attrList.add(attr);


        //==========江小道=============//
        bean = new XYBean();
        bean.name = "江小道";
        bean.id = XYId.jxd;
        bean.lev = XyLev.BLUE;
        bean.attrList = new ArrayList<>();

        //画画老人
        attr = new XYAttrBean();
        attr.type = AttrType.BAOKANG;
        attr.qyTitle = "天冠地道";
        attr.value = 5488;
        attr.targetId = XYId.hhlr;
        bean.attrList.add(attr);

        //姬无病
        attr = new XYAttrBean();
        attr.type = AttrType.DUOSHAN;
        attr.qyTitle = "见不得光";
        attr.value = 1650;
        attr.targetId = XYId.jwb;
        bean.attrList.add(attr);
        XY_LIST.add(bean);

        //美丽
        attr = new XYAttrBean();
        attr.type = AttrType.SHENGMING;
        attr.qyTitle = "违背道德";
        attr.value = 54625;
        attr.targetId = XYId.ml;
        bean.attrList.add(attr);

        //祝小芸
        attr = new XYAttrBean();
        attr.type = AttrType.FANGYU;
        attr.qyTitle = "外表坚强";
        attr.value = 688;
        attr.targetId = XYId.zxy;
        bean.attrList.add(attr);

        return XY_LIST;
    }
}
