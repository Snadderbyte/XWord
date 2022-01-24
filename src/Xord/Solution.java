package Xord;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<String> list;

    public Solution() {
        this.list = new ArrayList<String>();
    }

    public List<String> getList(){
        return list;
    }

    public void add(String s) {
        this.list.add(s);
    }

    public String getElement(int index){
        return this.list.get(index);
    }

}
