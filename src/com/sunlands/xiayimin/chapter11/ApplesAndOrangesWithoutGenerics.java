package com.sunlands.xiayimin.chapter11;



class Apples{
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
	// write your code here
    }
}
