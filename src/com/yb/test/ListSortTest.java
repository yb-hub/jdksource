package com.yb.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @Auther: Yang
 * @Date: 2020/07/11 10:09
 * @Description: 列表排序调试
 */
public class ListSortTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(4);
        list.sort(Comparator.comparing(number->number));
    }
}
