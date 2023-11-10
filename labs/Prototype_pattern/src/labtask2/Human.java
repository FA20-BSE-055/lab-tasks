/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask2;

import java.util.Objects;

class Human implements Shape {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    // Implementing the clone method
    @Override
    public Human clone() {
        return new Human(this.name);
    }

    // Implementing the equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Human other = (Human) obj;
        return Objects.equals(other.name, name);
    }

    @Override
    public boolean equals(Shape other) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
