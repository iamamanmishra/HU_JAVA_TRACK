import java.util.Scanner;

class InvalidPasswordException extends Exception {

    int passwordConditionViolated;

    public InvalidPasswordException(int conditionViolated)
    {
        super("Invalid Password: ");
        passwordConditionViolated = conditionViolated;
    }

    public String printMessage()
    {
        return switch (passwordConditionViolated) {
            case 1 -> ("Password length should be between 8 to 15 characters");
            case 2 -> ("Password should contain at least one digit(0-9)");
            case 3 -> ("Password should contain at least one special character");
            case 4 -> ("Password should contain at least one uppercase letter(A-Z)");
            case 5 -> ("Password should contain at least one lowercase letter(a-z)");
            default -> ("");
        };

    }
}


public class Password_verification {

    public static void isValid(String password) throws InvalidPasswordException
    {
        if (!((password.length() >= 8)
                && (password.length() <= 15))) {
            throw new InvalidPasswordException(1);
        }

        {
            int count = 0;
            for (int i = 0; i <= 9; i++) {
                String str1 = Integer.toString(i);

                if (password.contains(str1)) {
                    count = 1;
                    break;
                }
            }
            if (count == 0) {
                throw new InvalidPasswordException(2);
            }
        }
        if (!password.contains("$") || password.contains("%") ||(password.contains("@")
                || password.contains("#") || password.contains("^") || password.contains("&")
                || password.contains("*") || password.contains("(") || password.contains(")")
                || password.contains("-") || password.contains("+") || password.contains("/")
                || password.contains(":") || password.contains(".") || password.contains(", ")
                || password.contains("<") || password.contains("!") || password.contains("~")
                || password.contains(">") || password.contains("?")|| password.contains("|"))) {
            throw new InvalidPasswordException(3);
        }

        {
            int count = 0;
            for (int i = 65; i <= 90; i++) {
                char c = (char)i;

                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                    break;
                }
            }
            if (count == 0) {
                throw new InvalidPasswordException(4);
            }
        }

        {
            int count = 0;
            for (int i = 90; i <= 122; i++) {
                char c = (char) i;
                String str1 = Character.toString(c);

                if (password.contains(str1)) {
                    count = 1;
                    break;
                }
            }
            if (count == 0) {
                throw new InvalidPasswordException(5);
            }
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the password");
        Scanner sc = new Scanner(System.in);
        String password1 = sc.nextLine();

        try {
            isValid(password1);
            System.out.println("Valid Password");
        }
        catch (InvalidPasswordException e) {
            System.out.print(e.getMessage());
            System.out.println(e.printMessage());
        }
    }
}
