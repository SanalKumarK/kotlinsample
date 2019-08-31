package test;

import jdk.nashorn.internal.runtime.regexp.joni.encoding.CharacterType;

/**
 * Created by Sanal on 2/15/2019.
 */
public class TestJava {
    public static void main(String[] args) {
        //System.out.println(KotlinJavaKt.getBhajan());
        System.out.println(solution("abcd"));
        System.out.println(solution("6abcd"));
        System.out.println(solution("Abcd"));
        System.out.println(solution("?bcd"));
        System.out.println(solution("0bcd"));
        System.out.println(solution("$bcd"));
        System.out.println(solution(""));
        System.out.println(solution(null));
    }

    public static String solution ( String str) {
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
}