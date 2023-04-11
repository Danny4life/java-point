package com.osiki.javatpoint.jenkov;

import java.util.Arrays;

public class CopyMain {
    public static void main(String[] args) {
        int[] source = new int[10];
        int[] dest = new int[10];


        for(int i = 0; i < source.length; i++){
            source[i] = i;
        }

        for(int i = 0; i < source.length; i++){
            dest[i] = source[i];

            //System.out.println(dest[i]);
        }

        int[] c = Arrays.copyOf(source, source.length - 3);

        //System.out.println(Arrays.toString(c));

        int[] copyRange = Arrays.copyOfRange(source, 3, source.length);
       // System.out.println(Arrays.toString(copyRange));

        int[] ints = new int[10];
        int rev = ints.length;

        for(int i = 0; i < ints.length; i++){
            ints[i] = ints.length - i;
            rev = ints[i];
           // System.out.println(Arrays.toString(ints));
        }

        //System.out.println(Arrays.toString(ints));

        int[] a = new int[10];

        for(int i = 0; i < a.length; i++){
            a[i] = 10 - i;

        }
        Arrays.sort(a);

        //System.out.println(Arrays.toString(a));

        int[] b = {0, 2, 4, 6, 8};

        int index = Arrays.binarySearch(b, 0);
        System.out.println(index);

    }
}
