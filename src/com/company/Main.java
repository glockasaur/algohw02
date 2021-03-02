package com.company;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import static com.company.ReadFile.readFile;

public class Main {

    public static void main(String[] args) throws IOException {


        /** TEN INTEGERS */
        ReadFile tenFile = new ReadFile();
        readFile(new File("C:\\\\Users\\\\odaly\\\\OneDrive - Florida Gulf Coast University\\\\algohw02\\\\src\\\\10keys.txt"));
        int[] arrayten = tenFile.getFile();
        Probability prob10 = new Probability();
        double prob10array[] = prob10.probabilityOf(arrayten);
        DummyProb dummy10 = new DummyProb();
        double dummy10array[] = dummy10.DummyOf(arrayten);

        /**
         * 10 keys print OBST
         */
        int n10 = prob10array.length - 1;
        //root[i][j] records the root node in the resulting subsection [i,j]
        OBST obst10 = new OBST();
        int[][] root10 = obst10.Optimal_BST(prob10array, dummy10array, n10);
        //root length is n+2, i and j only need to loop to n
        // Output this root matrix, directly based on this matrix can also draw the best binary search tree
        try {
            int temp = root10.length - 1;
            PrintWriter pr = new PrintWriter("10root.txt");

            for (int i = 1; i < temp; i++) {
                for (int j = 1; j < temp; j++) {
                    pr.print(root10[i][j] + "-");
                }
                pr.println();
            }
            pr.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No such file exists.");
        }



        /** ONE HUNDRED INTEGERS */
        ReadFile hundredFile = new ReadFile();
        readFile(new File("C:\\\\Users\\\\odaly\\\\OneDrive - Florida Gulf Coast University\\\\algohw02\\\\src\\\\100keys.txt"));
        int[] arrayhundred = hundredFile.getFile();
        Probability prob100 = new Probability();
        double prob100array[] = prob100.probabilityOf(arrayhundred);
        DummyProb dummy100 = new DummyProb();
        double dummy100array[] = dummy100.DummyOf(arrayhundred);

        /**
         * 100 keys print OBST
         */
        int n100 = prob100array.length - 1;
        //root[i][j] records the root node in the resulting subsection [i,j]
        OBST obst100 = new OBST();
        int[][] root100 = obst100.Optimal_BST(prob100array, dummy100array, n100);
        //root length is n+2, i and j only need to loop to n
        // Output this root matrix, directly based on this matrix can also draw the best binary search tree
        try {
            int temp = root100.length - 1;
            PrintWriter pr = new PrintWriter("100root.txt");

            for (int i = 1; i < temp; i++) {
                for (int j = 1; j < temp; j++) {
                    pr.print(root100[i][j] + "-");
                }
                pr.println();
            }
            pr.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No such file exists.");
        }


        /** ONE THOUSAND INTEGERS */
        ReadFile thousandFile = new ReadFile();
        readFile(new File("C:\\\\Users\\\\odaly\\\\OneDrive - Florida Gulf Coast University\\\\algohw02\\\\src\\\\1000keys.txt"));
        int[] arraythousand = thousandFile.getFile();
        Probability prob1000 = new Probability();
        double prob1000array[] = prob1000.probabilityOf(arraythousand);
        DummyProb dummy1000 = new DummyProb();
        double dummy1000array[] = dummy1000.DummyOf(arraythousand);

        /**
         * 1000 keys print OBST
         */
        int n1000 = prob1000array.length - 1;
        //root[i][j] records the root node in the resulting subsection [i,j]
        OBST obst1000 = new OBST();
        int[][] root1000 = obst1000.Optimal_BST(prob1000array, dummy1000array, n1000);
        //root length is n+2, i and j only need to loop to n
        // Output this root matrix, directly based on this matrix can also draw the best binary search tree
        try {
            int temp = root1000.length - 1;
            PrintWriter pr = new PrintWriter("1000root.txt");

            for (int i = 1; i < temp; i++) {
                for (int j = 1; j < temp; j++) {
                    pr.print(root1000[i][j] + "-");
                }
                pr.println();
            }
            pr.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No such file exists.");
        }

/**
 * THE FOLLOWING CODE IS FOR THE 10000, 100000, AND 1000000 KEYS
 * MY COMPUTER CANNOT RUN IT
 */
//        /** ONE TEN THOUSAND INTEGERS */
//        ReadFile tenthousandFile = new ReadFile();
//        readFile(new File("C:\\\\Users\\\\odaly\\\\OneDrive - Florida Gulf Coast University\\\\algohw02\\\\src\\\\10000keys.txt"));
//        int[] arraytenthousand = tenthousandFile.getFile();
//        Probability prob10000 = new Probability();
//        double prob10000array[] = prob10000.probabilityOf(arraytenthousand);
//        DummyProb dummy10000 = new DummyProb();
//        double dummy10000array[] = dummy10000.DummyOf(arraytenthousand);
//
//        /**
//         * 10000 keys print OBST
//         */
//        int n10000 = prob10000array.length - 1;
//        //root[i][j] records the root node in the resulting subsection [i,j]
//        OBST obst10000 = new OBST();
//        int[][] root10000 = obst10000.Optimal_BST(prob10000array, dummy10000array, n10000);
//        //root length is n+2, i and j only need to loop to n
//        // Output this root matrix, directly based on this matrix can also draw the best binary search tree
//        try {
//            int temp = root10000.length - 1;
//            PrintWriter pr = new PrintWriter("10000root.txt");
//
//            for (int i = 1; i < temp; i++) {
//                for (int j = 1; j < temp; j++) {
//                    System.out.print(root10000[i][j] + "-");
//                    pr.print(root10000[i][j] + "-");
//                }
//                pr.println();
//            }
//            pr.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("No such file exists.");
//        }
//
//
//
//
//    /** ONE HUNDRED THOUSAND INTEGERS */
//    ReadFile hunthousandFile = new ReadFile();
//    readFile(new File("C:\\\\Users\\\\odaly\\\\OneDrive - Florida Gulf Coast University\\\\algohw02\\\\src\\\\100000keys.txt"));
//    int[] arrayhunthousand = hunthousandFile.getFile();
//    Probability prob100000 = new Probability();
//    double prob100000array[] = prob100000.probabilityOf(arrayhunthousand);
//    DummyProb dummy100000 = new DummyProb();
//    double dummy100000array[] = dummy100000.DummyOf(arrayhunthousand);
//
//    /**
//     * 100000 keys print OBST
//     */
//    int n100000 = prob100000array.length - 1;
//    //root[i][j] records the root node in the resulting subsection [i,j]
//    OBST obst100000 = new OBST();
//    int[][] root100000 = obst100000.Optimal_BST(prob100000array, dummy100000array, n100000);
//    //root length is n+2, i and j only need to loop to n
//    // Output this root matrix, directly based on this matrix can also draw the best binary search tree
//        try {
//        int temp = root100000.length - 1;
//        PrintWriter pr = new PrintWriter("100000root.txt");
//
//        for (int i = 1; i < temp; i++) {
//            for (int j = 1; j < temp; j++) {
//                System.out.print(root100000[i][j] + "-");
//                pr.print(root100000[i][j] + "-");
//            }
//            pr.println();
//        }
//        pr.close();
//    } catch (Exception e) {
//        e.printStackTrace();
//        System.out.println("No such file exists.");
//    }
//
//
//        /** ONE MILLION INTEGERS */
//        ReadFile millionFile = new ReadFile();
//        readFile(new File("C:\\\\Users\\\\odaly\\\\OneDrive - Florida Gulf Coast University\\\\algohw02\\\\src\\\\1000000keys.txt"));
//        int[] arraymillion = millionFile.getFile();
//        Probability prob1000000 = new Probability();
//        double prob1000000array[] = prob1000000.probabilityOf(arraymillion);
//        DummyProb dummy1000000 = new DummyProb();
//        double dummy1000000array[] = dummy1000000.DummyOf(arraymillion);
//
//        /**
//         * 1000000 keys print OBST
//         */
//        int n1000000 = prob1000000array.length - 1;
//        //root[i][j] records the root node in the resulting subsection [i,j]
//        OBST obst1000000 = new OBST();
//        int[][] root1000000 = obst1000000.Optimal_BST(prob1000000array, dummy1000000array, n1000000);
//        //root length is n+2, i and j only need to loop to n
//        // Output this root matrix, directly based on this matrix can also draw the best binary search tree
//        try {
//            int temp = root1000000.length - 1;
//            PrintWriter pr = new PrintWriter("100000root.txt");
//
//            for (int i = 1; i < temp; i++) {
//                for (int j = 1; j < temp; j++) {
//                    System.out.print(root1000000[i][j] + "-");
//                    pr.print(root1000000[i][j] + "-");
//                }
//                pr.println();
//            }
//            pr.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("No such file exists.");
//        }
}}

