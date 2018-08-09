package app.test.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Rashad on 8/6/2018.
 * TASK : how to get distinct list from list of lists with java 8
 */
public class StreamTasks {


    Set<String> getDistinctList(Stream<Student> stream) {
        return stream.map(Student::getBooks)
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());
    }
} 
