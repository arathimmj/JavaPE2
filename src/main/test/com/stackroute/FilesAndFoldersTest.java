package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FilesAndFoldersTest {

    FilesAndFolders filesAndFolders;

    @Before
    public void setUp() throws Exception {

        filesAndFolders = new FilesAndFolders();

    }

    @After
    public void tearDown() throws Exception {

        filesAndFolders = null;

    }

    @Test
    public void testFindFilesOfFolder() {

        filesAndFolders.findFilesOfFolder();

    }

    @Test
    public void testSelectGivenExtensionFile() {

        filesAndFolders.selectGivenExtensionFile();

    }
}