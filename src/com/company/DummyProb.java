package com.company;

import java.io.PrintWriter;

/**
 * Class that will find dummy key probabilities
 */

public class DummyProb {

    public double[] DummyOf(int[] array) {
        //Array fr will store frequencies of element
        //dummy keys is length of array + 1
        double[] fr = new double[array.length + 1];
        int visited = -1;
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    //To avoid counting same element again
                    fr[j] = visited;
                }
            }
            if (fr[i] != visited)
                fr[i] = count;
        }

        //Displays the frequency of each element present in array

        //if array length is == 10
        if (array.length == 10) {
            try {
                double length = 21;
                PrintWriter pr = new PrintWriter("10dummy.txt");
                //print out dummy key probability into text file
                for (int i = 0; i < fr.length; i++) {
                    if (fr[i] != visited)
                        pr.println(fr[i] / length);
                }
                pr.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("No such file exists.");
            }
        }
        else if (array.length == 100) {
            try {
                double length = 201;
                PrintWriter pr = new PrintWriter("100dummy.txt");
                for (int i = 0; i < fr.length; i++) {
                    if (fr[i] != visited)
                        pr.println(fr[i] / length);
                }
                pr.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("No such file exists.");
            }
        }
        else if (array.length == 1000) {
            try {
                double length = 2001;
                PrintWriter pr = new PrintWriter("1000dummy.txt");
                for (int i = 0; i < fr.length; i++) {
                    if (fr[i] != visited)
                        pr.println(fr[i] / length);
                }
                pr.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("No such file exists.");
            }
        }
        else if (array.length == 10000) {
            try {
                double length = 20001;
                PrintWriter pr = new PrintWriter("10000dummy.txt");
                for (int i = 0; i < fr.length; i++) {
                    if (fr[i] != visited)
                        pr.println(fr[i] / length);
                }
                pr.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("No such file exists.");
            }
        }
        else if (array.length == 100000) {
            try {
                double length = 200001;
                PrintWriter pr = new PrintWriter("100000dummy.txt");
                for (int i = 0; i < fr.length; i++) {
                    if (fr[i] != visited)
                        pr.println(fr[i] / length);
                }
                pr.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("No such file exists.");
            }
        }
        else if (array.length == 1000000) {
            try {
                double length = 2000001;
                PrintWriter pr = new PrintWriter("1000000dummy.txt");
                for (int i = 0; i < fr.length; i++) {
                    if (fr[i] != visited)
                        pr.println(fr[i] / length);
                }
                pr.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("No such file exists.");
            }
        }
        return fr;
    }
}
