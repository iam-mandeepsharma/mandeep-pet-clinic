package mandeep.springlearning.models;

import java.time.LocalDate;

public class Pet extends BaseEntity{

    private PetType petType;
    private Owner owners;
    private LocalDate birthDate;
}
