package org.vaadin.addons.dsl.test;

import java.util.UUID;

public class Pojo {

    private final UUID id = UUID.randomUUID();
    private final String firstName;
    private final String lastName;
    private final int age;

    public Pojo(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

}
