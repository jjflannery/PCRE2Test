public class Test1 {
    public static void main(String[] args) {
        myFunction("abc def");           // Matches
        myFunction("xyz something");     // Matches
        myFunction("tag id");            // Matches
        myFunction("hello world");       // Matches
        myFunction("tag123 value");      // Won't match (numbers in tag)
        myFunction ("xyz more");         // Matches (space before parenthesis)
        myFunction("data stuff");        // Matches
        myFunction("abc")                // Won't match (no space before identifier)
        myFunction("xyz lots");          // Matches
        myFunction("end test");          // Matches
    }
}