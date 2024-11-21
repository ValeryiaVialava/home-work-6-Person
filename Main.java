import java.time.*;
import java.time.format.*;
import java.util.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter your name: ");
                String name = scanner.nextLine();

                System.out.println("Enter your surname: ");
                String surname = scanner.nextLine();

                System.out.println("Enter your birth date (dd/MM/yyyy): "); // "MM" month DateTimeFormatter
                String birthDateInput = scanner.nextLine();
                LocalDate birthDate = LocalDate.parse(birthDateInput, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                System.out.println("Enter your time of birth (HH:mm): "); // "mm" minutes DateTimeFormatter
                String timeOfBirthInput = scanner.nextLine();
                LocalTime timeOfBirth = LocalTime.parse(timeOfBirthInput, DateTimeFormatter.ofPattern("HH:mm"));

                if (isValid(name) && isValid(surname) && isValidDate(birthDate)) {
                    Person person = new Person(name, surname, birthDate, timeOfBirth);
                    System.out.println("Gender: " + person.getGender());
                    System.out.println("Age: " + person.getAge());
                    System.out.println("Day of Birth: " + person.getDayOfBirth());
                    System.out.println("Reversed Name and Surname: " + person.reverseNameAndSurname());
                    System.out.println("Birth Date and Time in Los Angeles: " + person.getDateTimeInLosAngeles());
                    break;
                } else {
                    System.out.println("Invalid input data!");
                }
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date or time format! Please try again.");
            }

            System.out.println("Do you want to try again? (yes/no)");
            String tryAgain = scanner.nextLine().trim().toLowerCase();
// jeśli korzystałoby się z nextLine, to pobierana byłaby cała linia, np. 'yes please', i traktowana jak break programu z powodu dalszego warunku
            if (!tryAgain.equals("yes")) {
                break;
            }
        }
        scanner.close();
    }

    public static boolean isValid(String name) {
        return Pattern.matches("^[A-Z][a-zA-Z]*$", name); // ("^[A-Z][a-zA-Z]*$", name) is regex — regular expression
    }

    public static boolean isValidDate(LocalDate date) {
        return date != null && date.isBefore(LocalDate.now());
    }

//    public static boolean isValidTime(LocalTime time) {
//        return time != null;
//    }

}

