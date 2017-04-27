package com.tangqi.guava.Object;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.tangqi.guava.NotNull.Student;

/**
 * @Auhtor: tangqi@otasim.com
 * @Description: Object常用方法
 * @Date: Create in 16:23 2017/4/27
 * @Modified By:
 */
public class ObjectDemo {

    public static void main(String[] args) {
        System.out.println(Objects.equal("a","a"));
        Student student = new Student(1,"2",3);
        System.out.println(Objects.hashCode(student));
        System.out.println(MoreObjects.toStringHelper(Student.class).add("age",student.getAge()).toString());
    }
}
