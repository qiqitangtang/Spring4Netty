package com.tangqi.guava.Ordering;

import com.google.common.base.Function;
import com.google.common.collect.Ordering;

/**
 * @Auhtor: tangqi@otasim.com
 * @Description: 排序器
 * @Date: Create in 16:40 2017/4/27
 * @Modified By:
 */
public class OrderingDemo {

    class Foo {
        String sortedBy;
        int notSortedBy;
    }

    public static void main(String[] args) {
        Ordering<Foo> ordering = Ordering.natural().nullsFirst().onResultOf(new Function<Foo, String>() {
            public String apply(Foo foo) {
                return foo.sortedBy;
            }
        });

    }
}
