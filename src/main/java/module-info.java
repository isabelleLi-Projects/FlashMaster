<<<<<<< HEAD
module cs151.application {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens cs151.application to javafx.fxml;
    exports cs151.application;
}
=======
module com.flashmaster {
    requires transitive javafx.controls;
    requires transitive javafx.graphics;
    requires transitive javafx.base;

    opens com.flashmaster to javafx.graphics;
    opens com.flashmaster.model to javafx.base;

    exports com.flashmaster;
    exports com.flashmaster.components;
    exports com.flashmaster.model;
}
>>>>>>> 8e4461f (Initial commit of JavaFX FlashMaster app)
