package com.yz.encryptsp.utils;


import com.yz.encryptsp.hawk.Encryption;

/**
 * Demo
 *
 * @author zhangyf
 */
public class AESEncryption implements Encryption {
    @Override
    public boolean init() {
        AESUtil.getInstance();
        return true;
    }

    @Override
    public String encrypt(String key, String value) throws Exception {
        return AESUtil.getInstance().encrypt(value);
    }

    @Override
    public String decrypt(String key, String value) throws Exception {
        return AESUtil.getInstance().decrypt(value);
    }
}
