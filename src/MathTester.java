import java.util.Scanner;

public class MathTester {

    public static void main(String[] args) {
        String firstWord;
        String secondWord;
        String heightInches;
        String personsHeight;
        int firstNumber,secondNumber,total,inchesToFeet;
        Scanner keyboard;


        keyboard = new Scanner(System.in);
        firstWord = "dog";
        secondWord = "house";
        firstNumber = 5;
        secondNumber = 10;
        inchesToFeet = (int) 0.0833333;
        total = firstNumber + secondNumber;
        System.out.println(total);
        total = total + 10;
        System.out.println(total);

        /*System.out.print("What's your height in inches?");
        heightInches = keyboard.nextLine();
        personsHeight = heightInches + inchesToFeet;
        System.out.println("Your height is " + (personsHeight));
*/



        /*System.out.println(firstWord + secondWord);
        System.out.println(firstWord + (firstNumber + secondNumber));
        System.out.println("firstNumber + secondNumber is " + (firstNumber + secondNumber));
        System.out.println("firstNumber - secondNumber is " + (firstNumber - secondNumber));
        System.out.println("secondNumber / firstNumber is " + (secondNumber / firstNumber));
        System.out.println("firstNumber * secondNumber is " + (firstNumber * secondNumber));
        System.out.println("The modulus of the secondNumber by the firstNumber" +
                " is " + (secondNumber % firstNumber));*/




    }
}
