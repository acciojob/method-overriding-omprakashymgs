package com.driver;

public class Main {
    public static void main(String[] args) {
     B obj = new B();
     String s = obj.meth();
        System.out.println(s);
    }
}
class A{
    String meth(){
        return  "Invoking method from class A";
    }
}
class B extends A{
    String meth(){
        return  "Method is overridden in Extendend class B";
    }
}