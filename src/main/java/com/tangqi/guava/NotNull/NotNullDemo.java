package com.tangqi.guava.NotNull;

import com.google.common.base.Optional;

/**
 * @Auhtor: tangqi@otasim.com
 * @Description:非空控制
 * @Date: Create in 15:42 2017/4/27
 * @Modified By:
 */
public class NotNullDemo {
    public static void main(String[] args) {
//        Optional<Integer> possible = Optional.of(5);
//        System.out.println(possible.isPresent());
//        System.out.println(possible.get());

        Student student = null;
        Student student1 = new Student(2,"123",123);
        student = Optional.fromNullable(student).or(student1);
        //Optional<Student> studentOptional = Optional.absent();
        Optional<Student> studentOptional = Optional.fromNullable(student);
        //student = studentOptional.or(student1);
        System.out.println(student.getAge());
        if (studentOptional.isPresent())
            System.out.println(studentOptional.get());
        else
            System.out.println("student is null");
    }
}
