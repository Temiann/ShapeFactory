package com.example.task6.figure;

import javafx.scene.paint.Color;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private Map<Integer, Shape> shapeMap;

    public ShapeFactory() {
        shapeMap = new HashMap<>();
        shapeMap.put(0, new Rectangle(Color.BLACK, 50, 25));
        shapeMap.put(1, new Circle(Color.BLACK, 50));
        shapeMap.put(2, new Triangle(Color.BLACK, 50, 50));
    }

    public Shape createShape(int id) {
        return shapeMap.get(id);
    }
}