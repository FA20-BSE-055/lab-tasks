/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxy_pattern;

import java.util.ArrayList;
import java.util.Arrays;

public class ProxyImage implements Image {

    private RealImage realImage;
    private String imageType;
    private String supportedTypes;
    private String fileName;

    public ProxyImage(String fileName, String imageType){
        this.fileName = fileName;
        this.imageType = imageType;
        supportedTypes = "png,svg";
    }

    @Override
    public void display(String imageType) {
        if(supportedTypes.contains(imageType)){
            realImage = new RealImage(fileName);
            realImage.display(imageType);
        }
        else{
            System.out.println("Displaying fake version of "+imageType);
        }
    }
}
