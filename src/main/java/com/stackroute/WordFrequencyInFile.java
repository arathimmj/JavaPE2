package com.stackroute;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class WordFrequencyInFile {

    public void findWordFrequency(){

        File file = new File("/home/arathi/IdeaProjects/JavaAssignment2/src/main/java/com/stackroute/test");

        BufferedReader br = null;
        try {

            br = new BufferedReader(new FileReader(file));

        }
        catch (FileNotFoundException e) {

            e.printStackTrace();

        }

        String st;
        while (true) {

            try {

                if ((st = br.readLine()) != null) break;

            }
            catch (IOException e) {

                e.printStackTrace();

            }
        }

        String[] arrOfStr = st.split(" ", 0);

        LinkedList<String[]> list = new LinkedList<>();

        boolean exist = false;

        for (int i = 0; i<arrOfStr.length; i++){

            for (int j = 0; j<i; j++){

                if (arrOfStr[i] == arrOfStr[j]){

                    exist = true;
                    break;

                }
                else
                    exist = false;

            }

            int k = 0;

            if (!exist){

                for (int j = 0; j<arrOfStr.length;j++){

                    if (arrOfStr[i].equals(arrOfStr[j])){

                        k++;

                    }

                }

                String[] arr = {arrOfStr[i], String.valueOf(k)};

                list.add(arr);

            }

        }

        for (String[] s : list){

            for (int m = 0;m<2;m++)
                System.out.print(s[m]+" ");

            System.out.println();

        }
    }

}
