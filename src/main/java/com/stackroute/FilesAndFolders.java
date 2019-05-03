package com.stackroute;

import java.io.*;

public class FilesAndFolders {

    public void findFilesOfFolder(){

        File folder = new File("/home/arathi/IdeaProjects/JavaAssignment2/src/main/java/com/stackroute");

        String[] files = folder.list();

        for (String file : files)
        {
            System.out.println(file);
        }

    }

    public void selectGivenExtensionFile(){

        File folder = new File("/home/arathi/IdeaProjects/JavaAssignment2/src/main/java/com/stackroute");

        //Implementing FilenameFilter to retrieve only txt files

        FilenameFilter txtFileFilter = new FilenameFilter()
        {
            @Override
            public boolean accept(File dir, String name)
            {
                if(name.endsWith(".txt"))
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        };

        File[] files = folder.listFiles(txtFileFilter);

        for (File file : files)
        {
            System.out.println(file.getName());

            FileInputStream fin = null;

            try {
                fin = new FileInputStream(file);

                byte fileContent[] = new byte[(int)file.length()];

                fin.read(fileContent);
                String s = new String(fileContent);
                System.out.println("File content: " + s);
            }
            catch (FileNotFoundException e) {
                System.out.println("File not found" + e);
            }
            catch (IOException ioe) {
                System.out.println("Exception while reading file " + ioe);
            }
            finally {
                // close the streams using close method
                try {
                    if (fin != null) {
                        fin.close();
                    }
                }
                catch (IOException ioe) {
                    System.out.println("Error while closing stream: " + ioe);
                }
            }
        }

    }

}
