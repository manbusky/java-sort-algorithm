package manbu.demo.impl;

import manbu.demo.Person;
import manbu.demo.Sort;

/**
 * 插入排序
 * Created by manbu on 12/26/16.
 */
public class InsertSort implements Sort {

    @Override
    public Person[] sort(Person[] array) {

        if(array.length < 1) { return array; }

        int count = array.length;

        for (int i = 1; i < count; i++ ) {

            for (int j = i - 1; j >= 0; j--) {

                if(array[j + 1].getClassId() < array[j].getClassId()) {

                    Person temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;

                }
            }
        }

        return array;
    }
}
