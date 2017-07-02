package com.sunlands.xiayimin.chapter11;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by sunlandsxym on 2017/7/2.
 */
public class SimpleCollection11_2{
    public static void main(String[] args){
        Collection<Integer> c=new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            c.add(i);
        }
        for(Integer i:c){
            System.out.println(i+" ");
        }
    }
}
