package com.demo.share.jvm;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * ..
 *
 * @author 杨华
 * @date 2018-09-06 13:26
 */
public class StringIntern {
    public static void main(String[] args) {
//        List<TestCase> cases = new ArrayList<TestCase>();
//        while(true){
//            cases.add(new TestCase());
//        }
        // 10MB的PermSize在integer范围内足够产生OOM了
//        String uuid = null;
//
//        while (true) {
//            uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
//            uuid.intern();
//        }
        String str1=new String("zzzz")+new String("k");
        String a=str1.intern();
        System.out.println(a == str1);
        String s="zzzzk";
        System.out.println(s == a);

    }
}
class TestCase{



}
