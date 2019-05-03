package com.stackroute;

import java.io.*;

public class ReadFileAndPrint {
    public void readAndPrintFile(){

        File file = new File("/home/arathi/IdeaProjects/JavaAssignment2/src/main/java/com/stackroute/test");

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String st;
        while (true) {
            try {
                if ((st = br.readLine()) != null) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(st);
        System.out.println(st.length());
    }
}
