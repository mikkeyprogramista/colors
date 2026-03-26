package com.adz1q.colors;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label lblColor;

    @FXML
    private ColorPicker colorPicker;

    @FXML
    private Button btnCopyColor;

    @FXML
    private Button btnSetBackground;

    @FXML
    private Rectangle rect;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
