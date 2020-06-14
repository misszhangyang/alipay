package com.alipay.demo.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeWapPayModel;
import com.alipay.api.request.AlipayTradeWapPayRequest;
import com.alipay.demo.config.AlipayConfig;
import com.alipay.demo.vo.AlipayVO;
import org.springframework.web.bind.annotation.*;

/**
 * yangzhang
 * 2020/6/14
 * 12:17 下午
 **/
@RestController
@RequestMapping("/pay")
public class AlipayController {

    @PostMapping(value = "ali")
    public String payTest(@ModelAttribute AlipayVO alipayVO) throws AlipayApiException {
        //1创建请求客户端
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.URL,AlipayConfig.APPID,AlipayConfig.RSA_PROVATE_KEY,
                AlipayConfig.FORMAT,AlipayConfig.CHARSET,AlipayConfig.RSA_PUBLIC_KEY,AlipayConfig.SIGNTYPE);
        //2创建请求对象
        AlipayTradeWapPayRequest request = new AlipayTradeWapPayRequest();
        //3封装请求参数
        AlipayTradeWapPayModel alipayTradeWapPayModel = new AlipayTradeWapPayModel();
        alipayTradeWapPayModel.setOutTradeNo(alipayVO.getTradeId());
        alipayTradeWapPayModel.setSubject(alipayVO.getTradeName());
        alipayTradeWapPayModel.setTotalAmount(alipayVO.getTradeCount());
        alipayTradeWapPayModel.setBody(alipayVO.getTradeDesc());
        alipayTradeWapPayModel.setTimeoutExpress(alipayVO.getTradeTimeout());
        alipayTradeWapPayModel.setProductCode(alipayVO.getTradeDesc());
        //设置参数
        request.setBizModel(alipayTradeWapPayModel);
        //设置异步回调地址
        request.setNotifyUrl(AlipayConfig.NOTICE_URL);
        //设置同步回调地址
        request.setReturnUrl(AlipayConfig.RETURN_URL);
        //执行请求
        String form = alipayClient.pageExecute(request).getBody();
        System.out.println(form);
        return form;
    }
}
