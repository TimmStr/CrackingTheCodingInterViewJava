import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class A1Hash {
    ArrayList<String> merge(String[] words, String[] more){
        ArrayList<String> sentence = new ArrayList<String>();
        for (String w : words) sentence.add(w);
        for (String w : more)sentence.add(w);
        return sentence;
    }

    public static void main(String[] args) {

        String  []word={"Hello","Hi"};
        String []more ={"Ivan","Max"};
    }
}
