package com.korai.study.ch05.practice;

public class Practice02_01 {
    public static void main(String[] args) {
        /*
         * 구구단
         * [ 2단 ]
         * 2 x 1 = 2  \t  2 x 2 = 4 \n or println
         * 2 x 3 = 6  \t  2 x 4 = 8
         */
        int a = 2;
        for (int i = 0; i < 8; i++) {
            a = i + 2;
            System.out.println();
            System.out.println("[ " + a + "단 ]");
            for (int j = 0; j < 9; j++) {
                int b = j + 1;
                if (b % 2 == 0) {
                    System.out.println(a + " x " + b + " = " + (a * b));
                } else if (b % 2 == 1) {
                    System.out.print(a + " x " + b + " = " + (a * b) + "    ");
                }
            }
        }
    }}
      /*  int[][][] gugudanArray = new int[8][9][3];
        for(int i = 0; i < gugudanArray.length; i++){
            int dan = i + 2;
            for(int j = 0; j < gugudanArray[i].length; j++) {
                int num = j + 1;
                int result = dan * num;
                gugudanArray[i][j][0] = dan;
                gugudanArray[i][j][1] = num;
                gugudanArray[i][j][2] = result;
            }
        }
        String gugudanString = "";
        for(int i = 0; i < gugudanArray.length; i++){
            for(int j = 0; j < gugudanArray[i].length; j++){
                    gugudanString
                        += String.format(
                            "%d x %d = %d%s",
                            gugudanArray[i][j][0],
                            gugudanArray[i][j][1],
                            gugudanArray[i][j][2],
                            gugudanArray[i][j][1] % 2 == 0 || gugudanArray[i][j][1] == 9 ? "\n" : "\t");
                System.out.println(gugudanString);
                }
            }
        }
    }

/*
    String gu = "";

    for(int i = 0; i < 8; i++){ // 8번반복 (2 ~9단)
    int dan = i + 2;            // 2단에서 출력  0시작 + 2
    String danText = "[ " + dan + "단 ]\n"; // n단 문자열 생성
    gu += danText;
    for(int j = 0; j < 9; j++){             // 9번 반복
    int num = j + 1;                        // 1 * 단수 이라  1 +
    String guText = dan + " x " + num + " = " + (dan * num);    // 결과
    String lastLetter = num % 2 == 0 || num == 9 ? "\n" : "\t"; // 결과 시 2곱하고 줄바꿈 9 뒤에 탭
    gu += guText + lastLetter;
    }
    }
    system.out.println(gu);
 */
