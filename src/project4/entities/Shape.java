package project4.entities;

import project4.enums.Color;

public abstract class Shape {
    private Color color;

    public Shape(){

    }
    public Shape(Color color) {
        this.color = color;
    }

    public abstract double area();
}
