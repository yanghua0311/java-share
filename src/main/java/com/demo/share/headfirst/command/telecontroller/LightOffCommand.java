package com.demo.share.headfirst.command.telecontroller;

import com.demo.share.headfirst.command.Command;
import com.demo.share.headfirst.command.goods.Light;

/**
 * Created by youngwa on 2019/04/08. 21:52
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public Light getLight() {

        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }
    @Override
    public void excute() {
        light.setGoodwitchOn(true);
        System.out.println("the light's switch is off");
    }

    @Override
    public void undo() {
        light.setGoodwitchOn(false);
        System.out.println("the light's switch revoke on");
    }
}
