package com.yz.ecptsp.lib;


import com.orhanobut.hawk.Encryption;

/**
 * Demo
 *
 * @author zhangyf
 * @date 2020/1/17 0017.
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
