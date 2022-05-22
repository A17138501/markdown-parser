import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks1() throws IOException {
        ArrayList<String> arr = new ArrayList<>();
        arr = MarkdownParse
                .getLinks(Files.readString(Path.of("test-file.md")));

        assertEquals(List.of("https://something.com", "some-thing.html"), arr);
    }
// wahts up
    @Test
    public void testGetLinks2() throws IOException {
        ArrayList<String> arr = new ArrayList<>();
        arr = MarkdownParse
                .getLinks(Files.readString(Path.of("test-file2.md")));

        assertEquals(List.of("https://something.com"), arr);
    }

    @Test
    public void testGetLinks3() throws IOException {
        ArrayList<String> arr = new ArrayList<>();
        arr = MarkdownParse
                .getLinks(Files.readString(Path.of("test-file3.md")));

        assertEquals(List.of(), arr);
    }

    @Test
    public void testGetLinks4() throws IOException {
        ArrayList<String> arr = new ArrayList<>();
        arr = MarkdownParse
                .getLinks(Files.readString(Path.of("test-file4.md")));

        assertEquals(List.of(), arr);
    }

    @Test
    public void testGetLinks5() throws IOException {
        ArrayList<String> arr = new ArrayList<>();
        arr = MarkdownParse
                .getLinks(Files.readString(Path.of("test-file5.md")));

        assertEquals(List.of("page.com"), arr);
    }

    @Test
    public void testGetLinks6() throws IOException {
        ArrayList<String> arr = new ArrayList<>();
        arr = MarkdownParse
                .getLinks(Files.readString(Path.of("test-file6.md")));

        assertEquals(List.of("page.com"), arr);
    }

    @Test
    public void testGetLinks7() throws IOException {
        ArrayList<String> arr = new ArrayList<>();
        arr = MarkdownParse
                .getLinks(Files.readString(Path.of("test-file7.md")));

        assertEquals(List.of(), arr);
    }

    @Test
    public void testGetLinks8() throws IOException {
        ArrayList<String> arr = new ArrayList<>();
        arr = MarkdownParse
                .getLinks(Files.readString(Path.of("test-file8.md")));

        assertEquals(List.of("a link on the first line"), arr);
    }


    @Test
    public void Snippet1() throws IOException {
        ArrayList<String> arr = new ArrayList<>();
        arr = MarkdownParse
                .getLinks(Files.readString(Path.of("/Users/rundongguo/Desktop/markdown-parser/markdown-parser/Snippet1.md")));

        assertEquals(List.of("`google.com","google.com","ucsd.edu"), arr);
    }

    @Test
    public void Snippet2() throws IOException {
        ArrayList<String> arr = new ArrayList<>();
        arr = MarkdownParse
                .getLinks(Files
                        .readString(Path.of("/Users/rundongguo/Desktop/markdown-parser/markdown-parser/Snippet2.md")));

        assertEquals(List.of("b.com", "a.com(())", "example.com"), arr);

    }

@Test
public void Snippet3() throws IOException {
    ArrayList<String> arr = new ArrayList<>();
    arr = MarkdownParse
            .getLinks(
                    Files.readString(Path.of("/Users/rundongguo/Desktop/markdown-parser/markdown-parser/Snippet3.md")));
    assertEquals(
            List.of("https://www.twitter.com", "https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule",
    "https://cse.ucsd.edu/"), arr);
    
}

}

