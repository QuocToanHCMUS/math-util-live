/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hcmus.mathutil;

/**
 *
 * @author Toan
 */
//TA VIẾT CÁI CLASS ĐỂ CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI
//KHI TA CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI, ĐÓ LÀ LÚC TA K CẦN NHỚ CÁI GÌ
//CHO RIÊNG TA , HÀM STATIC GIÚP LÀM ĐIỀU NÀY
public class MathUtil {
    
    //n! = 1.2.3.4.5.6...n
    //Quy ước : 0! = 1! = 1
    //K tính giai thừa số âm
    //20! là vừa khớp kiểu long, kiểu long tối đa 18 con số 0 
    //21! lố kiểu long
    //nếu đưa vào âm , 21! , ta k tính, ta đập vào mặt ai xài hàm
    //một cái ngoại lệ , chửi k tính được
    public static long getFactorial(int n){
        if (n < 0 || n > 20 )
            throw new IllegalArgumentException("Invalid argument. n must be between 1..20");
        //hàm dừng liền k cần return
        
        //xuống đây là n = 0..20 òi
        if (n == 0 || n ==1)
            return 1;   //dừng ngay khi n đặc biệt
        
        //xuống đến đây , n = 2..20 rồi
        //chơi for hoặc đẹ quy -  recursion
        //kĩ thuật nhồi con heo đát , ốc bưu dồn thịt
        //i=2 , i=3 ,...,i=n nhồi liên tục i vào tích
        long product = 1;//tích khởi đầu = 1 , nhồi 2 3 4 ...n
        
        for (int i = 2; i <= n;i++)
            product *= i;   //product = product * i ; //nhòi liên tục product
            //nhân từ 2 đến b
        return product;
    }
    
}
