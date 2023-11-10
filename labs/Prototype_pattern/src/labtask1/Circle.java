/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask1;


class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing the clone method
    @Override
    public Circle clone() {
        return new Circle(this.radius);
    }

    // Implementing the equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle other = (Circle) obj;
        return Double.compare(other.radius, radius) == 0;
    }

    @Override
    public boolean equals(Shape other) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
