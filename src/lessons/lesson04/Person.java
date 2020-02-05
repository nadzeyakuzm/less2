package lessons.lesson04;

public class Person {
    private static final String error_name = "Vasily";
    private String name;

    int age;

    protected Country country;

   public Sex sex;

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }
public Person (String name, Country country){

}
    public Person() {}

    public void walk () {
        System.out.println(name + "is walking");

    }
    public void walk (int time) {
        System.out.println(name +"is walking for" + time + "minutes");
    }
    public void eat(String dish) {
        System.out.printf("He is eating smth", name, dish);
    }
    public int growold(){
        return ++age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()<2);
        name = "Vasily";
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Country getCountry() {
        return country;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void setCountry(Country country) {
        this.country = country;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country=" + country +
                ", sex=" + sex +
                '}';
    }

}
