module com.no3.epos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens com.no3.epos to javafx.fxml;
    exports com.no3.epos;
    exports com.no3.epos.menu;
    opens com.no3.epos.menu to javafx.fxml;
}