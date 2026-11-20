package com.davideleonino;

public class HelloWithLambda {

    public static void main(String[] args) {
        HelloInterface1 helloInterface1 = () -> System.out.println("Helloh);
                helloInterface1.displayHello();

    }

}

/*
@FunctionalInterface
interface DebugLambdaInterface{
public int sumOfTwoNumbers(int a, int b);

public class DebugLambdaExpression {

public static void main(String[] args) {
System.out.println("Start Main");
DebugLambdaInterface debugLambda = (a, b) -> {
System.out.println("Inside Lambda Expression");
int sum = a + b;
return sum;

e

System.out.println("before calling addTwoNumbers method");
addTwoNumbers(debugLambda);
System.out.println("after calling addTwoNumbers method");
System.out.println("End Main");

private static void addTwoNumbers(DebugLambdaInterface debugLambda) {
System.out.println("Start addTwoNumbers");
System.out.println("Sum of two numbers is |:
System.out.println("End addTwoNumbers");

"+ debugLambda. sumOfTwoNumbers(100, 200));
 */



/*

@FunctionalInterface
interface MethodReference{
void helloMethodReference();

public class StaticMethodReferenceDemo {
static void helloMethodReferencek {
System.out.println("From helloMethodReference!");

}

public static void main(String[] args) {
MethodReference methodReference = StaticMethodReferenceDemo: :helloMethodReference;
methodReference.helloMethodReference();
 */

/*

@FunctionalInterface
interface MethodReference{
void helloMethodReference();

public class StaticMethodReferenceDemo {
static int helloMethodReference() {
System.out.println("From helloMethodReference!");
return 0;

public static void main(String[] args) {
//MethodReference methodReference = StaticMethodReferenceDemo: :helloMethodReference;
MethodReference methodReferenceLambda = () -> StaticMethodReferenceDemo.helloMethodReference();
methodReferenceLambda.helloMethodReference();
 */
