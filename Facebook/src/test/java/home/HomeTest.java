package home;

import common.CommonAPI;
import org.testng.annotations.Test;

public class HomeTest extends CommonAPI {
    @Test
    public void testUserCanLogInSuccessfully(){
        driver.get("https://facebook.com");
        HomePage hp = new HomePage();
        hp.login("fahimpnt@gmail.com","Tester123!");

    }
}
