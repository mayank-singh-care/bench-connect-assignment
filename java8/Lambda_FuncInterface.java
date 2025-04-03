package com.bench_connect.java_8;

//import com.bench_connect.Java8StreamProblems.MyFunctionalInterface;

public class Lambda_FuncInterface {

	@FunctionalInterface
    interface MyFunctionalInterface {
        void sayHello();
    }
    public static void functionalInterfaceExample() {
        MyFunctionalInterface greeting = () -> System.out.println("Hello from Lambda!");
        greeting.sayHello();
    }
    
    public static void main() {
    	functionalInterfaceExample();
    }
    
}
