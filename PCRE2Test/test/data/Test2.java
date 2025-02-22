public class Test2 {
    void method() {
        myFunction("start begin");       // Matches
        myFunction("xyz something");     // Matches
        myFunction("oops" missing);      // Won't match (no quotes, syntax error)
        myFunction("tag id here");       // Matches
        myFunction("data more data");    // Matches
        myFunction("xyz");               // Won't match (no space)
        myFunction("ab cd");             // Matches
        myFunction("test""extra");       // Won't match (invalid quotes)
        myFunction("xyz another");       // Matches
        myFunction("final wrap");        // Matches
    }
}