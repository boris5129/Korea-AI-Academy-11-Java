package com.korai.study.ch11;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

public class MemoMain {
    public static void main(String[] args) {

    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Memo {
    private int id;
    private String text;
}

interface view{
    void show();
}

class MemoRepository implements view {
    private int lastId;
    private List<Memo> memos;
    private static MemoRepository instance;
    private MemoRepository(){
        lastId = 1;
    }
    public static MemoRepository getInstance(){
        if (instance == null){
            instance = new MemoRepository();
        }return instance;
    }

    public void insert(Memo word){
        word.setId(lastId++);
        memos.add(word);
    }
    public Memo findByMemo(int id){
        for (int i = 0 ; i < memos.size(); i++){
            if(memos.get(i).getId() == id){
                return memos.get(i);
            }
        }return null;
    }

    public List<Memo> findAll(){
        return List.copyOf(memos);
    }



    @Override
    public void show() {

    }
}