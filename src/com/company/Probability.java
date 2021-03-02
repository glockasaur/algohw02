package com.company;

/**
 * CLASS THAT FIND THE REAL PROBABILITY OF THE KEYS
 */

import java.io.PrintWriter;

public class Probability {
    public int length;

    public double[] probabilityOf(int[] array) {

        //Array fr will store frequencies of element
        double[] fr = new double[array.length];
        //variable that will help keep track if the array value has been counted already
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

        //if keys are ==10
        if (array.length == 10) {
            try {
                double length = 21;
                PrintWriter pr = new PrintWriter("10probabilities.txt");
                //print probabilities into a text file
                for (int i = 0; i < fr.length; i++) {
                    if (fr[i] != visited)
                        pr.println(fr[i] / length);
                }
                pr.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("No such file exists.");
            }
            //if array == 100 keys
        } else if (array.length == 100) {
            try {
                double length = 201;
                PrintWriter pr = new PrintWriter("100probabilities.txt");
                //print probabilities into text file
                for (int i = 0; i < fr.length; i++) {
                    if (fr[i] != visited)
                        pr.println(fr[i] / length);
                }
                pr.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("No such file exists.");
            }
            //if array length == 1000
        } else if (array.length == 1000) {
            try {
                double length = 2001;
                PrintWriter pr = new PrintWriter("1000probabilities.txt");
                //print probabilities into text file
                for (int i = 0; i < fr.length; i++) {
                    if (fr[i] != visited)
                        pr.println(fr[i] / length);
                }
                pr.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("No such file exists.");
            }
            // if array length is == 10000
        } else if (array.length == 10000) {
            try {
                double length = 20001;
                PrintWriter pr = new PrintWriter("10000probabilities.txt");
                //for loop that prints out probabilities into array
                for (int i = 0; i < fr.length; i++) {
                    if (fr[i] != visited)
                        pr.println(fr[i] / length);
                }
                pr.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("No such file exists.");
            }
        } else if (array.length == 100000) {
            try {
                double length = 200001;
                PrintWriter pr = new PrintWriter("100000probabilities.txt");
                for (int i = 0; i < fr.length; i++) {
                    if (fr[i] != visited)
                        pr.println(fr[i] / length);
                }
                pr.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("No such file exists.");
            }
        } else if (array.length == 1000000) {
            try {
                double length = 2000001;
                PrintWriter pr = new PrintWriter("1000000probabilities.txt");
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
