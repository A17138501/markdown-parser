//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {

    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then read link upto next )
        int currentIndex = 0;
        while (currentIndex < markdown.length()) {
            int openBracket = markdown.indexOf("[", currentIndex);
            int backTick = markdown.indexOf("`", currentIndex);
            if (openBracket == -1) {
                break;
            }
            int closeBracket = markdown.indexOf("]", openBracket);
            if (closeBracket == -1) {
                break;
            }
            int openParen = markdown.indexOf("(", closeBracket);
            if (openParen == -1) {
                break;
            }

            int closeParen = markdown.indexOf(")", openParen);

            // String ss = markdown.substring(openParen + 1, closeParen + 20);
            // closeParen = openParen+1 + findlast(ss);
            if (closeParen == -1) {
                break;
            }
            if (!(openBracket - backTick == 1) || !((markdown.substring(openBracket, closeBracket+1)).contains("\n"))) {
                toReturn.add(markdown.substring(openParen + 1, closeParen));
            }
            currentIndex = closeParen + 1;
        }

        return toReturn;
    }
    
    public static int findlast(String str) {
        String[] strArray = new String[] {str};
        for (int i = strArray.length-1; i >= 0; i--) {
            if (strArray[i] == ")") {
                return i;
            }
        }
        return 0;
    }


    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(args[0]);
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
	    System.out.println(links);
    }
}
