package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {

    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("==단어 입력==");
        while (true) {
            System.out.print("영어 단어를 입력 (종료 - 'q'): ");
            String englishWord = sc.nextLine();

            if (englishWord.equals("q")) {
                break;
            }

            System.out.print("한글 뜻을 입력: ");
            String koreanMeaning = sc.nextLine();

            if (englishWord.equals("q")) {
                break;
            }

            dictionary.put(englishWord, koreanMeaning);
        }

        System.out.println("==단어 검색==");
        while (true) {
            System.out.print("찾을 영어 단어 입력 (종료 - 'q'): ");
            String searchWord = sc.nextLine();

            if (searchWord.equals("q")) {
                System.out.println("사전 종료");
                break;
            }

            if (dictionary.containsKey(searchWord)) {
                String answerWord = dictionary.get(searchWord);
                System.out.println(searchWord + "의 뜻: " + answerWord);
            } else {
                System.out.println(searchWord + "은(는) 사전에 없는 단어입니다.");
            }
        }
    }
}
