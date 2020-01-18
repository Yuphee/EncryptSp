package com.zhangyf.jni;

/**
 * Created by zhangyf on 2017/2/27.
 */

public class JniUtils {
    static {
        System.loadLibrary("encryptsp");
    }

    public static native String getEncryptKey();
}
