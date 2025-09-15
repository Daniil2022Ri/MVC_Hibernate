package org.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@Accessors(chain = true)
@Entity
@Table(name =  "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "TEXT CHARACTER SET utf8")
    private String name;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "age")
    private int age;
    @Column(name = "email")
    private String email;

    public User(String name, String lastName, int age, String email) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    public User() {

    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(name, user.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
