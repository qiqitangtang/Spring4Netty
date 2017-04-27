package com.tangqi.guava.NotNull;

import com.google.common.collect.Comparators;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Auhtor: tangqi@otasim.com
 * @Description:
 * @Date: Create in 15:46 2017/4/27
 * @Modified By:
 */
@Data
@AllArgsConstructor
public class Student implements Comparable<Student>{
    private int age;
    private String name;
    private int height;

    public int compareTo(Student o) {
        return ComparisonChain.start()
                .compare(this.age , o.age)
                .compare(this.name , o.name)
                .compare(this.height , o.height, Ordering.natural().<Integer>nullsLast())
                .result();

    }
}
