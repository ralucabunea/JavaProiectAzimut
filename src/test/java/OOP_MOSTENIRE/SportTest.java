package OOP_MOSTENIRE;

import org.junit.Test;

import java.util.List;
import java.util.ArrayList;

public class SportTest {
    @Test
    public void mostenireTest(){
        //facem primul obiect (copil) pt fotbal
        List<String> reguliFotbal = new ArrayList<>();
        reguliFotbal.add(" Nu ai voie sa atingi mingea cu mana");
        reguliFotbal.add(" Nu ai voie sa faci fault");
        reguliFotbal.add("Nu ai voie sa iti dau tricoul jos");

        FOTBAL fotbalSport = new FOTBAL("Fotbal", "Sport de echipa", true, 11,
                true, 3, reguliFotbal);
        fotbalSport.InfoFotbal();
        fotbalSport.InfoSport();

    }
}
