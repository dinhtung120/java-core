package service;

import model.Newspaper;

import java.time.LocalDate;
import java.util.ArrayList;

public class NewspaperService {
    public ArrayList<Newspaper> getNewspaper(){
        ArrayList<Newspaper> newspapers = new ArrayList<>();

        newspapers.add(new Newspaper(2,"Báo",new String[]{"Tin tức"},
                "Thanh niên", LocalDate.of(2000,10,10),
                100,30));

        return newspapers;
    }
}
