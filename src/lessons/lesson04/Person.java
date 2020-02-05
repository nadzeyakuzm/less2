package lessons.lesson04;

public class Person {
    private String name;

    int age;

    protected Country country;

   public Sex sex;
    public void walk () {
        System.out.println(name + "is walking");

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
}
