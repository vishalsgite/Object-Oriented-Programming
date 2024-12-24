package Encapsulation;

//Fields are write-only by providing only setters and no getters.
class PasswordManager {
    private String password;

    // Setter only
    public void setPassword(String password) {
        this.password = password;
        System.out.println("Password has been set.");
    }
}

public class WriteOnlyEncapsulationDemo {
    public static void main(String[] args) {
        PasswordManager manager = new PasswordManager();
        manager.setPassword("SecurePassword123");
        // No way to retrieve the password
    }
}
