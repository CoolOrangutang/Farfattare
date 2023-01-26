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

            String name;

            try{
                Scanner inputScanner = new Scanner(System.in);
                System.out.println("What is the author name: ");
                name = inputScanner.nextLine();
            }catch (Exception e){
                name = "Unknown";
            }



            Author author = new Author(name, "gwperson@gmail.com", 'm');
            System.out.println(author);

        }

    }

}

