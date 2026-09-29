package com.korai.study.ch02;

public class FunctionMain {

    public static void main(String[] args) {

        // 반복적인 작업을 다시 사용할 수 있도록 정의(도구를 만드는 것) - 함수
        // java의 함수는 class 안에 다 정의 되어야 한다.(함수 안에 만들수는 없다(main도 함수))
        // class 밖에 정의된건 함수 class 안에 정의된 것은 method
        /*  1. 재사용성
            2. 정리
         */

        String date = "2026-09-23";
        String name = "김준일";
        String content = "자바 수업 진행하기";
        System.out.println("업무일지[" + date + "]");
        System.out.println("이름: " + name);
        System.out.println("내용: " + content);
        System.out.println();

        date = "2026-09-24";
        name = "김준일";
        content = "git 수업 진행하기";
        System.out.println("업무일지[" + date + "]");  // 위와 코드가 완전히 같다. 이때 함수 사용
        System.out.println("이름: " + name);
        System.out.println("내용: " + content);
        System.out.println();

        class 업무일지기능{  //기능과 정의가 필요하다.
            String date;
            String name;
            String content;

            void 업무일지출력() {   // 함수를 정의한것, 함수는 함수안의 class의 변수만 사용가능
                System.out.println("업무일지[" + date + "]");  // 위와 코드가 완전히 같다. 이때 함수 사용
                System.out.println("이름: " + name);      // 반복하고 싶은 동작 기록
                System.out.println("내용: " + content);
                System.out.println();
            }
        }

        업무일지기능 f1 = new 업무일지기능();
        f1.date = " 2026-09-25";
        f1.name = "김준삼";
        f1.content = "함수 수업하기";
        f1.업무일지출력(); //함수명() -> 함수호출 (f1 기능을 호출후 함수를 호출)

        업무일지기능 f2 = new 업무일지기능();
        f2.date = " 2026-09-26";
        f2.name = "김준사";
        f2.content = "자료형 수업하기";
        f2.업무일지출력();

        class 업무일지기능2{
            void 업무일지출력(String date, String name, String content) { //() 이 안 - 매개변수

            // (함수뒤에 괄호안) 쓸때만 쓰고 바로 초기화 외부에서 변수를 전달받음
                System.out.println("업무일지[" + date + "]");  //void - 없다, 공허하다 함수 실행후 되돌릴값이 없다.(return이 없다) 실행이 끝.
                System.out.println("이름: " + name);
                System.out.println("내용: " + content);
                System.out.println();
            }
            //"2026-09-23" -> 2026년 09월 23일
           String 날짜표기변환(String date){
                String[] splitDate = date.split("-");
                // String 자리에는 자료형으로 할수있다
                String year = splitDate[0];
                String month = splitDate[1];
                String day = splitDate[2];

                return year + "년" + month + "월" + day + "일";//String이니깐 return값은 문자열
            }
        }
        업무일지기능2 f3 = new 업무일지기능2();
        f3.업무일지출력("2026-09-27", "박관우", "변수 수업하기"); // 인수 인자(()안은 값이다 변수x)
        f3.업무일지출력("2026-09-28", "박관우", "상수 수업하기"); // 파라메타라고 부름,
        f3.업무일지출력(f3.날짜표기변환("2026-09-28"), "박관우", "상수 수업하기");


    }
}
