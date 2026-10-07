package com.korai.study.ch10.TODO.entity;

public enum TodoStatus {                            // 열거형 LIST 느낌 문자형, 미리정해진 값을 넣을때 사용
    todo("진행전"), inProgress("진행중"), done("완료");

    private String status;

    TodoStatus(String status){
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {      // 진행전 중 완료로 뜸 tosTring으로 인해
        return status;
    }
}
