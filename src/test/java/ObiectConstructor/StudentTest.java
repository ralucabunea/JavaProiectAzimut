package ObiectConstructor;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

    //Obiect= instanta unei clase
    //Obiectul este strict legat de constructor
    //Dintr-o clasa putem declara N obiecte
    //Obiectele se diferentiaza pe baza numelui
    //Structura obiect: nume clasa + nume obiect = new nume clasa (valori parametri)
    //Recunoastem un obiect dupa cuvantul NEW

    @Test
    public void MetodaTest() {
        //primul obiect

        List<Integer> NoteRomanaRaluca = new ArrayList<>();
        NoteRomanaRaluca.add(10);
        NoteRomanaRaluca.add(9);
        NoteRomanaRaluca.add(8);
        List<Integer> NoteMatematicaRaluca = new ArrayList<>();
        NoteMatematicaRaluca.add(7);
        NoteMatematicaRaluca.add(9);
        NoteMatematicaRaluca.add(8);
        NoteMatematicaRaluca.add(6);

        Student BuneaRaluca = new Student("Bunea", "Raluca", 25, 1.70, 'F', true, NoteMatematicaRaluca, NoteRomanaRaluca);
        BuneaRaluca.InfoStudent();
        BuneaRaluca.InfoNote("romana");
        BuneaRaluca.InfoNote("matematica");
        BuneaRaluca.Prenume = "Cristina";
        BuneaRaluca.InfoStudent();


        //ex al doilea obiect

        List<Integer> NoteRomanaAlex = new ArrayList<>();
        NoteRomanaAlex.add(5);
        NoteRomanaAlex.add(5);
        NoteRomanaAlex.add(5);
        List<Integer> NoteMatematicaAlex = new ArrayList<>();
        NoteMatematicaAlex.add(6);
        NoteMatematicaAlex.add(6);
        NoteMatematicaAlex.add(6);
        NoteMatematicaAlex.add(9);

        Student DorhaAlex = new Student("Dorha", "Alex", 27, 1.80, 'M',
                false, NoteMatematicaAlex, NoteRomanaAlex);
        DorhaAlex.InfoStudent();
        DorhaAlex.InfoNote("romana");
        DorhaAlex.InfoNote("matematica");

        //Declaram un obiect pt al doilea constructor

        List<Integer> NoteMatematicaClaudiu = new ArrayList<>();
        NoteMatematicaClaudiu.add(6);
        NoteMatematicaClaudiu.add(6);
        NoteMatematicaClaudiu.add(6);
        NoteMatematicaClaudiu.add(9);

        Student PopClaudiu = new Student("Pop", "Claudiu", 27, 1.80, 'M',
                false, NoteMatematicaAlex);
        PopClaudiu.InfoStudent();
        PopClaudiu.InfoNote("Matematica");

        //Declaram un obiect pt al treilea constructor

        List<Integer> NoteMaghiaraCristina = new ArrayList<>();
        NoteMaghiaraCristina.add(6);
        NoteMaghiaraCristina.add(6);
        NoteMaghiaraCristina.add(6);
        NoteMaghiaraCristina.add(9);

        List<Integer> NoteRomanaCristina = new ArrayList<>();
        NoteRomanaCristina.add(5);
        NoteRomanaCristina.add(5);
        NoteRomanaCristina.add(5);

        List<Integer> NoteMatematicaCristina = new ArrayList<>();
        NoteMatematicaCristina.add(6);
        NoteMatematicaCristina.add(6);
        NoteMatematicaCristina.add(6);
        NoteMatematicaCristina.add(9);

        Student CristinaIonescu = new Student("Ionescu", "Cristina", 25, 1.70, 'F',
                true, NoteMatematicaCristina, NoteRomanaCristina, NoteMaghiaraCristina);
        CristinaIonescu.InfoStudent();
        CristinaIonescu.InfoNote("Maghiara");
        CristinaIonescu.CalculMedie("Matematica");



    }
}