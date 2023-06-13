import java.util.Scanner;

/*Esercizio 9
    Loop infinite times asking the user to input a number between 1 and 10
    Print the name of the number (e.g. 5 --> five)
    If the user input a number lower than 1 or greater than 10, print Cannot give you the name*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("input a number between 1 and 10");

            int number = scanner.nextInt();


            switch (number){
                case 1 : System.out.println(number + " --> one");
                    break;
                case 2 : System.out.println(number + " --> two");
                    break;
                case 3 : System.out.println(number + " --> three");
                    break;
                case 4 : System.out.println(number + " --> four");
                    break;
                case 5: System.out.println(number + " --> five");
                    break;
                case 6: System.out.println(number + " --> six");
                    break;
                case 7 : System.out.println(number + " --> seven");
                    break;
                case 8 : System.out.println(number + " --> eight");
                    break;
                case 9 : System.out.println(number + " --> nine");
                    break;
                case 10 : System.out.println(number + " --> ten");
                    break;
                 default : System.out.println("print cannot give you the name");
                }
                    if(number <1 || number > 10){
                    break;

                    }
        }
    }
}
