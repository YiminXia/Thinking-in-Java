package com.sunlands.xiayimin.chapter11;

import java.util.ArrayList;

/**
 * Created by sunlandsxym on 2017/7/2.
 */

class GrannySmith extends Apple{}
class Gala extends Apple{}
class Fuji extends Apple{}
class Breaburm extends Apple{}


public class GenericsAndUpcasting11_1 {
    public static void main(String[] args){
        ArrayList<Apple> apples=new ArrayList<Apple>();
        apples.add(new GrannySmith());//可以将Apple的子类型添加到被指定的，专门保存Apple对象的容器中
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Breaburm());
        for(Apple demp:apples){
            System.out.println(demp);
        }
    }
}
