import user.AppUser;
import user.BaseUser;

public class App {

    public static void main(String[] args) {
        BaseUser baseUser = new AppUser("Bright","MOn","K","","");

        System.out.println(baseUser.getId());
    }
}
