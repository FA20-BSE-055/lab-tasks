/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxy_pattern;

public class RemoteProxyImage implements Image{
    private String remoteSource;
    public RemoteProxyImage(String rSource){
        this.remoteSource = rSource;
    }
    @Override
    public void display(String rSource) {
        if(remoteSource.equals(rSource)){
            new RemoteImage().display(rSource);
        }
        else{
            System.out.println("Loaing image from fake source of type "+ rSource);
        }
    }
}
