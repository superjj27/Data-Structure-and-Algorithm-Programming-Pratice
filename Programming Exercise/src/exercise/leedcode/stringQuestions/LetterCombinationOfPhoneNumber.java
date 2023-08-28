package exercise.leedcode.stringQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationOfPhoneNumber {

    public static List<String> letterCombinations (String digits) {
        //23

        List<String> res=new ArrayList<>();
        if(digits.length()==0) return res;
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        backTrack(digits, 0, map, new StringBuilder(), res);
        return res;
    }

    private static void backTrack(String digits, int i, Map<Character,String> hm,StringBuilder sb,List<String>res){
        if(i==digits.length()){
            res.add(sb.toString());
            return;
        }

        String curr=hm.get(digits.charAt(i));
        for(int k=0;k<curr.length();k++){
            sb.append(curr.charAt(k));
            backTrack(digits, i+1, hm,  sb, res);
            sb.deleteCharAt(sb.length() -1);
        }
    }

    public static void main(final String[] args) {

        String digits = "23";
        System.out.println(letterCombinations(digits));
    }
}
