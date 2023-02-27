public class Teacher extends User {

    private String password;

    public Teacher(String username, String password) {
        super(username);
        this.password = password;
    }
}
