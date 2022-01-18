package com.java.study;

public class Generic<T> {

    public void pairTest(){

        boolean b = compare(new Pair(1,"a"), new Pair(2, "b"));
        System.out.println(b);


    }

    public boolean compare(T t1, T t2) {
        if(t1.equals(t2)){
            return true;
        }
        return false;
    }


    public <K,V> boolean compare(Pair<K,V> p1, Pair<K, V> p2){
        boolean x = p1.getKey().equals(p2.getKey());
        boolean y = p1.getValue().equals(p2.getValue());
        return x && y;
    }


    
    
}
