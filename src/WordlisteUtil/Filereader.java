package WordlisteUtil;

import java.awt.image.DataBufferDouble;
import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Reads a txt and takes all words and sorts them after length.
 */
public class Filereader {
    public static void main(String[] args) throws IOException {
        List<String> words = new ArrayList<String>();
        File inFile = new File("ordliste_aspell.txt");
        BufferedReader br = new BufferedReader(new FileReader(inFile));

        String st = null;
        while ((st = br.readLine()) != null)
            words.add(st);
        br.close();

        Collections.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

        File outFile = new File("words.txt");
        FileWriter fileWriter = new FileWriter(outFile);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        for (int i = 0; i < words.size(); i++) {
            if(words.get(i).length() == 10)
                break;
            if(words.get(i).length() > 2)
                printWriter.println(words.get(i));
        }
        printWriter.close();
    }
}
