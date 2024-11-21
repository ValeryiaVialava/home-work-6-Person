import java.time.*;
import java.time.format.*;
import java.util.Locale;

public class Person {
    private final String name;
    private final String surname;
    private final LocalDate birthDate;
    private final LocalTime timeOfBirth;

    public Person(String name, String surname, LocalDate birthDate, LocalTime timeOfBirth) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.timeOfBirth = timeOfBirth;
    }

    // method to determine gender based on name
    public String getGender() {
        if (name.toLowerCase().endsWith("a")) {
            return "Female";
        } else {
            return "Male";
        }
    }

    // method to calculate age
    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public String getDayOfBirth() {
        DayOfWeek dayOfWeek = birthDate.getDayOfWeek();
        return dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH); //Locale.getDefault()
    }

    // method to reverse the name and surname
    public String reverseNameAndSurname() {
        String reversedName = new StringBuilder(name).reverse().toString();
        String reversedSurname = new StringBuilder(surname).reverse().toString();
        return capitalizeFirstLetter(reversedName) + " " + capitalizeFirstLetter(reversedSurname);
    }

    // helper method to capitalize the first letter of a string
    private String capitalizeFirstLetter(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    // method to get the date and time of birth in Los Angeles timezone
    public String getDateTimeInLosAngeles() {
        ZonedDateTime birthDateTime = ZonedDateTime.of(birthDate, timeOfBirth, ZoneId.of("Europe/Warsaw"));
        ZonedDateTime laBirthDateTime = birthDateTime.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm a z");
        return laBirthDateTime.format(formatter);  // форматируем дату и время по заданному шаблону
    }
}
