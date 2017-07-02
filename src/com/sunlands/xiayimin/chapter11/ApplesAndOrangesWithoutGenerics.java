package com.sunlands.xiayimin.chapter11;
import java.util.ArrayList;

class Apple{
    private static long counter;
    private final long id=counter++;
    public long id(){
        return id;
    }
}
class Oranges{

}

public class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        /**
        ArrayList apples=new ArrayList();
        for(int i=0;i<3;i++){
            apples.add(new Apples());//not prevented from adding an orange to apples
        }
        apples.add(new Oranges());
        for(int i=0;i<apples.size();i++){
            ((Apples)apples.get(i)).id();//java.lang.ClassCastException
        }
         **/
        ArrayList<Apple> apples=new ArrayList<Apple>();
        for(int i=0;i<3;i++){
            apples.add(new Apple());
        }
        //apples.add(new Oranges());//这时候，变成了编译期错误
        for(int i=0;i<apples.size();i++){
            System.out.println(apples.get(i).id());
        }
        for(Apple demo:apples){
            System.out.println(demo.id());
        }
    }
}
