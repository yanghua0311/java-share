package com.demo.share.headfirst.singleton;

public class EnumSingleton {
    private EnumSingleton() {
    }

    public static EnumSingleton getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton {

        INSTANCE {
            @Override
            public EnumSingleton getInstance2() {
                return null;
            }
        };

        private EnumSingleton singleton;

        //JVM会保证此方法绝对只调用一次
        Singleton() {
            singleton = new EnumSingleton();
        }

        public EnumSingleton getInstance() {
            return singleton;
        }

        public abstract EnumSingleton getInstance2();
    }
}
