package com.example.task6.figure;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Triangle extends Shape{
    double base;
    double height;
    double x,y;
    public Triangle(Color color, double base, double height){
        super(color);
        this.base = base;
        this.height = height;
    }
    @Override
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "Triangle";
    }
    @Override
    public void draw(GraphicsContext gc, double x, double y) {
        gc.setFill(color);
        gc.fillPolygon(
                new double[] { x, x + (base/2), x + base },
                new double[] { y + height, y, y + height},3
        );
    }
}
