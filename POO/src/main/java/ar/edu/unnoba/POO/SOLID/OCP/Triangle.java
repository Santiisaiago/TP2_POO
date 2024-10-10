package ar.edu.unnoba.POO.SOLID.OCP;

public class Triangle implements Shape {
        private double base;
        private double height;

        public Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }
        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getBase() {
            return base;
        }
        public void setBase(double base) {
            this.base = base;
        }
        @Override
        public double calculateArea() {
            return (base * height) / 2;
        }
}

