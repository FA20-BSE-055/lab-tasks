/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package labtask2;

import java.util.Objects;

// Prototype interface
interface Shape extends Cloneable {
    Shape clone();
    boolean equals(Shape other);
}