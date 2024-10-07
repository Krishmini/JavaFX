<<<<<<< HEAD
module appli.refait_todolistfx {
    requires java.sql;
=======
module appli.todolistjx {
>>>>>>> b03703c3edc65a0ba1e5781447c7efc4dd252db6
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

<<<<<<< HEAD
    opens appli.refait_todolistfx to javafx.fxml;
    exports appli.refait_todolistfx;
    exports appli.refait_todolistfx.accueil;
    opens appli.refait_todolistfx.accueil to javafx.fxml;


=======
    opens appli.todolistjx to javafx.fxml;
    exports appli.todolistjx;
    exports appli.todolistjx.accueil;
    opens appli.todolistjx.accueil to javafx.fxml;
>>>>>>> b03703c3edc65a0ba1e5781447c7efc4dd252db6
}