public class Person implements Comparable<Person> {

    private int age;
    private String name;

     Person(int age,String name){
        setAge(age);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
         if (obj instanceof Person){
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);}
         else return false;
    }

    @Override
    public String toString() {
        return "Nume: " + name + ", Virsta: " + age;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }



    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age,o.age);
    }
}
