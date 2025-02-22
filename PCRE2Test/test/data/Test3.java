public class Test3 {
    public static void main(String[] args) {
        myFunction("xyz something");     // Matches
        myFunction("abc def ghi");       // Matches
        myFunction("tag id");            // Matches
        myFunction("no semicolon")       // Won't match (no semicolon)
        myFunction("xyz more stuff");    // Matches
        myFunction("123 numbers");       // Won't match (numbers in tag)
        myFunction("data value");        // Matches
        myFunction("xyz extra");         // Matches
        myFunction("end"more);           // Won't match (no quotes)
        myFunction("last call");         // Matches
    }
}