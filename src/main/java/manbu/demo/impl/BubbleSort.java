package manbu.demo.impl;

import manbu.demo.Person;
import manbu.demo.Sort;

/**
 * 冒泡排序
 * Created by manbu on 12/12/16.
 */
public class BubbleSort implements Sort {

    public Person[] sort(Person[] array) {

        for (int j = 0; j < array.length - 1; j++) {

            for (int i = 0; i < array.length - 1 - j; i++) {

                if(array[i].getClassId() > array[i + 1].getClassId()) {
                    Person temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }

        return array;
    }

}
