package class13;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PersonalData {

    private String name;
    private LocalDate birthDate;
    private LocalDateTime dateCreated;

    public PersonalData(String name, LocalDate birthDate, LocalDateTime dateCreated) {
        this.name = name;
        this.birthDate = birthDate;
        this.dateCreated = dateCreated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

}
