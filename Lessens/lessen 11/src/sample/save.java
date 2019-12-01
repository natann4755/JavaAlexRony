package sample;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class save {
    private static save sav = new save();
    private static String pate = "saveTheList.txt";
    private List<task> listt;

    private save (){
    }

    public static save getSav() {
        return sav;
    }

    public List<task> getListt() {
        return listt;
    }

    public void setListt(List<task> listt) {
        this.listt = listt;
    }

    public void saveList() throws IOException {
        Path p = Paths.get(pate);
        BufferedWriter b = Files.newBufferedWriter(p);

        Iterator <task> iterator = listt.listIterator();
        while (iterator.hasNext()){
            task t = iterator.next();
            b.write(t.getShortTask()+"t");
            b.newLine();
        }
        b.close();
    }
}
