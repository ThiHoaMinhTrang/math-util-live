/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fu.mathutil;

/**
 *
 * @author trangthi
 */
// ta viết cái class để cung cấp tiện ích cho nơi khác xài
// khi ta cung cấp tiện ích cho nơi khác xài, đó là lúc ta ko cần nhớ cái gì cho riêng ta, hàm static giúp làm điều này
public class MathUtil {
    public static long getFactorial(int n){
        if(n < 0 || n > 20)
        throw new IllegalArgumentException("Invalid argument. n must be between 0...20"); // hàm dừng liền ko cần return
        if(n == 0 || n == 1)
            return 1;// khi n đặc biệt
        long product = 1;
        for(int i = 2; i <= n; i++)
            product *= i;
           return product;
        
    }
}
