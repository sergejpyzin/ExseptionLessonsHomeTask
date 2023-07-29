package LessonThird;

public class Human {
    private final String lastName;
    private final String firstName;
    private final String patronymic;
    private final String date;
    private final int phoneNumber;
    private final String gender;

    public Human(String lastName, String firstName, String patronymic, String date, int phoneNumber, String gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.date = date;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%s><%s><%s>\n", lastName, firstName, patronymic, date, phoneNumber, gender);
    }
}
