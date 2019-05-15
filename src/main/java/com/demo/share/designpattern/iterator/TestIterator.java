package com.demo.share.designpattern.iterator;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * 迭代器模式，隐藏内部迭代过程，整洁易懂
 * Created by youngwa on 2019/05/15. 21:51
 */
public class TestIterator {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Iterator listIterator = ListIterator.create(list, 2);
       while (listIterator.hasNext()) {
           System.out.println(listIterator.next());
       }


    }
}
