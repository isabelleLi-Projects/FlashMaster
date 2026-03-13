package com.flashmaster.components;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 * Placeholder component for the Review Deck view.
 */
public class ReviewDeckView extends VBox {
    public ReviewDeckView() {
        setAlignment(Pos.CENTER);
        Label title = new Label("Review Deck View");
        title.getStyleClass().add("section-title");
        getChildren().add(title);
    }
}
