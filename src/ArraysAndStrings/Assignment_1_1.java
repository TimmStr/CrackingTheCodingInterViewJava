package ArraysAndStrings;

import java.util.ArrayList;

public class Assignment_1_1 {
    public static void main(String[] args) {
        System.out.println(checkUnqiue("Hallo"));
        System.out.println(checkUnqiue("xxxyyzzujklmnnnax"));
        System.out.println(withoutDataStructure("halo"));
    }

    public static ArrayList<Character> checkUnqiue(String word) {
        int doublecharacters = 0;
        ArrayList<Character> chars = new ArrayList<Character>();
        for (int i = 0; i < word.length(); i++) {
            char compareChar = word.charAt(i);
            boolean test = true;
            for (int j = 0; j < chars.size(); j++) {
                if (compareChar == chars.get(j)) {
                    test = false;
                    doublecharacters = doublecharacters+1;
                }
            }
            if (test == true) {
                chars.add(compareChar);
            }
        }
        System.out.println("Double Characters " + doublecharacters);
        return chars;
    }

    public static boolean withoutDataStructure(String word){
        for(int i =0;i<word.length();i++){
            boolean test=true;
            char compareChar=word.charAt(i);
            for(int j =i+1;j<word.length();j++){
                if(compareChar==word.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}
