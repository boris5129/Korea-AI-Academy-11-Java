package com.korai.study.ch12;

import lombok.AllArgsConstructor;

public class CollectionMain02 {
    public static void main(String[] args) {
        CustomLinkedList<String> list1 = new CustomLinkedList<>();
        list1.add("자바1");
        list1.add("자바2");
        list1.add("자바3");
        System.out.println(list1);
        System.out.println(list1.get(1));  //LinkedList의 2번쨰 칸 1번인덱스를 가져와라
        list1.remove(1);
    }
}

// LinkedList - > 선형리스트 (선으로 연결된 단방향),
// 위 연결은 노드를 연결한다. 노드한테 다음노드객체의 주소값을 가지고있다.
// 노드란? 연결된 다른 노드들의 주소와 저장할 값을 포함한 것. 노드시작을 헤드, 노드의 끝을 테일
class CustomLinkedList<E> {
    @AllArgsConstructor
    private static class Node<E> {          //외부로 가져가면안되고 생성없이써 야함.
        E item;  //데이터 저장하는곳
        Node<E> next;       //다음노드 주소가지고있음
    }

    private Node<E> head;
    private Node<E> tail;
    private int size;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        Node<E> current = head;
        for (int i = 0; i < size; i++){         //사이즈가 0이면 반복안돌고 head도 null
            builder.append(current.item);       //여기서 item이 현재노드가 가진 값
            if(i != size - 1){
            builder.append(",");
        }
            current = current.next;             // current.next여기가 다음의 주소
        }
        builder.append("]");
        return builder.toString();
    }

    public void add(E e){           //E 는 제네릭 원하는 자료형 위에서 String 여기는 String
        Node<E> newNode = new Node<>(e, null); // newNode의 변수를 만들어서 쉽게
        if(head == null){          //처음 헤드에 다음 노드정보가 없으니깐 1개일때
            head =  newNode;//다음이 null이면 끝
            tail = head;  //제일앞이면서 끝이다 새로만든 1개니깐
        }else {
            tail.next = newNode;    //밑에꺼 줄인거
            tail = newNode;                           //기존 테일을 넥스트로 바꿔야 테일이된다.
//            Node<E> current = head; //처음값은 헤드
//            while (true){
//                if (current.next == null){
//                    current.next = new Node<>(e, null);     //current 다음에 노드를넣고 다음은 널이되서 얘기 tail
//                    break;                        //끝에 넥스트 넣고 널이네?
//                }
//
//            }
//            head.next = new Node<>(e, null);
//            tail = head.next;               //꼬리안에 헤드다음의 주소

        }
        size++;  //넣고 길이를 늘려라
    }

    public E get(int index){
        Node<E> node = head;            //head가 0 시작이라 head
        if(!(index < size && index > -1)){
            throw new IndexOutOfBoundsException("범위초과");      //index가 범위를 벗었났다 예외처리
        }
        for(int i = 0; i < index; i++){
            node = node.next;
        }return node.item;
    }

    public void remove(int index){
        Node<E> node = head;        //node는 주소지
        if(!(index < size && index > -1)){
            throw new IndexOutOfBoundsException("범위초과");
        }for(int i = 0 ; i < index - 1 ; i++){
            node = node.next;       //현재 주소지에 다음주소지를 대입
        }
        node.next = node.next.next;
        size--;
    }



}
