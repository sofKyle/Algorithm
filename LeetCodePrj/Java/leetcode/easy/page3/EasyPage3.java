package leetcode.easy.page3;

import org.junit.jupiter.api.Test;

public class EasyPage3 {
    @Test
    public void testThirdMaximumNumber() {
        int[] intArray = new int[]{3, 2, 1};
        ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber();
        System.out.println(thirdMaximumNumber.thirdMax(intArray));
    }

    @Test
    public void testAddStrings() {
        AddStrings addStrings = new AddStrings();
        System.out.println(addStrings.addStrings("98", "9"));
    }
}
