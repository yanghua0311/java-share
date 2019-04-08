package com.demo.share.headfirst.command.telecontroller;

import com.demo.share.headfirst.command.Command;
import com.demo.share.headfirst.command.goods.Stereo;

/**
 * Created by youngwa on 2019/04/08. 21:53
 */
public class StereoOn implements Command {

    Stereo stereo;

    public Stereo getStereo() {
        return stereo;
    }

    public void setStereo(Stereo stereo) {
        this.stereo = stereo;
    }

    public StereoOn(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void excute() {
        stereo.setGoodwitchOn(true);
        System.out.println("the stereo's switch is on");
    }

    @Override
    public void undo() {
        stereo.setGoodwitchOn(false);
        System.out.println("the stereo's switch revoke off");
    }
}
