package Xord;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {
    /**
     * https://stackoverflow.com/questions/22252299/crossword-generatorswedish-crossword-java
     */
    public static void main(String[] args) throws IOException {

        /**
         * Code for creating a window with a Xword grid.
         */
        int rows = 10;
        int cols = 10;
        int numberOfFields = rows * cols;
        Solution solution = new Solution();
        Window window = new Window(rows, cols, solution);


        System.out.println(window.checkAllFields(solution));

        /**
         * Code for creating a Board object to represent a Xword.
         *
        Board board = new Board(rows, cols);
        board.prepBoard();
        System.out.println(board.toString());

        /**
         * Code for fetching words from file
         * and creating a List object for them

        List<String> words = new ArrayList<String>();
        File inFile = new File("words.txt");
        BufferedReader br = new BufferedReader(new FileReader(inFile));
        String st = null;
        while ((st = br.readLine()) != null)
            words.add(st);
        br.close();
         */

    }
}
