package com.flashmaster.components;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 * Placeholder component for the Manage Decks view.
 */
public class ManageDecksView extends VBox {
    public ManageDecksView() {
        setAlignment(Pos.CENTER);
        Label title = new Label("Manage Decks View");
        title.getStyleClass().add("section-title");
        getChildren().add(title);
    }
}
