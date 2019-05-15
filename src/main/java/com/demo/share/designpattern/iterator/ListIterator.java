package com.demo.share.designpattern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * Created by youngwa on 2019/05/15. 21:45
 */
public class ListIterator implements Iterator {

    private List list;

    private int subSize;

    private int position = 0;

    private ListIterator(List list, int subSize) {
        this.list = list;
        this.subSize = subSize <= 0 ? 1 : subSize;
    }


    @Override
    public boolean hasNext() {
        return position != list.size();
    }


    @Override
    public List next() {
        int endSize = position + subSize;
        if (endSize > list.size()) {
            endSize = list.size();
        }
        List list = this.list.subList(position, endSize);
        position = endSize;
        return list;
    }

    public static ListIterator create(List list, int subSize) {
        return new ListIterator(list, subSize);
    }
}
