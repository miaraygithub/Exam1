import java.util.Scanner; //importing scanner objects
public class TenMaker { //name of class
    public static boolean makes10(int int1, int int2) { //make boolean returning method named makes10 that takes two int inputs
        return (int1 + int2) == 10; //only returns (true) if they add to 10
    }
    public static void main(String[] args) { //main method
        Scanner sc = new Scanner(System.in); //new scanner objects

        System.out.println("Enter your first integer: ");  //prompt user for answer
        int int1 = sc.nextInt(); //store asnwer in int
        sc.nextLine(); //clear junk

        System.out.println("Enter your second integer: ");  //prompt user for answer
        int int2 = sc.nextInt(); //store answer in int
        sc.nextLine(); //clear junk

        if (makes10(int1, int2)) { //if makes10 returns true
            System.out.println("Your numbers add up to 10!"); //yay 10
        } else {
            System.out.println("Your numbers do not add up to 10!"); //ugh not 10
        }
    }
}
