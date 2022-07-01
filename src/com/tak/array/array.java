package com.tak.array;

import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        /*
        * 입력한 N의 길이를 입력받아 String형 sNum에 저장하기
        *
        * 입력받은 sNum을 다시 char[]형 변수 cNum에 변환하여 저장하기
        * int형 변수 sum 선언하기
        *
        * for(cNum의 길이만큼 반복하기)
        * {
        *   배열의 각 자릿값을 정수형으로 변환하여 sum에 더하여 누적하기
        * }
        * sum 출력
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("개수를 입력해주세요 : ");
        int N = sc.nextInt();

        /* 입력값을 String형 변수 sNum에 저장한 후 char[]형 변수로 변환하기 */
        System.out.print("원하는 숫자를 입력해주세요 : ");
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;

        for (int i = 0; i < cNum.length; i++) {
            sum += cNum[i] - '0';
        }
        System.out.print("모든 숫자의 합 : " + sum);
    }
}
