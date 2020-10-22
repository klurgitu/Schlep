package Models;

import java.io.*;
import java.util.Scanner;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

/**
 *
 * @author Marc Bittle
 */
public class SchlepUser extends DB.DataObject {

    private String firstName;
    private String lastName;
    private String userEmail;
    private String userPassword;
    private String userAddress;
    private String phoneNumber;

    /**
     *
     * @param _fname
     * @param _lname
     * @param _email
     * @param _password
     * @param _phone
     * @throws IOException
     */
    public SchlepUser(TextField _fname, TextField _lname, TextField _email, PasswordField _password, TextField _phone) throws IOException {
        this.firstName = _fname.getText();
        this.lastName = _lname.getText();
        this.userEmail = _email.getText();
        this.userPassword = _password.getText();
        this.phoneNumber = _phone.getText();

        saveSchleperInfo();
    }

    /**
     *
     * @throws IOException
     */
    private void saveSchleperInfo() throws IOException {
        try {
            File file = new File("SchleperInformation.txt");
            Scanner inputFile = new Scanner(file);
            PrintWriter outputFile = new PrintWriter(new FileWriter(file, true));

            outputFile.println(this.firstName);
            outputFile.println(this.lastName);
            outputFile.println(this.userEmail);
            outputFile.println(this.phoneNumber + "\n");
            outputFile.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Not able to write to file.");
        }
    }

    // ================================ GETTERS ====================================
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmail() {
        return this.userEmail;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public String toString() {
        String str = this.firstName + " " + this.lastName;
        return str;
    }

    // ================================ SETTERS ====================================
    /**
     *
     * @param _fname
     */
    public void setFirstName(String _fname) {
        this.firstName = _fname;
    }

    /**
     *
     * @param _lname
     */
    public void setLastName(String _lname) {
        this.lastName = _lname;
    }

    /**
     *
     * @param _email
     */
    public void setEmail(String _email) {
        this.userEmail = _email;
    }

    /**
     *
     * @param _phone
     */
    public void setPhoneNumber(String _phone) {
        this.phoneNumber = _phone;
    }
}
