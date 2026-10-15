package com.korai.study.ch12;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

class 내가만든예외 extends RuntimeException{  //예외 클래스를 만들수있다.

    public 내가만든예외(String message) {     //이게없으면 밑에서 메세지가 안나옴 에러
        super(message);
    }
}

public class CollectionMain04 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        nums.add(500);
        print(nums);
       try {
           print(nums, nums.size() + 2);        // size가 잘못된거니깐 호출위치에서 터짐
           // print(null<- 이자리에 nums, null
       } catch (IndexOutOfBoundsException e){               //Exception 모든예외 처리가능함
           System.out.println("인덱스초과오류");
       }catch (NullPointerException e){                    //Exception 모든예외 처리가능함
           System.out.println("null처리됨");           //여러개의 catch 약간 if/else 느낌
       }catch (Exception e){                           //Exception 모든예외 처리가능함
           System.out.println("예외처리됨");
           System.out.println(e.getMessage());
       }
//        try{            //try안에는 오류날수있는 거
//            print(nums);
//        }catch (IndexOutOfBoundsException e){      //  ()안에 클래스명(자료형) 매개변수
//            System.out.println("여기?");
//            e.printStackTrace();            //printStackTrace 오류난건 뒤에 표시
//        }           //Exception 은 예외
        System.out.println("프로그램정상 종료");

    }
    static void print(ArrayList<Integer> arr){
        for (int i = 0; i < arr.size() + 1; i++){
           try{ System.out.println(arr.get(i));}        // 이부분이 예외처리되니깐 여기만 해도됨
           catch (IndexOutOfBoundsException e){         //이게 디테일한거
               e.printStackTrace();
           }
        }
        System.out.println();
    }

    static void print(ArrayList<Integer> arr,int size) throws IndexOutOfBoundsException{
        System.out.println("리스트크기" + arr.size());
        // throws IndexOutOfBoundsException 이 예외는 무조건 하나있어야한다.(여러개가능)
        if(size == 7){
            throw new 내가만든예외("내가 강제로 호출 예외");     //catch에다 던진다 e변수에다가
            //오류처리를 위해 던진곳으로 오류다 가라 라고 할떄 사용한다 한번에 처리 throw한개만
        }
        for (int i = 0; i < size; i++){                 //throws 예외처리가 필요하다
            System.out.println(arr.get(i));
        }//IndexOutOfBoundsException 안쓰고 Exception만하면 예외처리 강제화시키는 코드
        //IndexOutOfBoundsException 체크안해도(런타임 - 언체크드) 실행은됨 예외는 터짐
        System.out.println();
    } //throws Exception 예외를해라 (throws 는 예외터질수있다) 얘기해주는거 호출자리가서 예외처리해라
    //Exception 하위로 체크가있고(강제로 체크해야한다) 언체크가있다. 언체크는 강제성(해도되고안해도되고)이 없다
        //RuntimeException(실행중 예외)을 받는애들은 전부 unCheckedException
        //이외는 전부 CheckedException(실행전에 체크 (예>프로그램유무라든지))
    //error는 실행전보다 전 오타, 메모리부족 등
    //Exception은 체크드다 하위에 체크,언체크 다있어서 체크드다 런타임안받으면 다 체크
}
