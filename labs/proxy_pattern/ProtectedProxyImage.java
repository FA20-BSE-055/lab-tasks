/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxy_pattern;

public class ProtectedProxyImage implements Image{
    private String allowedUsers;
    private String userName;
    public ProtectedProxyImage(String userName){
        this.userName = userName;
        allowedUsers = "ali,fahad";
    }
    @Override
    public void display(String imageType) {
        if(allowedUsers.contains(userName)){
            System.out.println(userName + " authenticated.");
            new ProtectedImage().display(imageType);
        }
        else {
            System.out.println(userName + " not authenticated and display a fake image to him.");
        }
    }
}
