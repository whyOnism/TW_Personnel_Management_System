package com.tw.exception;

import java.util.HashMap;
import java.util.Map;

public class MyException extends Exception {
    private static final long serialVersionUID = 1L;
    private static final Map<Integer, MyException> exceptionMap = new HashMap<>();
    private static final Map<Integer, String> errorMsgMap = new HashMap<>();

    static {
        errorMsgMap.put(401, "用户名已存在！");
        errorMsgMap.put(402, "邮箱已注册！");
        errorMsgMap.put(403, "参数格式错误！");
        errorMsgMap.put(404, "用户名不存在！");
        errorMsgMap.put(405, "邮箱未注册！");
        errorMsgMap.put(406, "密码错误！");
        errorMsgMap.put(407, "权限不足！");
        errorMsgMap.put(408, "请求ID不存在！");
        errorMsgMap.put(409, "验证码错误！");
        errorMsgMap.put(410, "验证码已失效！");
        errorMsgMap.put(411, "请求次数过多，请稍后重试！");
        errorMsgMap.put(412, "请重新登录！");
        errorMsgMap.put(501, "服务器繁忙，请稍后重试！");
        exceptionMap.put(501, new MyException(501, getMessage(501)));
    }

    //异常状态码
    private final int errorCode;
    //异常信息
    private final String errorMsg;

    public MyException(int errorCode, String msg) {
        super(msg);
        this.errorCode = errorCode;
        this.errorMsg = msg;
    }

    public static String getMessage(int errorCode) {
        if (errorMsgMap.containsKey(errorCode))
            return errorMsgMap.get(errorCode);
        else return errorMsgMap.get(501);
    }

    public static MyException getException(int errorCode) {
        if (exceptionMap.containsKey(errorCode))
            return exceptionMap.get(errorCode);
        else if (errorMsgMap.containsKey(errorCode)) {
            MyException ex = new MyException(errorCode, getMessage(errorCode));
            exceptionMap.put(errorCode, ex);
            return ex;
        } else return exceptionMap.get(501);
    }

    public int getErrorCode() {
        return errorCode;
    }

    @Override
    public String getMessage() {
        return errorMsg;
    }
}
