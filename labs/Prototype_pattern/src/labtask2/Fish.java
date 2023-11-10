/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask2;

import java.util.Objects;

class Fish implements Shape {
    private String species;

    public Fish(String species) {
        this.species = species;
    }

    // Implementing the clone method
    @Override
    public Fish clone() {
        return new Fish(this.species);
    }

    // Implementing the equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Fish other = (Fish) obj;
        return Objects.equals(other.species, species);
    }

    @Override
    public boolean equals(Shape other) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}