package com.demo.share.headfirst.command.telecontroller;

import com.demo.share.headfirst.command.Command;
import com.demo.share.headfirst.command.goods.Stereo;

/**
 * Created by youngwa on 2019/04/08. 21:53
 */
public class StereoOff implements Command {

    Stereo stereo;

    public Stereo getStereo() {
        return stereo;
    }

    public void setStereo(Stereo stereo) {
        this.stereo = stereo;
    }

    public StereoOff(Stereo stereo) {

        this.stereo = stereo;
    }

    @Override
    public void excute() {
        stereo.setGoodwitchOn(false);
        System.out.println("the stereo's switch is off");

    }

    @Override
    public void undo() {
        stereo.setGoodwitchOn(true);
        System.out.println("the stereo's switch revoke on");
    }
}
