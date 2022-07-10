package com.eara.javacore.primitives;

public class PrimitiveTypes {
    
    public static void main(String[] args) {
        byte b = 1;
        short s;
        s = 2;
        int i = 3;
        long l = 4;

        char c = 'a';
        boolean bool = true;

        float f = 1.2f;
        double d = 1.3;

        long l2 = 2_000_000_000_000L;

        // Primitive types conversion
        int i3 = s;
        char c2 = 100;
        System.out.println(c2);

        double d2 = i3;
        System.out.println(d2);

        d2 = l;
        System.out.println(d2);

        b = (byte) i3;
        System.out.println(b);
    }
}
