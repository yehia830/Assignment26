package tiy.webapp;

/**
 * Created by Yehia830 on 9/12/16.
 */
public class Person {
    String name;
    String city;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;

    }
}
