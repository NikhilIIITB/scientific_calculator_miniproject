package org.spe;

public class Calculator {


//    public int add (int num1 ,int num2)
//    {
//        return num1 + num2;
//    }
//
//    public int sub (int num1 ,int num2)
//    {
//        return num1 - num2;
//    }

    public float squareRoot(float num) {
        if ( num<0) return -1;
        return Math.sqrt(num);
    }
    public int factorial(int num) {
        if ( num<0) return -1;
        int ans =1;
        for(int i=1;i<=num;i++) ans*=i;
        return ans;
    }
    public float naturalLogarithm(float num) {
        if ( num<0) return -1;
        return Math.log(num);
    }

    public float power(float base, float exponent) {
        return Math.pow(base, exponent);
    }
}
