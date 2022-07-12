package controller;
import utill.crudutill;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import model.Student;

import java.sql.SQLException;

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
        Student s1 = new Student(txtId.getText(),
                txtContact.getText(),
                txtAddress.getText(),
                txtEmail.getText(),
                txtName.getText(),
                txtNic.getText());


        try {
            if (crudutill.executeUpdate("INSERT INTO Student VALUES (?,?,?,?,?,?)", s1.getStudent_id(), s1.getContact(), s1.getAddress(), s1.getEmail()
                    , s1.getName(), s1.getNic())) {


            }
        } catch (SQLException | ClassNotFoundException exception) {
            exception.printStackTrace();


        }
    }
}
