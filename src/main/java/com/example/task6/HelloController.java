package com.example.task6;

import com.example.task6.figure.*;
import com.example.task6.figure.Shape;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;


public class HelloController implements Initializable {
    @FXML
    public Canvas canvas;
    @FXML
    public ListView<String> listCreateFigures;
    public ColorPicker colorPicker = new ColorPicker();
    private ObservableList<String> content;
    public GraphicsContext gc;
    public ShapeFactory shapeFactory;
    public int selectedFigureIndex;


    public void initialize(URL url, ResourceBundle resourceBundle) {
        gc = canvas.getGraphicsContext2D();
        shapeFactory = new ShapeFactory();
        selectedFigureIndex = 0;
        listCreateFigures.getItems().addAll("Rectangle", "Circle", "Triangle");
        listCreateFigures.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            selectedFigureIndex = listCreateFigures.getSelectionModel().getSelectedIndex();
        });
        canvas.setOnMouseClicked(this::handleCanvasClick);
    }

    private void handleCanvasClick(MouseEvent mouseEvent) {
        if (selectedFigureIndex != -1) {
            double x = mouseEvent.getX();
            double y = mouseEvent.getY();
            Shape shape = shapeFactory.createShape(selectedFigureIndex);
            Color color = colorPicker.getValue();
            shape.setColor(color);
            shape.draw(gc, x, y);
        }
    }
    public void cleanCanvas() {
        gc = canvas.getGraphicsContext2D();
        gc.clearRect(0,0, canvas.getWidth(), canvas.getHeight());
    }
}