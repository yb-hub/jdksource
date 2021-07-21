package com.yb.test;

import java.util.HashMap;

/**
 * @Auther: Yang
 * @Date: 2020/06/27 17:43
 * @Description:
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("k1","v1");
        hashMap.put("k3","v3");
        hashMap.put("k2","v2");
        for (int i = 4; i < 1500; i++) {
            hashMap.put("k"+i,"v"+i);
        }
    }
}
