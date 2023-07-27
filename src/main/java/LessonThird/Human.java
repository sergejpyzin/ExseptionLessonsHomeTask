package LessonThird;

public class Human {
    private String lastName;
    private String firstName;
    private String patronymic;
    private String date;
    private Integer phoneNumber;
    private Character gender;

    public Human(String lastName, String firstName, String patronymic, String date, Integer phoneNumber, Character gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.date = date;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Human{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", date='" + date + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", gender=" + gender +
                '}';
    }
}
