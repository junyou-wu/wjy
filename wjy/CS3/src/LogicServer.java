/**
 Test_Name:TiXiJieGou3
 Date:2023.11.12
 Number:202131061035
 Name:Wu_Junyou
 **/
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LogicServer {
    private List<Person> persons = new ArrayList<>();

    public List<Person> getPersons() {
        return persons;
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public void editPerson(int index, Person newPerson) {
        persons.set(index, newPerson);
    }

    public void deletePerson(int index) {
        persons.remove(index);
    }

    public Person getPerson(int index) {
        return persons.get(index);
    }

}
