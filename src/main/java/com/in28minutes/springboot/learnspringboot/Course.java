package com.in28minutes.springboot.learnspringboot;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The course class.
 *
 * @author architecture - raulp
 * @since Java 1.17
 * @version 20 May 2023 - 17:18:00
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Course {

    private long id;
    private String name;
    private String author;

}
