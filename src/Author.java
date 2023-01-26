import java.util.Scanner;

public class Author {
    String name;
    String email;
    char gender;

    public Author(String newName, String newemail, char newGender){

        name = newName;
        email = newemail;
        gender = newGender;

    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }
}
