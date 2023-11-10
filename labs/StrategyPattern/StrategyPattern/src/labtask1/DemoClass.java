/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask1;

public class DemoClass {

    public static int operationpower(int base, int exponent) {
        // Calculate the power of a number
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static int operationmultiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
      
        int baseNumber = 2;
        int exponentNumber = 3;
        int resultPower = operationpower(baseNumber, exponentNumber);
        System.out.println(baseNumber + " raised to the power of " + exponentNumber + " is: " + resultPower);

        int number1 = 4;
        int number2 = 5;
        int resultMultiply = operationmultiply(number1, number2);
        System.out.println(number1 + " multiplied by " + number2 + " is: " + resultMultiply);
    }
}
