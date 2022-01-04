package org.com.model.response;


import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

/**
 * 普通返回--统一出口
 * @param <T>
 * @author: 黄启钦
 * @Createtime: 2021-11-10
 */
@Data
public class SimpleResponse<T> implements Serializable {

    protected String success;
    protected String code;
    protected String message;
    protected Long timestamp;
    protected Integer total;
    protected T data;

    public static <T> SimpleResponse<T> success() {
        return newInstance("true", "000000", "ok", null);
    }
    public static <T> SimpleResponse<T> success(T data) {
        return newInstance("true", "000000", "ok", data);
    }
    public static <T> SimpleResponse<T> success(String message) {
        return newInstance("true", "000000", message, null);
    }
    public static <T> SimpleResponse<T> success(String code, String message) {
        return newInstance("true", code, message, null);
    }
    public static <T> SimpleResponse<T> success(String code, String message,Integer total, T data) {
        return newInstance("true", code, message, total,data);
    }
    public static <T> SimpleResponse<T> success(String code, String message, T data) {
        return newInstance("true", code, message, data);
    }
    public static <T> SimpleResponse<T> failure() {
        return newInstance("false", "111111", "error", null);
    }
    public static <T> SimpleResponse<T> failure(T data) {
        return newInstance("false", "111111", "error", data);
    }
    public static <T> SimpleResponse<T> failure(String message) {
        return newInstance("false", "111111", message, null);
    }
    public static <T> SimpleResponse<T> failure(String code, String message) {
        return newInstance("false", code, message, null);
    }

    public static <T> SimpleResponse<T> failure(String message, T data) {
        return newInstance("false", "111111", message, data);
    }
    public static <T> SimpleResponse<T> failure(String code, String message, T data) {
        return newInstance("false", code, message, data);
    }
    public static <T> SimpleResponse<T> newInstance(String success, String code, String message, T data) {
        SimpleResponse<T> response = new SimpleResponse();
        response.success = success;
        response.code = code;
        response.message = message;
        response.timestamp = System.currentTimeMillis();
        response.data = data;
        return response;
    }
    public static <T> SimpleResponse<T> newInstance(String success, String code, String message,Integer total, T data) {
        SimpleResponse<T> response = new SimpleResponse();
        response.success = success;
        response.code = code;
        response.message = message;
        response.timestamp = System.currentTimeMillis();
        response.total = total;
        response.data = data;
        return response;
    }

    public static boolean isSuccess(SimpleResponse response) {
        return Objects.nonNull(response) && "true".equals(response.success);
    }

    public static boolean isFailure(SimpleResponse response) {
        return Objects.isNull(response) || "false".equals(response.success);
    }

}
