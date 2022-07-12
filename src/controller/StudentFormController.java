package controller;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import utill.crudutill;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import model.Student;
import view.TM.StudentTm;

import java.sql.ResultSet;
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
    public TableColumn cilId;
    public TableColumn cilName;
    public TableColumn cilNic;
    public TableColumn cilAddress;
    public TableColumn colContact;
    public TableColumn colEmail;

    public void initialize(){

        cilId.setCellValueFactory(new PropertyValueFactory<>("student_id"));
        colContact.setCellValueFactory(new PropertyValueFactory<>("contact"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        cilAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        cilName.setCellValueFactory(new PropertyValueFactory<>("name"));
        cilNic.setCellValueFactory(new PropertyValueFactory<>("nic"));

        try {
            LoadAllStudent();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private void LoadAllStudent() throws SQLException, ClassNotFoundException {
        ResultSet resultSet = crudutill.executeQuery("SELECT * FROM Student");

        ObservableList<StudentTm> RList = FXCollections.observableArrayList();
        while (resultSet.next()) {
            RList.add(new StudentTm(
                    resultSet.getString("studentId"),
                    resultSet.getString("studentName"),
                    resultSet.getString("email"),
                    resultSet.getString("contact"),
                    resultSet.getString("address"),
                    resultSet.getString("nic")



            ));
        }
        tblStudent.setItems(RList);
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
