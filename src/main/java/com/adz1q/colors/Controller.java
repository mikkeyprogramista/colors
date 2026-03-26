package com.adz1q.colors;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
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
    private Slider slider;

    @FXML
    private Label lblOpacity;

    @FXML
    private Rectangle rect;

    private Clipboard clipboard;
    private ClipboardContent content;
    private Color currentColor;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        clipboard = Clipboard.getSystemClipboard();
        content = new ClipboardContent();

        btnSetBackground.setOnAction(actionEvent -> {
            currentColor = colorPicker.getValue();
            lblColor.setText("Kolor: " + currentColor.toString());
            lblOpacity.setText("Przezroczystość: " + (int) slider.getValue());
            rect.setFill(currentColor);
            rect.setOpacity(slider.getValue() / 100);
        });

        btnCopyColor.setOnAction(actionEvent -> {
            if (currentColor != null) {
                content.putString(currentColor.toString());
                clipboard.setContent(content);
            }
        });
    }
}
