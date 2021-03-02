package com.company;

import java.sql.SQLOutput;

/**
 * Class that will calculate the Optimal Binary Cost Tree
 *
 */
public class OBST {

    /**
     * Algorithm from text book
     * @param p - real key probability
     * @param q - dummy key probability
     * @param n - length of keys
     * @return - root matrix
     */
    static int[][] Optimal_BST(double[] p, double[] q, int n) {
        //e matrix
        double[][] e= new double[n+2][n+2];
        //w matrix
        double[][] w= new double[n+2][n+2];
        //root[i][j] records the root node in the resulting subsection [i,j]
        int[][] root= new int[n+2][n+2];

        //initialization of e and w matrix
        for(int i = 1; i < n + 1; i++) {
            e[i][i-1] = q[i-1];
            w[i][i-1] = q[i-1];
        }
        for(int l = 1; l <= n; l++) {
            for (int i = 1; i <= n-l+1; i++) {
                int j = i + l - 1;
                // Set the maximum value first to find the optimal solution
                e[i][j] = Double.MAX_VALUE;
                //w recursion
                w[i][j] = w[i][j-1] + p[j] + q[j];
                // Find the optimal root node from i to j
                for(int r = i; r <= j; r++) {
                    double t = e[i][r-1] + e[r+1][j] + w[i][j];
                    // Constantly keep e[i][j] to a min
                    if(t < e[i][j]) {
                        e[i][j] = t;
                        root[i][j] = r;
                    }
                }
            }

        }
        //print out the optimal cost of the array
        System.out.println("");
        System.out.println("The optimal cost is: " + e[1][n]);
        System.out.println("");
        //return e;
        return root;
    }
}
