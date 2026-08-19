package packy;

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}
public class c1{
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("invalid age,it has to freated then");
        } else {
            System.out.println("valid age");
        }
    }
    public static void main(String []args)
    {
        try {
            checkAge(10);
        } catch (InvalidAgeException e) {
            throw new RuntimeException(e);
        }
        }

}

