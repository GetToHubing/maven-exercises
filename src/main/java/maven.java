import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class maven {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please provide a number or sentence");
        String x = userInput.nextLine();
        if (StringUtils.isNumeric(x)) {
            System.out.println("You input the number: " + x);
        } else if (StringUtils.isAlpha(x)) {
            System.out.println("You input the characters: " + x);
        //swaps the characters case
        System.out.println(StringUtils.swapCase(x));
        //reverses the string
        System.out.println(StringUtils.reverse(x));
        }
    }
}
