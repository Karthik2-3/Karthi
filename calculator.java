package Karthi;
import java.util.Scanner;
public class calculator {
    public static void main(String args[]){
    Scanner io=new Scanner(System.in);
    System.out.print("ENTER THE FIRST VALUE = ");
    int first = io.nextInt();
    System.out.print("ENTER THE SECOND VALUE = ");
    int second = io.nextInt();
    System.out.print("ENTER THE OPERATION = ");
    String operation=io.next();
    switch (operation) {
        case "add":
            System.out.println(first+second);
            break;
        case"sub":
            System.out.println(first-second);
            break;
        case"mul":
            System.out.println(first*second);
            break;
        case"div":
            System.out.println(first/second);
            break;
    }
}
}