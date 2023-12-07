package com.blog.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class A{
    public <T> void show(List<T> lst){
        for(T t:lst)
            System.out.println(t);
        lst.forEach(System.out::println);
    }
}
public class Xyz{
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("a");
        lst.add("b");
        lst.add("c");
        List<Integer> l = Arrays.asList(1,2,3);
        A a = new A();
        a.show(lst);
        a.show(l);
//        System.out.println(lst.size());
//        for(String s:lst)
//            System.out.println(s);
//        lst.removeIf(String::isEmpty);
//        System.out.println(lst.size());
//        for(String s:lst)
//            System.out.println(s);
    }

    }


