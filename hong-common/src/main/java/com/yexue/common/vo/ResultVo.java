package com.yexue.common.vo;

import lombok.Data;

@Data
public class ResultVo {

    private int code; // 状态码，例如200表示成功，400表示错误

    private String message; // 错误或提示信息

    private Object data; // 返回的数据对象，如果为空则为null

    public ResultVo(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static ResultVo success() {
        return new ResultVo(200, "操作成功", null);
    }
    public static  ResultVo success(String msg,Object data) {
        return new ResultVo(200, msg, data);
    }
    public static  ResultVo success(Object data) {
        return new ResultVo(200, "操作成功", data);
    }

    public static ResultVo error(int code, String message) {
        return new ResultVo(code, message, null);
    }
    public static ResultVo error(String message) {
        return new ResultVo(400, message, null);
    }
    public static ResultVo error() {
        return new ResultVo(400, null, null);
    }
}
