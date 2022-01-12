package com.itms.coaching.core.java.tests;

import org.testng.annotations.Test;
import utils.ArrayUtils;

public class ArrayTests {
    @Test
    public void simpleArrayTests() {
        int[] a = new int[3];
        int[] b = new int[5];

        a[0] = 10;
        a[1] = 20;
        a[2] = 30;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        for (int j : a) {
            System.out.println(j);
        }
    }
    @Test
    public void initArrayTest() {
        int[] a = {10, 20, 30};
        for (int j : a) {
            System.out.println(j);

        }
    }
    @Test
    public void passingArrayParameterTest() {
        int[] a = {10, 20, 30, 5, 4, 8};
        System.out.println(ArrayUtils.min(a));

        }
    @Test
    public void anonymousArrayTest() {
        int[] b = new int[]{10, 20, 30, 5, 4, 8, 2};
        System.out.println(ArrayUtils.min(b));

        System.out.println(ArrayUtils.min(new int[]{10,20,30,5,4,8,2}));
    }

    @Test
    public void returnArrayTest(){
        int[] x = getSampleArray();

        for (int j:x){
            System.out.println(j);
        }
    }
    public int[] getSampleArray(){
        return new int[]{10, 20, 30, 5, 4, 8};
    }

    @Test
    public  void simple2DArrayTest() {
        int[][] a = new int[2][3];
        a[0][0] = 1;
        a[0][1] = 2;
        a[0][2] = 3;
        a[1][0] = 4;
        a[1][1] = 5;
        a[1][2] = 6;

        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[0].length; j++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]);
            }
        }
        for (int[] i : a) {
            for (int j : i) {
                System.out.println(j);
            }
        }
    }

    @Test
    public  void jaggedArrayTest(){
        int[][] a = new int[2][];

        a[0] = new int[2];
        a[1] = new int[3];

        a[0][0] = 1;
        a[0][1] = 2;
        a[1][0] = 3;
        a[1][1] = 4;
        a[1][2] = 5;

        for (int[] i : a) {
            for (int j : i) {
                System.out.println(j);
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]);
            }
        }
    }
}
