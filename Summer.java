import java.util.Scanner; //importing scanner objects
public class Summer { //name of class
    public static void main(String[] args) { //main method
        Scanner sc = new Scanner(System.in); //new scanner object

        double num = 1;  //initalize number for user (this will get replaced it just has to not be 1
        double totalNum = 0; //double to store the total number (starting at zero)
        while (num != 0) { //until num is 0
            System.out.println("Enter a Number:"); //prompt user for input
            num = sc.nextDouble(); //store inputted number as num (replaces starting num)
            sc.nextLine(); //clear trash
            totalNum += num; //update totalNum
        }
        System.out.println("Sum = " + totalNum); //print the sum (totalNum)
    }
}

