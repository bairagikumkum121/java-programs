class AgeException extends Exception {
    public AgeException(String msg) {
        super(msg);
    }
}

class UserDefineExceptionPgram {
    private int age;
    private String name;

    public UserDefineExceptionPgram(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void checkAge() throws AgeException {
        if (age < 18) {
            System.out.println(name + " is not eligible for voting.");
        } else {
            System.out.println(name + " is eligible for voting.");

        }
    }
}

public class UserDefineExceptionP {

    public static void main(String[] args) {
        UserDefineExceptionPgram user = new UserDefineExceptionPgram(10, "Kumkum");
        try {
            user.checkAge();
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
