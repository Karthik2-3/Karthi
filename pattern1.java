package Karthi;
import java.util.Scanner;
public class pattern1 {
public static void main(String[] args) {
    Scanner io=new Scanner(System.in);
    int value=io.nextInt();
    for(int i=0;i<=value;i++){
        for(int j=0;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}
