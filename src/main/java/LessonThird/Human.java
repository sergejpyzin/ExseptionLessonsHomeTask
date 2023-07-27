package LessonThird;

public class Human {
    private String lastName;
    private String firstName;
    private String patronymic;
    private String date;
    private String phoneNumber;
    private String gender;

    public Human(String lastName, String firstName, String patronymic, String date, String phoneNumber, String gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.date = date;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%s><%s><%s>\n", lastName, firstName, patronymic, date, phoneNumber, gender);
    }
}
