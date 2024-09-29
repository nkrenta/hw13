public class Lesson {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        Person sarah = new Person("Sarah", 30);

        if (personService.isAdult(sarah)) {
            System.out.println("Go to the bar");
        } else {
            System.out.println("Go to school!");
        }

        System.out.println(sarah);
        sarah.increaseAge(-30);
    }
}