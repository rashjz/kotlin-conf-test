package app.test.stream;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Collections;
import java.util.stream.Stream;

@RunWith(JUnit4.class)
public class StreamTasksTest {
    private StreamTasks streamTasks =new StreamTasks();

    @Test
    public void test() {
        Student student = new Student(Collections.singletonList("abs"));
        final Student student2 = new Student(Collections.singletonList("ads"));
        Student student3 = new Student(Collections.singletonList("abs"));

        Stream stream = Stream.of(student, student2, student3);
        Assert.assertNotNull(streamTasks.getDistinctList(stream));

    }
} 
