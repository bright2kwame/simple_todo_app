package user;

import java.rmi.server.UID;
import java.util.Date;

/**
 * Base user class
 * Base implementation for all user-like classes
 */
public abstract class BaseUser {

    //MARK: the id of the user
    private UID id;

    //MARK: the first name of the user
    private String firstName;

    //MARK: the last name of the user
    private String lastName;

    //MARK: the middle name of the user
    private String middleName;

    //MARK: the email address of the user
    private String email;

    //MARK: the password of the user
    private String password;

    //MARK: track the number of times user tries to login
    private int noOfLoginAttempt;

    //MARK: indicate the status of the user
    private boolean isBlocked;

    //MARK: date user was created
    private Date dateCreated;

    //MARK: date user last logged in
    private Date lastLoginDate;

    //MARK: date user last logged out
    private Date lastLogoutDate;

    public UID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNoOfLoginAttempt() {
        return noOfLoginAttempt;
    }

    public void setNoOfLoginAttempt(int noOfLoginAttempt) {
        this.noOfLoginAttempt = noOfLoginAttempt;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Date getLastLogoutDate() {
        return lastLogoutDate;
    }

    public void setLastLogoutDate(Date lastLogoutDate) {
        this.lastLogoutDate = lastLogoutDate;
    }

    @Override
    public String toString() {
        return "{email:" + this.email + "}";
    }

    public BaseUser(String firstName, String lastName, String middleName, String email, String password) {
        this.id = new UID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.email = email;
        this.password = password;
    }

    public abstract void login();

    public abstract void register();
}
