package user;

public class AdminUser  extends  BaseUser {


    public AdminUser(String firstName, String lastName, String middleName, String email, String password) {
        super(firstName, lastName, middleName, email, password);
    }

    @Override
    public void login() {

    }

    @Override
    public void register() {

    }
}
