/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task1;

// Concrete Command
public class LightOffCommand implements Command {
    // Reference to the light
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }
     public void execute() {
        light.displayStatus();
        light.switchOff();
        System.out.println("Light is off");
    }
}