package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

public class StudentFormController {
    public JFXTextField txtId;
    public JFXTextField txtName;
    public JFXTextField txtNic;
    public JFXTextField txtAddress;
    public JFXTextField txtContact;
    public JFXTextField txtEmail;
    public Button btnDelete;
    public Button btnSave;
    public TableView tblStudent;

    public void initialize(){

    }

    public void DeleteOnAction(ActionEvent actionEvent) {
    }

    public void SaveOnAction(ActionEvent actionEvent) {
        SaveStudent();
    }

    private void SaveStudent() {

    }
}
