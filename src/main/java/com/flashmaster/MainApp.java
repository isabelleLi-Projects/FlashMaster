package com.flashmaster;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX Application entry point for FlashMaster.
 */
public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        MainLayout mainLayout = new MainLayout();

        // Wrapping layout in a StackPane with background padding (like the React outer div)
        StackPane root = new StackPane(mainLayout);
        root.getStyleClass().add("app-root");
        root.setPadding(new javafx.geometry.Insets(24));

        Scene scene = new Scene(root, 1100, 720);

        // Load CSS stylesheet
        String css = getClass().getResource("/styles.css").toExternalForm();
        scene.getStylesheets().add(css);

        primaryStage.setTitle("FlashMaster");
        primaryStage.setScene(scene);
        primaryStage.setMinWidth(900);
        primaryStage.setMinHeight(600);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
