package ppl;

import java.util.ArrayList;

public class Main {
    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            if (person instanceof Payable) {
                Payable payable = (Payable) person;
                System.out.println(person.toString() + " earns " + payable.getPaymentAmount() + " tenge");
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<ppl.Person> peopleList = new ArrayList<>();
        peopleList.add(new Employee("John", "Lennon", "Manager", 27045.78));
        peopleList.add(new Employee("George", "Harrison", "Developer", 50000.00));
        peopleList.add(new Student("Ringo", "Starr", 2.5));
        peopleList.add(new Student("Paul", "McCartney", 3.0));

        printData(peopleList);
    }
}