import java.util.Scanner;

public class Switch0 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input sem");
        int sem = in.nextInt(); 

        switch (sem) {
            case 1:
                System.out.println("You are in 1st sem"); 
                break;
            case 2:
                System.out.println("You are in 2nd sem"); 
                break;
            case 3:
                System.out.println("You are in 3rd sem"); 
                break;
            case 4:
                System.out.println("You are in 4th sem"); 
                break;
            case 5:
                System.out.println("You are in 5th sem"); 
                break;
            case 6:
                System.out.println("You are in 6th sem");
                break;
            default:
                System.out.println("Please give a valid sem"); 
                break;
        }
    }
}
