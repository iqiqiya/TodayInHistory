package com.iakie.todayinhistory.bean;

/**
 * Author: iqiqiya
 * Date: 2019-12-24
 * Time: 19:41
 * Blog: blog.77sec.cn
 * Github: github.com/iqiqiya
 */
public class LaoHuangliBean {

    /**
     * reason : successed
     * result : {"id":"3494","yangli":"2019-11-14","yinli":"己亥(猪)年十月十八","wuxing":"大溪水 定执位","chongsha":"冲鸡(己酉)煞西","baiji":"乙不栽植千株不长 卯不穿井水泉不香","jishen":"时德 天德 月德 四相 阴德 民日 三合 时阴 鸣犬","yi":"订盟 纳采 纳财 开市 立券 祭祀 祈福 移徙 入宅 出行 盖屋 起基 修造 动土 竖柱 上梁 安门 安香 出火 教牛马 会亲友 破土","xiongshen":"元武","ji":"嫁娶 安葬 掘井 置产 造船"}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * id : 3494
         * yangli : 2019-11-14
         * yinli : 己亥(猪)年十月十八
         * wuxing : 大溪水 定执位
         * chongsha : 冲鸡(己酉)煞西
         * baiji : 乙不栽植千株不长 卯不穿井水泉不香
         * jishen : 时德 天德 月德 四相 阴德 民日 三合 时阴 鸣犬
         * yi : 订盟 纳采 纳财 开市 立券 祭祀 祈福 移徙 入宅 出行 盖屋 起基 修造 动土 竖柱 上梁 安门 安香 出火 教牛马 会亲友 破土
         * xiongshen : 元武
         * ji : 嫁娶 安葬 掘井 置产 造船
         */

        private String id;
        private String yangli;
        private String yinli;
        private String wuxing;
        private String chongsha;
        private String baiji;
        private String jishen;
        private String yi;
        private String xiongshen;
        private String ji;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getYangli() {
            return yangli;
        }

        public void setYangli(String yangli) {
            this.yangli = yangli;
        }

        public String getYinli() {
            return yinli;
        }

        public void setYinli(String yinli) {
            this.yinli = yinli;
        }

        public String getWuxing() {
            return wuxing;
        }

        public void setWuxing(String wuxing) {
            this.wuxing = wuxing;
        }

        public String getChongsha() {
            return chongsha;
        }

        public void setChongsha(String chongsha) {
            this.chongsha = chongsha;
        }

        public String getBaiji() {
            return baiji;
        }

        public void setBaiji(String baiji) {
            this.baiji = baiji;
        }

        public String getJishen() {
            return jishen;
        }

        public void setJishen(String jishen) {
            this.jishen = jishen;
        }

        public String getYi() {
            return yi;
        }

        public void setYi(String yi) {
            this.yi = yi;
        }

        public String getXiongshen() {
            return xiongshen;
        }

        public void setXiongshen(String xiongshen) {
            this.xiongshen = xiongshen;
        }

        public String getJi() {
            return ji;
        }

        public void setJi(String ji) {
            this.ji = ji;
        }
    }
}

// http://v.juhe.cn/laohuangli/d?date=2014-09-11&key=c7c6d7da1062f007a33609571cdb17f2
