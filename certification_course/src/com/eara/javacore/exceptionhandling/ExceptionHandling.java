package com.eara.javacore.exceptionhandling;

public class ExceptionHandling {

    public static void main(String[] args) {
        try {
            foo();
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("B");
        } finally {
            System.out.println("C");
        }
    }

    private static void foo() throws Exception {
        try {
            System.out.println("A1");
            throw new Exception();
        } catch (Exception e) {
            System.out.println("B1");
        } finally {
            System.out.println("C1");
        }
    }
}
