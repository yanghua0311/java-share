package com.demo.share.headfirst.command;

import com.demo.share.headfirst.command.goods.Light;
import com.demo.share.headfirst.command.goods.Stereo;
import com.demo.share.headfirst.command.telecontroller.LightOffCommand;
import com.demo.share.headfirst.command.telecontroller.LightOnCommand;
import com.demo.share.headfirst.command.telecontroller.StereoOff;
import com.demo.share.headfirst.command.telecontroller.StereoOn;

/**
 * Created by youngwa on 2019/04/08. 22:13
 *
 * 命令模式：定义命令对象操作的接口，在命令对象中实现操作，该操作应由相应的命令接收者（接收者的也可以由命令对象本身实现）接收，
 * 构建一个调用者，将需要的命令对象塞入其中，执行命令对象的excute方法就可把对应的命令发送给接受者，实现撤销则添加undo和堆栈记录命令。
 */
public class TestCommand {
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();
        Light light = new Light();
        Stereo stereo = new Stereo();
        control.setCommand(0,new LightOnCommand(light), new LightOffCommand(light));
        control.setCommand(1, new StereoOn(stereo), new StereoOff(stereo));
        control.offButtonPushed(1);
        control.offButtonPushed(0);
        control.revoke();
        control.onButtonPushed(0);
        control.revoke();
    }
}
