module ensisa.birds {
    requires transitive javafx.controls;
    requires javafx.fxml;

    requires com.fasterxml.jackson.databind;
    requires java.desktop;

    opens ensisa.birds to javafx.fxml, com.fasterxml.jackson.databind;
    exports ensisa.birds;
    exports ensisa.birds.model;
}