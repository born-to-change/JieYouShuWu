package graduation.project.api.model;

import org.junit.Test;

import java.util.Arrays;

public class TestStream {
        @Test
        public void test1(){
            Integer[] nums = new Integer[]{1,2,3,4,5};

            Arrays.stream(nums)
                    .map((x)->x*x)
                    .forEach(System.out::println);
        }

    }

