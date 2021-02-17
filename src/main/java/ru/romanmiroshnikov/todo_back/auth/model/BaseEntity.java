package ru.romanmiroshnikov.todo_back.auth.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@MappedSuperclass
@Data
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreatedDate
    @Column(name = "created")
    private Timestamp created;

    @LastModifiedDate
    @Column(name = "update")
    private Timestamp updated;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;
}
