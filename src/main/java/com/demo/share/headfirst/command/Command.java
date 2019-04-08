package com.demo.share.headfirst.command;

import com.demo.share.headfirst.command.goods.BaseGoods;

/**
 * Created by youngwa on 2019/04/08. 21:47
 */
public interface Command {
    void excute();
    void undo();
}
