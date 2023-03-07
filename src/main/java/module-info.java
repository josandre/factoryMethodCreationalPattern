module com.example.factorymethod {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;
    requires com.fasterxml.jackson.databind;
    requires org.json;

    opens com.example.factorymethod to javafx.fxml;
    exports com.example.factorymethod;
    exports com.example.factorymethod.View;
    exports com.example.factorymethod.ConcreteProduct;
    exports com.example.factorymethod.Product;
}