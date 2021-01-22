package pers.paopa.assertj.object;

import lombok.Getter;

@Getter
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }
}
