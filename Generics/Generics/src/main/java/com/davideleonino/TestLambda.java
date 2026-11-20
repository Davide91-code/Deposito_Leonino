package com.davideleonino;

@FunctionalInterface
interface HelloInterface1 {
    public void displayHello();

    //With Java 8
    public class HelloWithLambda {

        public static void main(String[] args) {
            HelloInterface1 helloInterface1 = () -> System.out.println("Helloh);
                    helloInterface1.displayHello();

        }

    }

}
