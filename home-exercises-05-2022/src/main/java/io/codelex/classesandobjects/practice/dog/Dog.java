package io.codelex.classesandobjects.practice.dog;

public class Dog {
    private String name;
    private String sex;
    private String mother;
    private String father;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public Dog(String name, String sex, String mother, String father) {
        this.name = name;
        this.sex = sex;
        this.mother = mother;
        this.father = father;
    }

    public String fathersName() {
        if (father == null) {
            return "Unknown";
        } else {
            return father;
        }
    }

    public boolean hasSameMotherAs(Dog otherDog) {
        return this.mother.equals(otherDog.mother);
    }
}
