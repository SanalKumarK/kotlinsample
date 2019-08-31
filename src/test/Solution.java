package test;

/**
 * Created by Sanal on 3/22/2019.
 */
public class Solution {
    public String solution ( String str) {
        if(str == null || str.isEmpty()) {
            return "other";
        }
        int type = Character.getType(str.charAt(0));
        if(type == Character.UPPERCASE_LETTER) {
            return "upper";
        }
        else if(type == Character.LOWERCASE_LETTER) {
            return "lower";
        }
        else if(type == Character.DECIMAL_DIGIT_NUMBER) {
            return "digit";
        }
        else {
            return "other";
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution("abcd"));
        System.out.println(new Solution().solution("6abcd"));
        System.out.println(new Solution().solution("Abcd"));
        System.out.println(new Solution().solution("?bcd"));
        System.out.println(new Solution().solution("0bcd"));
        System.out.println(new Solution().solution("$bcd"));
        System.out.println(new Solution().solution(""));
        System.out.println(new Solution().solution(null));
    }
}
