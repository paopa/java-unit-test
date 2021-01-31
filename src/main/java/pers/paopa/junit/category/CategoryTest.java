package pers.paopa.junit.category;

import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.Test;

@Category(value = {UnitTest.class})
public class CategoryTest {

    @Test
    public void test() {
        System.out.println("run test");
    }
}