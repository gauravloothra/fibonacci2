/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci2;
import java.util.*;
import java.math.*;
import java.io.*;

/**
 *
 * @author Gaurav
 */
public class Fibonacci2 {

    static int MAX=1000;
    static long f[];
    
    public static long fib(int n){
    
    if(n==0)
        return 0;
    if(n==1 || n==2)
        return (f[n]=1);
    if (f[n]!=0)
        return f[n];
    int k =(n&1)==1? (n + 1) / 2 : n / 2;
    
    f[n] = (n & 1) == 1? (fib(k) * fib(k) + fib(k - 1) * fib(k - 1)): (2 * fib(k - 1) + fib(k)) * fib(k);
    //f[n]= (n&1)==1? (fib(k)*fib(k)) - (fib(k-1)*(fib(k-1))) : (2*fib(k-1)+fib(k))*fib(k);
    return f[n];
    }
    
    public static void main(String[] args) {
     int n=5;
     f=new long[MAX];
     System.out.println(fib(n));
     
    }
    
}
