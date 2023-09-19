package kahitAno;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class PersonalInformation {
    public static void main(String[] args) {
        // Initialize personal information
        String name = "Estephanie Villapa";
        String birthday = "2005-11-23";
        String sex = "Female";
        String hobbies = "Dancing and Reading Novels";
        String favoriteColor = "Purple";
        String favoriteFood = "Fries";
        String favoritePerson = "Mom";
        String favoriteAnimal = "Dog";
        String sports = "Volleyball and Badminton";
        String talent = "Dancing";

        // Get current date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Parse the birthday string into a LocalDate object
        LocalDate birthDate = LocalDate.parse(birthday, formatter);

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the age using Period class
        Period age = Period.between(birthDate, currentDate);

        // Display the age
        System.out.println("Age: " + age.getYears() + " years " + age.getMonths() + " months " + age.getDays() + " days");
    
    }
}
