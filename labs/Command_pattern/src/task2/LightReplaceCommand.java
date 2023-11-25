/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task2;

public class LightReplaceCommand implements Command {
    // Reference to the old light
    private Light oldLight;

    public LightReplaceCommand(Light oldLight) {
        this.oldLight = oldLight;
    }

    public void execute() {
        oldLight.displayStatus();
        oldLight.switchOff();
        
        // Replace the light (for demonstration purposes, creating a new light)
        Light newLight = new Light();
        System.out.println("Replacing the light...");

        // Turn on the new light
        newLight.switchOn();
        System.out.println("New light is on");
    }
}