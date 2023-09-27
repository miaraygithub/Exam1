import java.util.Scanner; //importing scanner objects
public class BeverageSelector { //name of class
    public static void main(String[] args) { //main method
        Scanner sc = new Scanner(System.in); //new scanner objects

        System.out.println("Your beverage options are Water (1), Coke (2), or Coffee (3)."); //give the user options
        System.out.println("What beverage would you like? "); //prompt user for answer
        int userNumber = sc.nextInt(); //store the input as an integer
        if (userNumber == 1) { //if they chose 1
            System.out.println("Your beverage is Water."); //print message
        } else if (userNumber == 2) { //if they chose 2
            System.out.println("Your beverage is Coke."); //print message
        } else if (userNumber == 3) { //if they chose 3
            System.out.println("Your beverage is Coffee."); //print message
        }

    }
}

