/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask1;


abstract class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    // Implementing the clone method
    @Override
    public Square clone() {
        return new Square(this.side) {
            @Override
            public boolean equals(Shape other) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    }

    // Implementing the equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Square other = (Square) obj;
        return Double.compare(other.side, side) == 0;
    }
}
