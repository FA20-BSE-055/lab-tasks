/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task1;

// Receiver
public class Light {
    private boolean isOn;

    public void switchOn() {
        isOn = true;
        displayStatus();
    }

    public void switchOff() {
        isOn = false;
        displayStatus();
    }

    public void displayStatus() {
        System.out.println("Light is " + (isOn ? "on" : "off"));
    }
}