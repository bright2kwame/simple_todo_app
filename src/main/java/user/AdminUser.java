package user;

import util.AppConstant;

public class AdminUser extends BaseUser {


    public AdminUser(String firstName, String lastName, String middleName, String email, String password) {
        super(firstName, lastName, middleName, email, password);
    }

    @Override
    public void login(String email, String password) {
        //MARK: if the user has attempted 3 or more times
        if (this.getNoOfLoginAttempt() >= 3) {
            this.setBlocked(true);
            System.out.println(AppConstant.USER_BLOCKED_MESSAGE);
            return;
        }
        //MARK: check the user logic
        if (this.getEmail().equalsIgnoreCase(email.trim()) || this.getPassword().equals(password.trim()) ){
            System.out.println("Your email or password was not found");
        }
    }

    @Override
    public void register() {

    }
}
