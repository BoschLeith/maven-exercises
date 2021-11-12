import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class UserPrompt extends StringUtils {

	public static void UserString(){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Something: ");
		String input = scanner.nextLine();
		System.out.printf("You entered \"%s\"%n", input);
		if (!isNumeric(input)){
			System.out.printf("\"%s\" is not a number%n", input);
		} else {
			System.out.printf("\"%s\" is a number%n", input);
		}
		System.out.printf("Flipped case: %s%n", swapCase(input));
		System.out.printf("Reversed: %s%n", reverse(input));
	}

	public static void main(String[] args) {
		UserString();
	}
}
