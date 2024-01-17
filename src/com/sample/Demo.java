package com.sample;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
/*
int --> Integer
float-->Float
char-->Character
long-->Long
byte-->Byte
double-->Double
short-->Short
boolean-->Boolean
 */
int i=10;
Integer intObj=Integer.valueOf(i); //convertion of premetive to object-->boxing
Integer intAnotherObj=i;    //autoboxing
int j=intAnotherObj.intValue();//unboxing

long l=20;
Long lobj=l;
        System.out.println("Long obj: "+lobj);

float f=2.14F;
Float fobj=f;
        System.out.println(fobj.intValue());

        char c='a';
        Character charObj=c;
        System.out.println(charObj.charValue());
boolean b=true;
Boolean bobj=b;
        System.out.println(bobj.booleanValue());

        CustomWrapperClass obj = new CustomWrapperClass(10);  //custom Wrapper Class
        System.out.println(obj.getValue());
    }
}
class ABC implements List{}