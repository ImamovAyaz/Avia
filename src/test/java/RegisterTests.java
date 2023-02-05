import org.testng.annotations.Test;

import java.util.Calendar;
import java.util.Date;

public class RegisterTests {
    String firstName = "Alex";
    String lastName = "Cook";
    String sex = "Male";
    //Date dateOfBirthday = new Date(575579312837);
    Date dateOfBirthday = new Date(575579312);

    @Test
    public void RegisterTest() {
        AirTickets airTickets = new AirTickets(firstName, lastName, sex, dateOfBirthday);
        airTickets.Register(firstName, lastName, sex, dateOfBirthday);

    }
}
