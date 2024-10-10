package ar.edu.unnoba.POO.SOLID.OCP;

/*
El Principio de Abierto/Cerrado (OCP - Open/Closed Principle) establece que las clases deben estar abiertas para su extensión
pero cerradas para su modificación. Esto significa que deberías poder extender el comportamiento de una clase sin modificar su código fuente original.
Ejemplo sin usar OCP
public class Shape {
    // Este método viola OCP porque debemos modificar esta clase cada vez que agregamos una nueva figura
    public double calculateArea(Object shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * circle.getRadius() * circle.getRadius();
        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.getWidth() * rectangle.getHeight();
        }
        return 0;
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}

En este ejemplo, Si nosotros necesitaramos agregar una nueva figura tendriamos que agregar la funcincionalidad de calcular area a la clase shape.

 */

// Creamos la interfaz Shape (forma), esta tiene el metodo de calcular area, el cual van a aplicar las diferentes formas que necesiten calcular el area.
public interface Shape {
    double calculateArea();
}
