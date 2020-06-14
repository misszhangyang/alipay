package com.alipay.demo.config;

/**
 * yangzhang
 * 2020/6/14
 * 11:57 上午
 **/
public class AlipayConfig {
    //商户id
   public static String  APPID = "2016102200738702";
   //商户私钥
   public static String RSA_PROVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCFe11v7ty21hJQzOxedrGDZbMBJKkdJ0ILf16qqxeOB6aiKyB0vqfHXm4hSWRFaS/CrwiDYBpgUXhYfP8CZM+E2/w3I3CaKblDv4RfR4w8s1Uj+0gbp1t/235nPJvB3WODmt6kmqso6apn/NZ+U8ZbVVERe2XweFc8EmYihTo1dxWeUIuMpHvEuAmC1Kq11kfPpDymMzODlZHzOdJBKFWZFUJ3XlXJwl3pxWx0Bdfyx+2i6EzBm+Tlfwn76fO2FaukO523LzxfHvn/i6M5/NNH1xqmEAsVwThxzDLqbwXcukNLOyBCyhTo3+fKbPgLLFirGji/HDUkowD1CKjMHM4RAgMBAAECggEAA0uiaOsKw/DRDvGgPEzN4SKXosWW70NS3BnO6oPC1xzVPle2O2uhlMh+C5BWS2hnZ3UOzr+Gpy4bvIOJgDOg8/TCa1ISq5uwGT4XNIr9qVn8FiFUDGq7VZLDsiTK66RdmpguOv4ej6oFLQAPA5tp4ENg9v+G6sLt1GvX3a5QW5WFjM4KskaGdRbcII586u0urOAnUSS/Y0dh5CMX39aZebb8PfNyy5QXfRGISieyqWAzSAETegoMOhm4OEHI6Ri+8UUmtPSpkxWewGtrFpTj0c2Apw5DwQTe137vG0rTDCR8qnUQr+E+XlGvZEB9scWmx9HjIpzwFsQrtJ1PDNjf4QKBgQD3SeqQgBLBMcCZQTUMK+9JfKKS+NxI/2X0LCo27c8yj3AzCPt8iVZwbuWWkcvn87P3r6W2qIhnyrDOtQqYvRMj5KFOuPUedPVnFtbcHcfCTwdTrvxgFWRvy6Ca6RM2LVR+ri+4Wm00NLbEaPtXaZGauwYk9Y+TMFRKNlCFbDVjnQKBgQCKLx9+Uk8pEpmUbD7fL2J30/uetoGNKY/yBtN7N74wmElMrCQTUGtxQHzkLEZ3Q0rq16xcA1EnAnK6zk7fvPDNrd4HxvMmf6ZG9QU7PmLi+oBHWfo5g0USo1uY6zf/8o51/Kbp0KQJl/0y5Wr9n34sxoTlMQOAxmHxKYP6h3iMBQKBgQCUVLslqB0X048SnoGCZownCWK/RBVmmAQA3ckIn8cMLewAQOARCJRX5r1CfvvPi2glJzAAi8EeeP9rTj8n9SoY+pgjj2BAv6lAB/wjlp1vGVZsxObPf6V6Rat1oF8MvU4Umsk3DM66ZPBIiixRd5qGNK7v1ngjsvaseT39ejXgJQKBgF4ShpYw4sNLblKk/ohicd6x6fK6vKelS+Gw0/hmkovyoLQZ3NVpQjvvcxbDLZWzsiT+ftCFUZIFEKYsHXYj4qujWixhPNdQv5o+5DjY1+k+MGZi0v6kZzmxDIKmX5FXR7T7M4aqC4KcfjtQA+51zigdXgvJumDIrZTIdpjv8RkhAoGBAJRjwsm0vMGfHAEnmWkqh8JnDSTCpZ6UviJdQ3D7oAk8zY/YmSrca2J3g1XbPXScL8VCrK6kd/TzrJPi17zwNN4mFCPvwNF1lhguXiXIHbLKi2/Kluf5KibWObeFXxhWGma91GiPhrd+mhb7BwcFap+3Z4m/DF5sH64XxhrURwrb";
   //异步回调地址
   public static String NOTICE_URL = "www.baidu.com";
   //同步回调地址
   public static String RETURN_URL = "www.baidu.com";
   //支付宝接口地址
   public static String  URL = "https://openapi.alipaydev.com/gateway.do\n";
   //编码格式
   public static String CHARSET = "utf-8";
   //报文格式
   public static String FORMAT = "json";
   //支付宝公钥
   public static String RSA_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmNGcIktmsdnP1kGwsjyXfsN5xBVmacNXMiUx0RL7DRswQHqAw/Rp7eDCJRmqKcqYvn+uC9YITpSxaxazIPYN5DWsJGLORRYx+JjzcYculvEpzRdoR12Rgvs1y1oUXM3st6K/PlL84/ixcEQEu328lUX7ZZciok+7xrxVAJDUKHyRLsaoi7hL2Nrt6hxVo1OaUzgb0L7odaqg65b247iycaRHY8JXowtbc/lh74m1e807GbUV2S5vQwR9f57E/vze1rUCtchpMFQKsMa/uYHBI6/YQmzp9ZrE4U3lfURuZxnyx/iKPnPorH0hhcMfKnxFvcHpmJnqrQ6It92kwMrXEwIDAQAB";
   //签名方式
   public static String SIGNTYPE = "RSA2";
}
