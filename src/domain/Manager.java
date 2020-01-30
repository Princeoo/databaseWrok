package domain;

//管理员表
public class Manager {
    private String  username;
    private String  password;

    public  String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public Manager(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * Constructs a new object.
     */
    public Manager() {
        super();
    }
}
