package com.sunlands.xiayimin.chapter11;
import java.util.*;
/**
 * Created by sunlandsxym on 2017/7/2.
 */
class Snow{};
class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}

public class AsListInference11_3 {
    public static void main(String[] args){
        List<Snow> snow1= Arrays.asList(new Crusty(),new Slush(),new Powder());


        /**
         * Error:(17, 39) java: 不兼容的类型
         需要: java.util.List<com.sunlands.xiayimin.chapter11.Snow>
         找到: java.util.List<com.sunlands.xiayimin.chapter11.Powder>
         */
        //List<Snow> snow2=Arrays.asList(new Light(),new Heavy());

        List<Snow> snow3=new ArrayList<Snow>();
        Collections.addAll(snow3,new Light(),new Heavy());

        List<Snow> snow4=Arrays.<Snow>asList(new Light(),new Heavy());
    }
}
