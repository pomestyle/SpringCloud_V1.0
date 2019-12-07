package com.example.zuui;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.math.BigDecimal;

/**
 * @description:
 * @author: Administrator
 * @create: 2019-12-01 12:24
 **/
public class test {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {


        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><taxML xsi:type=\"HXZGSB00080Response\" xmlns=\"http://www.chinatax.gov.cn/dataspec/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><SBClhgzxxDrAndJkResVO><SBCgsHgzLockCheckResVO><hgzFlag>-2</hgzFlag><hgzjk>N</hgzjk><hgzcfsySqVo><jdccchgzbh>WAG131002375643</jdccchgzbh><ywszmhm>18120269492</ywszmhm></hgzcfsySqVo><nsrxxInitFlag>-1</nsrxxInitFlag></SBCgsHgzLockCheckResVO><hgzzwjc>Y</hgzzwjc><jdczccchgz>WAG131002375643</jdczccchgz><clsbdh>LVBV3JBB6HE172911</clsbdh><sfxny>0</sfxny><djxhFlag>N</djxhFlag><sbcgsnsrzrrxxVO><DJZrrxxGrid/><DJNsrxxGrid/></sbcgsnsrzrrxxVO><SBCgsStartBazdjsjgReqVO><clxlh>11002701017604</clxlh><cllbDm1></cllbDm1><clcp></clcp><clxh></clxh><cldw xsi:nil=\"true\"/><zws xsi:nil=\"true\"/><pql xsi:nil=\"true\"/><clgzsrlnyzlDm></clgzsrlnyzlDm><zypz></zypz><cdsx></cdsx><clgzdsxDm></clgzdsxDm><cllxDm></cllxDm><clgzstsywlxDm></clgzstsywlxDm><xnyqclxDm></xnyqclxDm><djxh></djxh><nsrsbh></nsrsbh><nsrmc></nsrmc><sbjsjg xsi:nil=\"true\"/><fpjg xsi:nil=\"true\"/><clsbdh>LVBV3JBB6HE172911</clsbdh><jdczccchgz>LVBV3JBB6HE172911</jdczccchgz><fdjhm></fdjhm><msbz></msbz></SBCgsStartBazdjsjgReqVO><clxlh>11002701017604</clxlh><nsrxxInitFlag>-1</nsrxxInitFlag><hgzcjxxjkFlag>ba</hgzcjxxjkFlag><SBCgsClsbdhJkResVO><reCode>0</reCode><clgzssbywbw><body><clgzssb><nsrxxForm><djxh>20121200000013816012</djxh><nsrsbh>120222197412152210</nsrsbh><nsrmc>黄利华</nsrmc><nsrsfzjzlDm>201</nsrsfzjzlDm><zjhm>120222197412152210</zjhm><lxdh>13116093089</lxdh><dz>天津市武清区大碱厂镇长屯村三区2排1号</dz><hyDm>Z990</hyDm><djzclxDm>900</djzclxDm></nsrxxForm><clgzssbxxForm><clsbdh>LVBV3JBB6HE172911</clsbdh><fdjhm>Q170444634D</fdjhm><clgzstsywlxDm xsi:nil=\"true\"/><jdczccchgz>WAG131002375643</jdczccchgz><clxlh>11002701017604</clxlh><clscqymc>北汽福田汽车股份有限公司</clscqymc><cllbDm1>1</cllbDm1><cllxDm>01</cllxDm><clcp>福田牌</clcp><clxh>BJ1041V9JB4-A1</clxh><cldw>4375.0</cldw><zws>2</zws><pql>2270.0</pql><clgzsrlnyzlDm>B</clgzsrlnyzlDm><zdjsjg xsi:nil=\"true\"/><cdsx>1</cdsx><clgzdsxDm>1</clgzdsxDm><ywlx>1</ywlx><clgzsjsfsDm>1</clgzsjsfsDm><clgzstsjsyjlxDm xsi:nil=\"true\"/><clgzsmjstjDm xsi:nil=\"true\"/><xnyqclxDm xsi:nil=\"true\"/><ywszmhm xsi:nil=\"true\"/><ccnssbrq xsi:nil=\"true\"/><mstjxsrq xsi:nil=\"true\"/><gzrq>2019-01-07</gzrq><nsqx>2019-03-07</nsqx><jdcxstyfpjg>51724.14</jdcxstyfpjg><escfphyxpzjg>0.0</escfphyxpzjg><xclsbdh xsi:nil=\"true\"/><hggszyjksjkshm xsi:nil=\"true\"/><gswsjg xsi:nil=\"true\"/><gsje xsi:nil=\"true\"/><xfsse xsi:nil=\"true\"/><fj2 xsi:nil=\"true\"/><jwfy>0.0</jwfy><hdjsjg xsi:nil=\"true\"/><clgzssblxDm>0100</clgzssblxDm><qtyxjgzmje>0.0</qtyxjgzmje><zmsbz>1</zmsbz></clgzssbxxForm><clgzssbhzxxForm><sbjsjg>51724.14</sbjsjg><jsjg>51724.14</jsjg><sl1>0.1</sl1><msjse>0.0</msjse><ynse>5172.41</ynse><ybtse>5172.41</ybtse><fpjgzsbz>N</fpjgzsbz><znj>0.0</znj><yjjhj>5172.41</yjjhj><sqtsje>0.0</sqtsje><rgbdjg>Y</rgbdjg></clgzssbhzxxForm><fjxxForm><dlrmc xsi:nil=\"true\"/><bsrxm xsi:nil=\"true\"/><dlrdz xsi:nil=\"true\"/><dlrlxdh xsi:nil=\"true\"/><jsrq>2019-01-10</jsrq></fjxxForm><fpcjGrid><fpcjGridlb><fpDm>112001620160</fpDm><jdcxstyfphm>00578080</jdcxstyfphm><fpkjrq>2019-01-07</fpkjrq><jdcxstyfpjg>51724.14</jdcxstyfpjg><jdcxstyfpjshj>60000.0</jdcxstyfpjshj></fpcjGridlb></fpcjGrid><escfpcjGrid/><yjsxxGrid><yjsxxGridlb><pzzlDm>000006010</pzzlDm><pzhm>312016190100141181</pzhm><sjje>5172.41</sjje></yjsxxGridlb></yjsxxGrid></clgzssb></body></clgzssbywbw><cgssbuuidSaved>b55c2f1e52b0489f8912cceaf45c4a49</cgssbuuidSaved><wszmhmSaved>18120269492</wszmhmSaved><SBCgsClsbdhJkKzVO><gcmsbs>0</gcmsbs></SBCgsClsbdhJkKzVO></SBCgsClsbdhJkResVO><clgzssbywbw bbh=\"String\" xmlbh=\"String\" xmlmc=\"String\"><body><clgzssb><nsrxxForm><djxh></djxh><nsrsbh></nsrsbh><nsrmc></nsrmc><nsrsfzjzlDm></nsrsfzjzlDm><zjhm></zjhm><lxdh></lxdh><dz></dz><hyDm></hyDm><djzclxDm></djzclxDm></nsrxxForm><clgzssbxxForm><clsbdh>LVBV3JBB6HE172911</clsbdh><fdjhm>Q170444634D</fdjhm><clgzstsywlxDm></clgzstsywlxDm><jdczccchgz>WAG131002375643</jdczccchgz><clxlh>11002701017604</clxlh><clscqymc>北汽福田汽车股份有限公司</clscqymc><cllbDm1>1</cllbDm1><cllxDm>01</cllxDm><clcp>福田牌</clcp><clxh>BJ1041V9JB4-A1</clxh><cldw>1995.0</cldw><zws xsi:nil=\"true\"/><pql>2270.0</pql><clgzsrlnyzlDm>B</clgzsrlnyzlDm><zypz></zypz><zdjsjg xsi:nil=\"true\"/><cdsx></cdsx><clgzdsxDm></clgzdsxDm><ywlx></ywlx><clgzsjsfsDm></clgzsjsfsDm><clgzstsjsyjlxDm></clgzstsjsyjlxDm><clgzsmjstjDm></clgzsmjstjDm><xnyqclxDm></xnyqclxDm><ywszmhm></ywszmhm><ccnssbrq></ccnssbrq><mstjxsrq></mstjxsrq><gzrq></gzrq><nsqx></nsqx><jdcxstyfpjg xsi:nil=\"true\"/><escfphyxpzjg xsi:nil=\"true\"/><xclsbdh></xclsbdh><hggszyjksjkshm></hggszyjksjkshm><gswsjg xsi:nil=\"true\"/><gsje xsi:nil=\"true\"/><xfsse xsi:nil=\"true\"/><fj2></fj2><jwfy xsi:nil=\"true\"/><hdjsjg xsi:nil=\"true\"/><clgzssblxDm></clgzssblxDm><tdsfyylxDm></tdsfyylxDm><clgzsbslxDm></clgzsbslxDm><qtyxjgzmmc></qtyxjgzmmc><qtyxjgzmhm></qtyxjgzmhm><qtyxjgzmje>0.0</qtyxjgzmje><clmc>载货汽车</clmc></clgzssbxxForm><clgzssbhzxxForm><sbjsjg xsi:nil=\"true\"/><jsjg xsi:nil=\"true\"/><sl1 xsi:nil=\"true\"/><msjse xsi:nil=\"true\"/><ynse xsi:nil=\"true\"/><ybtse xsi:nil=\"true\"/><yjse/><fpjgzsbz></fpjgzsbz><znj>0.0</znj><yjjhj>0.0</yjjhj><sqtsje>0.0</sqtsje></clgzssbhzxxForm><fjxxForm><dlrmc></dlrmc><bsrxm></bsrxm><dlrdz></dlrdz><dlrlxdh></dlrlxdh><jsr></jsr><jsrq></jsrq><slswjgmc></slswjgmc><dlrsfzjzlDm1></dlrsfzjzlDm1><dlrsfzjhm1></dlrsfzjhm1></fjxxForm><flzlGrid><flzlGridlb><flzlDm></flzlDm><flzlmc></flzlmc><flzlcllxDm></flzlcllxDm><flzlbslxDm></flzlbslxDm><sfbb></sfbb><sfcy></sfcy><sfgd></sfgd><check></check></flzlGridlb></flzlGrid><fpcjGrid><fpcjGridlb><fpDm></fpDm><jdcxstyfphm></jdcxstyfphm><fpkjrq></fpkjrq><jdcxstyfpjg xsi:nil=\"true\"/><jdcxstyfpjshj xsi:nil=\"true\"/></fpcjGridlb></fpcjGrid><escfpcjGrid><escfpcjGridlb><escxstyfpdm></escxstyfpdm><escxstyfphm></escxstyfphm><fpkjrq></fpkjrq><escxstyfpjg xsi:nil=\"true\"/><escxstyfpjshj xsi:nil=\"true\"/></escfpcjGridlb></escfpcjGrid><yjsxxGrid><yjsxxGridlb><pzzlDm></pzzlDm><pzzg></pzzg><pzhm></pzhm><sjje>0.0</sjje></yjsxxGridlb></yjsxxGrid></clgzssb></body></clgzssbywbw><gcmsbs>0</gcmsbs></SBClhgzxxDrAndJkResVO></taxML>";
        Document  doc = xml2Dom(xml);

        Element root =doc.getRootElement();



        Element SBClhgzxxDrAndJkResVO = root.element("SBClhgzxxDrAndJkResVO");



        Element SBCgsClsbdhJkResVO = SBClhgzxxDrAndJkResVO.element("SBCgsClsbdhJkResVO");

        Element clgzssbywbw = SBCgsClsbdhJkResVO.element("clgzssbywbw");

        Element body = clgzssbywbw.element("body");

        Element clgzssb = body.element("clgzssb");

        Element clgzssbxxForm = clgzssb.element("clgzssbxxForm");


        JcJdchgz jcJdchgz = new JcJdchgz();

        String jdczccchgz = clgzssbxxForm.elementText("jdczccchgz");
        jcJdchgz.setJdczccchgz(jdczccchgz);

        //车辆序列号
        String clxlh = clgzssbxxForm.elementText("clxlh");
        jcJdchgz.setClxh(clxlh);

        //是否为新能源标志
        String sfxny = SBClhgzxxDrAndJkResVO.elementText("sfxny");
        jcJdchgz.setSfxny(sfxny);

        //车辆类别代码
        String cllbDm1 = clgzssbxxForm.elementText("cllbDm1");
        jcJdchgz.setCllbDm(cllbDm1);

        //厂牌
        String clcp = clgzssbxxForm.elementText("clcp");
        jcJdchgz.setClcp(clcp);

        //车辆型号
        String clxh = clgzssbxxForm.elementText("clxh");
        jcJdchgz.setClxh(clxh);

        //吨位
        String cldw = clgzssbxxForm.elementText("cldw");
        jcJdchgz.setCldw(new BigDecimal(cldw));

        //座位数
        String zws = clgzssbxxForm.elementText("zws");
        jcJdchgz.setZws(Integer.valueOf(zws));

        //排气量
        String pql = clgzssbxxForm.elementText("pql");
        jcJdchgz.setPql(pql);

        //车辆购置税燃料能源种类代码
        String clgzsrlnyzlDm = clgzssbxxForm.elementText("clgzsrlnyzlDm");
        jcJdchgz.setClgzsrlnyzlDm(clgzsrlnyzlDm);

        //产地地属性
        String cdsx = clgzssbxxForm.elementText("cdsx");
        jcJdchgz.setCdsx(cdsx);

        //车辆类型代码
        String cllxDm = clgzssbxxForm.elementText("cllxDm");
        jcJdchgz.setCllxDm(cllxDm);
        //车辆名称
        String clmc = clgzssbxxForm.elementText("clmc");
        jcJdchgz.setClmc(clmc);

        //车辆生产企业名称
        String clscqymc = clgzssbxxForm.elementText("clscqymc");
        jcJdchgz.setClscqymc(clscqymc);

        //车辆识别代号车辆识别代号
        String clsbdh = clgzssbxxForm.elementText("clsbdh");
        jcJdchgz.setClsbdh(clsbdh);

        System.out.println(" 合格证 ：  " + jcJdchgz);


    }


    /**
     * 将字符穿转为xml Document 对象
     * @param xml
     * @return
     */
    public static  Document xml2Dom(String xml){

        Document doc = null;


        try {
            doc = DocumentHelper.parseText(xml); // 将字符串转为XML
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return doc;
    }
}
