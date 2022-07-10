package com.eara.javacore.stringmanipulation;

public class StringManipulation {
    
    public static void main(String[] args) {
        String s = "ssssss";
        StringBuffer sb = new StringBuffer("bbbbbb");
        s.concat("-aa");
        System.out.println(s);
        System.out.println(sb);
    }
}
