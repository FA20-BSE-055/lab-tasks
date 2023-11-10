/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask2;
class MultiplicationHandler implements CalculationHandler {
    private CalculationHandler nextHandler;

    @Override
    public int handleRequest(int a, int b) {
        if (a * b <= 5000) {
            return a * b;
        } else if (nextHandler != null) {
            return nextHandler.handleRequest(a, b);
        } else {
            throw new UnsupportedOperationException("Cannot handle the request");
        }
    }

    @Override
    public void setNextHandler(CalculationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}