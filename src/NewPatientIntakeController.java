import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class NewPatientIntakeController implements Initializable {

    @FXML
    private TextField firstNameTextField;

    @FXML
    private TextField lastNameTextField;

    @FXML
    private TextField phoneNumTextField;

    @FXML
    private TextField streetTextField;

    @FXML
    private TextField cityTextField;

    @FXML
    private ComboBox<String> provinceComboBox;

    @FXML
    private DatePicker birthdayDatePicker;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        provinceComboBox.getItems().addAll(Patient.getProvinceList());
        phoneNumTextField.setPromptText("Enter phone number");
        streetTextField.setPromptText("Enter street address");
        cityTextField.setPromptText("Enter city name");
        provinceComboBox.setPromptText("Select province");
        birthdayDatePicker.setPromptText("Select birthday");
    }
}