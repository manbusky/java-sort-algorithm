package manbu.demo;

import manbu.demo.impl.InsertSort;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {

//        Sort sort = new BubbleSort();

        Sort sort = new InsertSort();

        test(sort);

    }

    public static void test(Sort sort) {

        System.out.println(StringUtils.join(TestData.getData(), "\r\n"));

        System.out.println("-----------------------------");

        List<Person> list = Arrays.asList(sort.sort(TestData.getData()));

        System.out.println(StringUtils.join(list, "\r\n"));

    }


}
