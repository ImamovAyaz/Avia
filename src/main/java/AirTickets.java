import com.sun.istack.internal.NotNull;

import java.util.Date;

public class AirTickets {
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    private String surname;
    @NotNull
    private String sex;
    @NotNull
    private Date dateOfDBirth;
    private String country;
    private String familyStatus;
    private int childrenAmount;

    public AirTickets(String firstName, String lastName, String sex, Date dateOfDBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.dateOfDBirth = dateOfDBirth;
    }

    public void Register(String firstName, String lastName, String sex, Date dateOfDBirth){
        new AirTickets(firstName, lastName, sex, dateOfDBirth);
        System.out.println("Прошла регистрация");
        System.out.println("Ваши данные:");
        System.out.printf("Имя: %s %n", firstName);
        System.out.printf("Фамилия: %s %n", lastName);
        System.out.printf("Пол: %s %n", sex);
        System.out.printf("Дата рождения: %1$tA, %1$tB %1$tY %n", dateOfDBirth);
    }

}
