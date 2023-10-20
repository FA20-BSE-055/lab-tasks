/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package add_computerpart;


public class Main {
    public static void main(String[] args) {
        ComputerPart motherboard = new Motherboard();
        ComputerPartVisitor multimediaVisitor = new MultimediaVisitor();

        motherboard.accept(multimediaVisitor);
    }
}