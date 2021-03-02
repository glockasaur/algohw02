package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * class that will read a text file into the program
 * used in assignment 01
 */

public class ReadFile {
    private static int[] LetsSort;


    public static int[] readFile(File fileEntered) throws IOException {

        File file = new File(String.valueOf(fileEntered));

        byte[] bytes = new byte[(int) file.length()];
        FileInputStream fis = new FileInputStream(file);
        fis.read(bytes);
        fis.close();
        String[] valueStr = new String(bytes).trim().split("\\s+");
        LetsSort = new int[valueStr.length];
        for (int i = 0; i < valueStr.length; i++)
            LetsSort[i] = Integer.parseInt(valueStr[i]);

        return LetsSort;
    }

    public int[] getFile(){
        return LetsSort;
    }

    public void setFile(int[] letsSort){
        this.LetsSort = letsSort;

    }
}
