/**
 *
 */
package Lab2;

import java.util.ArrayList;

public class Chapter {
    private String name;
    private ArrayList<lab2.SubChapter> subChapters=new ArrayList<>();

    public Chapter(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println(name);
        for(lab2.SubChapter el:subChapters)
            el.print();
    }

    public int createSubChapter(String s)
    {
        subChapters.add(new lab2.SubChapter(s));
        return subChapters.size()-1;
    }

    public lab2.SubChapter getSubChapter(int i)
    {
        return subChapters.get(i);
    }
}
