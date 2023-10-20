/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package add_computerpart;


public class MultimediaVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Motherboard motherboard) {
        System.out.println("Adding multimedia support to the motherboard.");
    }
}