import javax.swing.*;
import java.awt.*;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main
{

    static int antalFörfattare;

    public static void main(String[] args)
    {

        Menu();

    }



     static void Menu(){

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Välj antal författare: ");

        antalFörfattare = inputScanner.nextInt();

        naming();

    }

     static void naming(){

        for (int i = 0; i < antalFörfattare; i++){

            Scanner inputScanner = new Scanner(System.in);
            System.out.println("What is the author name: ");
            String name = inputScanner.nextLine();


            Author author = new Author(name, "gwperson@gmail.com", 'm');
            System.out.println(author.getName() +" , "+ author.getEmail() +" , "+ author.getGender());

        }

    }

}