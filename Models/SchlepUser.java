package Models;

import java.io.*;
import java.util.Scanner;
import javafx.scene.control.TextField;

/**
 *
 * @author Marc Bittle
 */
public class SchlepUser implements Serializable {

    private String firstName;
    private String lastName;
    private String userEmail;
    private String userPassword;
    private String userAddress;
    private String phoneNumber;

    public SchlepUser(TextField _fname, TextField _lname, TextField _email) throws IOException {
        this.firstName = _fname.getText();
        this.lastName = _lname.getText();
        this.userEmail = _email.getText();

        saveSchleperInfo();
    }

    @Override
    public String toString() {
        String str = this.firstName + " " + this.lastName;
        return str;
    }

    private void saveSchleperInfo() throws IOException {
        try {
            File file = new File("SchleperInformation.txt");
            Scanner inputFile = new Scanner(file);
            PrintWriter outputFile = new PrintWriter(new FileWriter(file, true));

            outputFile.println(this.firstName);
            outputFile.println(this.lastName);
            outputFile.println(this.userEmail + "\n");
            outputFile.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (Exception e) {
            System.out.println("Not able to write to file.");
        }
    }
}
