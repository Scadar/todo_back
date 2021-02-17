package ru.romanmiroshnikov.todo_back.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.romanmiroshnikov.todo_back.auth.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String name);
}
