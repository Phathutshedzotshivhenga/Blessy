/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.percentages;

/**
 *
 * @author PHATHUTSHEDZO
 */
public class Percentages {

    public static void main(String[] args) {
        double val1 = 2.0;
        double val2 = 5.0;
        
        computePercent(val1, val2);
        computePercent(val2, val1);
    }
    
    public static void computePercent(double num1, double num2) {
        double result = (num1/num2)*100;
        System.out.println(num1 + "is" + result +"percent of" + num2);
    }
}
