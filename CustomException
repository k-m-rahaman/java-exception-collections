class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {

    static void checkAge(int age)
            throws InvalidAgeException {

        if(age < 18) {
            throw new InvalidAgeException("Underage");
        }
    }

    public static void main(String[] args) {

        try {
            checkAge(15);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}