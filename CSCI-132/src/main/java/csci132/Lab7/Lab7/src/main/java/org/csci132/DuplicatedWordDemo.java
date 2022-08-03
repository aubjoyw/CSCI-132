package csci132.Lab7.Lab7.src.main.java.org.csci132;

/**
 * @author : Adiesha
 * @created : 7/28/2022, Thursday
 **/
public class DuplicatedWordDemo {
    public static void main(String[] args) {
        String sentence1 = "In fact, when I described this possible future to Brian McClendon, the head of mapping at Uber, he didn't even pause before responding.";
        String sentence2 = "To this day, 40 years later, enough silver medals for a whole basketball team still sit gathering dust in a vault in Lusanne, Switzerland.";
        String sentence3 = "If your licence exceeds its validity period then you can be issued with a new licence in the following way. But you have to go to the DMV and book an appointment";

        DuplicatedWord.wordFrequency(sentence1);
        DuplicatedWord.wordFrequency(sentence2);
        DuplicatedWord.wordFrequency(sentence3);
    }
}
