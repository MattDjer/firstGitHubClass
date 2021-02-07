import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Square {

    //KvadratSkriv en metode, der som parameter modtager et heltal.
    // Metoden skal udskrive et kvadrat på skærmen svarende til heltallet. I det følgende eksempel er tallet 6 modtaget som
    // parameter til metoden:************************************•Udvid metoden, så den også modtager et tegn, som er det tegn,
    // somprintes på skærmen

    public void printSquare() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Indtast tallet som skal være kvardratens længde og højde");

        int choice = scanner.nextInt();

        for (int i = 0; i < choice; i++) {

            for (int k = 0; k < choice; k++) {

                System.out.print("* ");


            }
            System.out.print("\n");
        }


    }

}
