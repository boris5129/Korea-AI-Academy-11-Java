package com.korai.study.ch12;

/*
 * Collection(컬렉션)
 * 여러개의 데이터를 한번에 관리하는 방법
 * 데이터의 중복을 허용하지 않아야 한다.
 * 1. 배열 (크기(index)고정 - list와 다른점, 구조는같다(Arraylist)
 * 2. 리스트 - ArrayList(크기 자유 - 배열과 다른점), LinkedList (구조다름) - 데이터 중복가능 순서가 있음
 * 3. 세트 - HashSet - 순서X (비유 주머니에 구슬 - 중복 제거용) 중복X
 * 4. 맵 - HashMap - 순서X (중복 허용 - key값을 붙여 허용(원하는 keyword로 허용)), key 와 value가 동일한 값은 허용X)
 *                          //key는 중복X value는 허용
 */

import java.util.ArrayList;
import java.util.List;

public class CollectionMain01 {
    public static void main(String[] args) {
        ArrayList <String> strings = new ArrayList();
        strings.add("자바");
        strings.add("파이썬");
        StringArrayList strList = new StringArrayList();
        strList.add("자바");
        strList.add("파이썬");

        System.out.println(strings);
        System.out.println(strList);

        System.out.println(strings.get(0));
        System.out.println(strings.get(1));

        strings.set(1, "자바스크립트");       //set 바꾸는거
        System.out.println(strings);

        strList.set(1, "자바스크립트");
        System.out.println(strings);

        String removeValure = strings.remove(0);
        System.out.println(removeValure);
        System.out.println(strings);

        String removeValure2 = strList.remove(0);
        System.out.println(removeValure2);
        System.out.println(strList);
    }
}

class StringArrayList{
    private String[] list;

    public StringArrayList(){
        list = new String[0];
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < list.length; i++){
            builder.append(list[i]);
            if(list.length - 1 != i){
                builder.append(", ");
            }

        }
        builder.append("]");
        return builder.toString();
    }

    public void add(String str){                    //한칸늘리고 옮겨닮기
        String[] newArray = new String[list.length+1];
        for(int i=0;i<list.length;i++){
            newArray[i] = list[i];
        }
        newArray[newArray.length - 1] = str;
        list = newArray;
    }

    public String get(int index) {
        return list[index];
    }

    public void set(int i, String a){
        list[i] = a;
    }

    public String remove(int index){
        String[] newArray = new String[list.length - 1 ];  //배열을 만들고
        String removedValue = list[index];                 //리스트의 index번을 remove에 대입
        for (int i = 0; i < newArray.length; i++){             //새로운리스트만큼반복문돌려서
            if(i < index){                                     //index보다 반복이 적으면 newArray의 i번쨰는 list[i]를 넣고
                newArray[i] = list[i];
            }else {                                        //같거나 커지면 (즉 같아지면) list i번쨰 (즉 같은시점 i가 사라짐)
                newArray[i] = list[i + 1];                  // 이후는 index번호가 한칸씩 앞으로 온다.
            }
        }
        list = newArray;        // list에 줄어든 newArray를 담는다
        return removedValue;   //바뀐 리스트i를 리턴 뺸거 확인
    }



}
