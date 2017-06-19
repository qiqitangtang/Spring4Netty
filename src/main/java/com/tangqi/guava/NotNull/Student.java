package com.tangqi.guava.NotNull;

import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;

/**
 * @Auhtor: tangqi@otasim.com
 * @Description:
 * @Date: Create in 15:46 2017/4/27
 * @Modified By:
 */

public class Student implements Comparable<Student>{
    private int age;
    private String name;
    private int height;

    public Student(int age, String name, int height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public int compareTo(Student o) {
        return ComparisonChain.start()
                .compare(this.age , o.age)
                .compare(this.name , o.name)
                .compare(this.height , o.height, Ordering.natural().<Integer>nullsLast())
                .result();

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
