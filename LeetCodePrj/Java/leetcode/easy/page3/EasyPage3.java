package leetcode.easy.page3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

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

    @Test
    public void testNAryTreeLevelOrderTraversal() {
        NAryTreeLevelOrderTraversal.Node sixth = new NAryTreeLevelOrderTraversal.Node();
        sixth.val = 6;

        NAryTreeLevelOrderTraversal.Node fifth = new NAryTreeLevelOrderTraversal.Node();
        fifth.val = 5;

        NAryTreeLevelOrderTraversal.Node fourth = new NAryTreeLevelOrderTraversal.Node();
        fourth.val = 4;

        NAryTreeLevelOrderTraversal.Node third = new NAryTreeLevelOrderTraversal.Node();
        third.val = 2;

        NAryTreeLevelOrderTraversal.Node second = new NAryTreeLevelOrderTraversal.Node();
        second.val = 3;
        second.children = Arrays.asList(fifth, sixth);

        NAryTreeLevelOrderTraversal.Node first = new NAryTreeLevelOrderTraversal.Node();
        first.val = 1;
        first.children = Arrays.asList(second, third, fourth);

        NAryTreeLevelOrderTraversal nAryTreeLevelOrderTraversal = new NAryTreeLevelOrderTraversal();
        System.out.println(nAryTreeLevelOrderTraversal.levelOrder(first));
    }

    @Test
    public void testNumberOfSegmentsInAString() {
        NumberOfSegmentsInAString numberOfSegmentsInAString = new NumberOfSegmentsInAString();
        String s = "Hello, my name is John";
        System.out.println(numberOfSegmentsInAString.countSegments(s));
    }

    @Test
    public void FindAllAnagramsInAString() {
        FindAllAnagramsInAString findAllAnagramsInAString = new FindAllAnagramsInAString();
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAllAnagramsInAString.findAnagrams(s, p));
    }

    @Test
    public void testArrangingCoins() {
        ArrangingCoins arrangingCoins = new ArrangingCoins();
        System.out.println(arrangingCoins.arrangeCoins(2147483647));
    }

    @Test
    public void testStringCompression() {
        StringCompression stringCompression = new StringCompression();
        char[] chars = new char[] {'a','b','b','c','c','c'};
        stringCompression.compress(chars);
    }

    @Test
    public void testNumberOfBoomerangs() {
        NumberOfBoomerangs numberOfBoomerangs = new NumberOfBoomerangs();
        int[][] array = new int[][] {
                {0,0},{1,0},{2,0},{0, -1}
        };
        System.out.println(numberOfBoomerangs.numberOfBoomerangs(array));
    }

    @Test
    public void testHeaters() {
        Heaters heatersSolution = new Heaters();
        int[] houses = new int[]{1,2,3};
        int[] heaters = new int[]{2};
        System.out.println(heatersSolution.findRadius(houses, heaters));
    }

    @Test
    public void testFirstUniqueCharacterInAString() {
        FirstUniqueCharacterInAString firstUniqueCharacterInAString = new FirstUniqueCharacterInAString();
        String s = "loveleetcode";
        System.out.println(firstUniqueCharacterInAString.firstUniqChar(s));
    }
}
