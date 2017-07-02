package com.sunlands.xiayimin.chapter11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.*;
/**
 * Created by sunlandsxym on 2017/7/2.
 */
public class AddingGroups11_3 {
    public static void main(String[] args){
        /**Arrays.asList()方法接受一个数组，或者是一个用
         *逗号分割的元素列表，然后将其转化为一个List对象。
         * Collection构造器可以接受另一个Collection，用它来将自身初始化
         * 因此你可以使用Arrays.asList()来为这个构造器产生输入
         */
        Collection<Integer> collection=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));//Arrays.asList()方法接受一个数组，或者是一个用
        Integer[] moreInts={6,7,8,9,10};                                                //逗号分割的元素列表，然后将其转化为一个List对象
        collection.addAll(Arrays.asList(moreInts));//Collection.addAll()方法，只能接受另一个Collection对象作为参数
        for(Integer demo:collection){
            System.out.print(demo+" ");
        }
        System.out.println();


        Collections.addAll(collection,11,12,13,14,15);//Collections.addAll()方法接受一个Collection对象，以及一个数组或者一个
        Collections.addAll(collection,moreInts);      //用逗号分隔的列表
        for(Integer demo:collection){
            System.out.print(demo+" ");
        }
        System.out.println();


        List<Integer> list=Arrays.asList(16,17,18,19,20);
        list.set(1,99);
        for(Integer demo:list){
            System.out.print(demo+" ");
        }
        System.out.println();
    }
}
