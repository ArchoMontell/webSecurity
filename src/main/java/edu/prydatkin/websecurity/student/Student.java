package edu.prydatkin.websecurity.student;

/*
    @author lilbl
    @project webSecurity
    @class Item
    @version 1.0.0
    @since 10/2/2025 - 23.39
*/

import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Student {

    @Id
    private String id;
    private String name;
    private String gender;

    public Student(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;

        return getId().equals(student.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
