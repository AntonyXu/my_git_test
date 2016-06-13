/*
 * Copyright 2014 D.CN Inc.
 */
package com.downjoy.membersystem;

import com.downjoy.membersystem.utils.JSTLFuncs;
import com.yupstudio.common.util.AppProp;

/**
 * 常用变量定义接口.
 */
public interface Constant {

    public static int COUNT_PHONE_TIMES = 10;
    public static int COUNT_EMAIL_TIMES = 20;
    public static int MEM_CACHE_TIME = 172800;  //注册时，填写的注册信息48小时内有效

    public static String USER_TOKEN_COOKIE_NAME = "ut";

    // 手机、邮箱验证码发送间隔时间，单位：秒
    int retryTimeOfSendValidCode = 120;
    // 手机、邮箱验证码有效时间，单位：秒
    int effectiveTimeOfValidCode = 30 * 60;

    String TOKEN_ERROR = "校验逻辑出错，请重新开始业务流程!!";
    String SMS_GATE_MODULE_NAME = "dj-membersystem";
    /**
     * 验证码密文.
     */
    String DES_KEY = "d.cn.2013.12.12";

    /**
     * 第三方绑定的密钥.
     */
    String TP_BIND_DES_KEY = "6n1s03SA";

    String COOKIE_VERIFY_ENCRYPTCODE = "dcn_user";

    /**
     * cookie失效时间.
     */
    int COOKIE_AGE = 60 * 60;

    String SYSTEM_ERROR_INFO = "系统繁忙，请稍候再试";

    String GO_RESET_PWD_URL = JSTLFuncs.getContextWeb() + "/goResetPwd.html";

    String GO_REGISTER_URL = JSTLFuncs.getContextWeb() + "/register.html";

    String USER_AVATAR_FORMAT = "https://avatar.d.cn/userhead/get?mid=%d&size=middle";

    /**
     * TODO 邮件绑定登陆手机验证url.
     */
    String EMAIL_BIND_NUM_VALIDATE_URL = JSTLFuncs.getContextWeb() + "/num/validateBindNumNext.html";

    /**
     * TODO unbindNum.html 邮件解绑登陆手机验证.
     */
    String EMAIL_UNBIND_NUM_VALIDATE_URL = JSTLFuncs.getContextWeb() + "/num/unbindNum.html";

    String EMAIL_BIND_SECURITY_NUM_VALIDATE_URL = JSTLFuncs.getContextWeb() + "/num/validateBindSecurityNumNext.html";

    String EMAIL_UBIND_SECURITY_NUM_VALIDATE_URL = JSTLFuncs.getContextWeb() + "/num/validateUnbindSecurityNumNext.html";

    String PARAM_KEY_EQP_ID = "pfk";

    String PARAM_KEY_ENTRY_FROM_ASSO_AD = "faadi";

    String BBS_MODULE_ROOT_URI = JSTLFuncs.getContextWeb() + "/";

    int MEMBER_INFO_XOR_KEY = 926316475;

    int INFO_STR_PWD_LENGTH = 13;

    /**
     * 自动登录cookie失效时间为30天.
     */
    int LONG_STANDING_COOKIE_AGE = 24 * 60 * 60 * 30;

    int SHORT_LIVED_COOKIE_AGE = -1;

    int COMFIRM_REMEMBER_PASSWORD = 1;

    String WEB_MY_D_CN = "http://my.d.cn/";

    String WAP_LOGIN_DEFAULT_FROM = "http://x.d.cn/";

    String WEB_LOGIN_DEFAULT_FROM = "http://www.d.cn/";


    Long MEMBERID_SYSTEM = AppProp.readLong("mid.system");

    String CREATED_BY_INFO_SYSTEM = AppProp.read("mid.system.created.by.info");

    /**
     * 腾讯微博密钥.
     */
    Long THIRD_PART_APP_ID_TENCENT_WEB = 100248959l;

    String THIRD_PART_APP_SECRET_TENCENT_WEB = "a88924b1cf2a30963352c673e0968cc5";

    Long THIRD_PART_APP_ID_TENCENT_SDK = 101233242L;

    String THIRD_PART_APP_SECRET_TENCENT_SDK = "f91d115ea140a96fb202a8d4b723c39d";


    String THIRD_PART_APP_ID_WEIXIN = "wx2ba52c70f67e3a2a";

    String THIRD_PART_APP_SECRET_WEIXIN = "60f7a4d1851210c00f1cce16e0a0c09b";

    String GO_BIND_REGISTE_URL = JSTLFuncs.getContextWeb() + "/goBindRegister.html";

    String MEMBER_REQ_KEY = "MEMBER_REQ_KEY";

    String MEMBER_ID_REQ_KEY = "MEMBER_ID_REQ_KEY";
    /**
     * 发送短信功能的页面验证码保存在缓存中的key的格式.
     */
    String SENDSMS_VERIFY_CODE_CACHE_FORMAT = "sendsms_verifycode_%s";

    /**
     * 8个字符和数字.
     */
    String REG_DIGIT_AND_CHAR_8 = "^\\w{8}$";

    /**
     * 同一IP、同一天内，MSN注册次数的缓存Key值.
     */
    String REGISTER_COUNT = "register_count";

    String AMBI_CACHE_KEY_FORMAT = "ambi:%s:%s";
    /**
     * 频次限制的缓存key；
     * 参数1为限制维度（ip地址或者乐号等）；参数2为业务标识
     */
    String FREQUENCY_LIMIT_KEY_FORMAT = "oauth.d.cn/auth/frequencylimit/%s_%s";

    //用户原始密保信息码
    String CACHE_VALID_SECURITY_VALUE_FORMAT = "MEMBER_CACHE_CACHE_SECURITY_VALUE_%s";

    String MEMBER_APPEAL_INFO_FORMAT = "MEMBER_APPEAL_INFO_%s";

    public static final String SOURCE_KEY_MEMBER_SYSTEM = "OcKC3HdaGzCI";


    /**
     * ***************************** register ************************************
     */
    String PHONE_VCODE_TIME = "phone_vcode_time:%s"; //电话验证码发送次数 phone
    String EMAIL_LINK_TIME = "phone_vcode_time:%s"; //邮箱验证发送次数  email
    String PHONE_VCODE = "phone_vcode:%s"; //电话验证码


    /********************************************************************************/
}
