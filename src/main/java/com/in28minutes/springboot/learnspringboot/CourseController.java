package com.in28minutes.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The course controller.
 *
 * @author architecture - raulp
 * @since Java 1.17
 * @version 20 May 2023 - 17:13:48
 *
 */
@RestController
public class CourseController {

    private static final String IN28MINUTES = "in28minutes";

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn AWS", IN28MINUTES),
                new Course(2, "Learn DevOps", IN28MINUTES),
                new Course(3, "Learn Azure", IN28MINUTES),
                new Course(4, "Learn GCP", IN28MINUTES)

                );
    }

}
