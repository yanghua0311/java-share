package com.demo.share.headfirst.command;

import java.util.List;
import java.util.Stack;

/**
 * Created by youngwa on 2019/04/08. 22:07
 */
public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;
    Stack<Command> records;

    public RemoteControl() {
        onCommands = new Command[2];
        offCommands = new Command[2];
        records = new Stack<>();
        for (int i = 0; i < 2; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int slot, Command on, Command off) {
        onCommands[slot] = on;
        offCommands[slot] = off;
    }

    public void onButtonPushed(int slot) {
        onCommands[slot].excute();
        records.push(onCommands[slot]);
    }

    public void offButtonPushed(int slot) {
        offCommands[slot].excute();
        records.push(offCommands[slot]);
    }

    public void revoke() {
        if(records !=null && !records.empty()) {
            records.pop().undo();
        } else {
            new NoCommand().excute();
        }
    }
}

class NoCommand implements Command {

    @Override
    public void excute() {
        System.out.println("无命令可以执行");
    }

    @Override
    public void undo() {

    }
}
