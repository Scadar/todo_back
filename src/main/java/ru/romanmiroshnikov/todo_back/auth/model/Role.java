package ru.romanmiroshnikov.todo_back.auth.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.List;



@Entity
@Table(name = "roles")
@Data
public class Role extends BaseEntity implements GrantedAuthority {

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY)
    private List<User> users;

    @Override
    public String toString() {
        return "Role{" +
                "id: " + super.getId() + ", " +
                "name: " + name + "}";
    }

    @Override
    public String getAuthority() {
        return name;
    }
}
