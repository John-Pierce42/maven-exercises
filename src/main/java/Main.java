import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter something:");
        String userInput = sc.nextLine();

        if(StringUtils.isNumeric(userInput)){
            System.out.println(userInput + " :is a number");
        } else {
            System.out.println(userInput + " :is not a number");
        }
        System.out.println();
        System.out.println(StringUtils.swapCase(userInput));
        System.out.println();
        System.out.println(StringUtils.reverse(userInput));
    }

}
