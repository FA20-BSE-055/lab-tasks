/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package labtask2;

interface CalculationHandler {
    int handleRequest(int a, int b);
    void setNextHandler(CalculationHandler nextHandler);
}
