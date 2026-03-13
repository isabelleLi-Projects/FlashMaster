package com.flashmaster.components;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 * Placeholder component for the Manage Flashcards view.
 */
public class ManageFlashcardsView extends VBox {
    public ManageFlashcardsView() {
        setAlignment(Pos.CENTER);
        Label title = new Label("Manage Flashcards View");
        title.getStyleClass().add("section-title");
        getChildren().add(title);
    }
}
