/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxy_pattern;

public class RemoteImage implements Image{
    @Override
    public void display(String actualSource) {
        System.out.println("Loaing image from actual source "+actualSource);
    }
}