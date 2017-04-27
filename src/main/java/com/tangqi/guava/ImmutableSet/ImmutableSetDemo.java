package com.tangqi.guava.ImmutableSet;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;

import java.util.Set;

/**
 * @Auhtor: tangqi@otasim.com
 * @Description: 不可变集合
 * @Date: Create in 16:50 2017/4/27
 * @Modified By:
 */
public class ImmutableSetDemo {

    public static final ImmutableSet<String> COLOR_NAMES = ImmutableSet.of(
            "red",
            "orange",
            "yellow",
            "green",
            "blue",
            "purple"
    );

    class Foo {
        Set<String> bars;
        Foo (Set<String> bars) {
            this.bars = ImmutableSet.copyOf(bars);
        }
    }

    public static void main(String[] args) {
        //init
        Set<String> bars = ImmutableSet.copyOf(COLOR_NAMES);
        bars = ImmutableSet.of("a","b","c");
        bars = ImmutableSet.<String>builder().add("a","b","c").build();
        bars = ImmutableSortedSet.of("a", "b", "c", "a", "d", "b");


    }
}
