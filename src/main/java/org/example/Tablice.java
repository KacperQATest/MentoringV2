package org.example;

import javafx.beans.binding.BooleanExpression;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;

public class Tablice {
    public static void main(String[] args) {

        /*2.2. Shared Reference
        The original array and the list share the same references to the objects:*/
    /*    String[] array = {"foo", "bar"};
        List<String> list = Arrays.asList(array);
        array[0] = "baz";
        Assert.assertEquals("baz", list.get(0));*/

        /*String[] array = {"foo", "bar"};
        List<String> list = Arrays.asList(array);*/

        /*3. Create From a Stream (Java 8)
        We can easily convert a Stream into any kind of Collection. Therefore, with the factory methods for Streams, we can create and initialize lists in one line:*/
       /* List<String> list = Stream.of("foo", "bar")
                .collect(Collectors.toList());

        Assert.assertTrue(list.contains("foso"));*/


    }


}
