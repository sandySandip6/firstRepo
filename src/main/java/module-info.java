module com.example.java_fx_first {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.java_fx_first to javafx.fxml;
    exports com.example.java_fx_first;
    exports com.example.java_fx_first.layout_mangeer;
    opens  com.example.java_fx_first.layout_mangeer to javafx.fxml;
}