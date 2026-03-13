package com.flashmaster.components;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 * Placeholder component for the Reports view.
 */
public class ReportsView extends VBox {
    public ReportsView() {
        setAlignment(Pos.CENTER);
        Label title = new Label("Reports View");
        title.getStyleClass().add("section-title");
        getChildren().add(title);
    }
}
