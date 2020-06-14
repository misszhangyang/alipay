package com.alipay.demo.vo;

/**
 * yangzhang
 * 2020/6/14
 * 12:19 下午
 **/
public class AlipayVO {
    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getTradeCount() {
        return tradeCount;
    }

    public void setTradeCount(String tradeCount) {
        this.tradeCount = tradeCount;
    }

    public String getTradeDesc() {
        return tradeDesc;
    }

    public void setTradeDesc(String tradeDesc) {
        this.tradeDesc = tradeDesc;
    }

    public String getTradeAsc() {
        return tradeAsc;
    }

    public void setTradeAsc(String tradeAsc) {
        this.tradeAsc = tradeAsc;
    }

    public String getTradeTimeout() {
        return tradeTimeout;
    }

    public void setTradeTimeout(String tradeTimeout) {
        this.tradeTimeout = tradeTimeout;
    }

    //商品id
    private String tradeId;
    //商品名称
    private String tradeName;
    //交易金额
    private String tradeCount;
    //商品描述
    private String tradeDesc;
    //商品码
    private String tradeAsc;
    //交易超时时间
    private String tradeTimeout;

}
