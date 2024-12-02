package hu.jandzsogyorgy.spring_db_backend.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Dog {
    @Id
    private Long id;
    private String name;
}
