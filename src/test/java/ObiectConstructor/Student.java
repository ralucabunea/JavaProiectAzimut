package ObiectConstructor;

import java.util.List;

public class Student {

    public String Nume;
    public String Prenume;
    public Integer Varsta;
    public Double Inaltime;
    public Character Sex;
    public Boolean AreBursa;

    //alegem array sau list=multimi

    public List<Integer> NoteMatematica;
    public List<Integer> NoteRomana;

    public List<Integer> NoteMaghiara;


    //obiect=instanta unei clase ="student", studentul e un obiect care are proprietati
    //ex: stundent poate fi un coleg care are note matematica:9/8 si alt student care are 4/5 la note
    //Obiect= instanta unei clase
    //Constructor= are ca rol sa initializeze variabilele unei clase
    //Tipuri constructor= cu parametri si fara parametri
    //By default avem un constructor fara parametri in orice clasa , asa are programul java automat
    //Intr-o clasa putem aveam n constructori
    //Structura constructor: public cu numele clasei (are sau nu parametri), asa il recunosti , la noi =student
    //NU exista constructor cu "return"
    //constructorii sunt mai sus scrisi "public string nume.pulic string prenume"= 8 constructori

    public Student(String Nume, String Prenume, Integer Varsta, Double Inaltime, Character Sex, Boolean AreBursa, List<Integer> NoteMatematica, List<Integer> NoteRomana) {

        //le-am scris inca o data pe cele de mai sus la fel, dar mai usor era sa fie scris cu N mic daca la primul e cu N mare
        //sau adaugi un THIS ca sa stie care este dintre public string si public student fiindca apare de 2 x
        //mai jos le-am scris pe cele de la public class cu this in fata si = cu cele de la public student

        this.Nume = Nume;
        this.Prenume = Prenume;
        this.Varsta = Varsta;
        this.Inaltime = Inaltime;
        this.Sex = Sex;
        this.AreBursa = AreBursa;
        this.NoteMatematica = NoteMatematica;
        this.NoteRomana = NoteRomana;

    }

    //Facem un alt constructor doar cu note Matematica( click dreapta-generate-constructor- tinut apasat ctrl si alegi cu click pe care le vrei

    public Student(String nume, String prenume, Integer varsta, Double inaltime, Character sex, Boolean areBursa, List<Integer> noteMatematica) {
        Nume = nume;
        Prenume = prenume;
        Varsta = varsta;
        Inaltime = inaltime;
        Sex = sex;
        AreBursa = areBursa;
        NoteMatematica = noteMatematica;
    }
    // al treilea constrcutor

    public Student(String nume, String prenume, Integer varsta, Double inaltime, Character sex, Boolean areBursa, List<Integer> noteMatematica, List<Integer> noteRomana, List<Integer> noteMaghiara) {
        Nume = nume;
        Prenume = prenume;
        Varsta = varsta;
        Inaltime = inaltime;
        Sex = sex;
        AreBursa = areBursa;
        NoteMatematica = noteMatematica;
        NoteRomana = noteRomana;
        NoteMaghiara = noteMaghiara;
    }

    public void InfoStudent() {
        System.out.println(" Numele studentului este " + Nume);
        System.out.println(" Prenumele studentului este " + Prenume);
        System.out.println(" Varsta studentului este " + Varsta);
        System.out.println(" Inaltimea studentului este " + Inaltime);
        System.out.println(" Sexul studentului este " + Sex);
        System.out.println(" Are studentul bursa? " + AreBursa);
    }

    public void InfoNote(String Materie) {
        if (Materie.equals("romana") || Materie.equals("Romana")) {
            System.out.println("Notele studentului la romana sunt urmatoarele:");
            //||inseamna "sau "
            for (Integer index = 0; index < NoteRomana.size(); index++) {
                System.out.println(NoteRomana.get(index));

            }
        }

        if (Materie.equals("matematica") || Materie.equals("Matematica")) {
            System.out.println("Notele studentului la matematica sunt urmatoarele:");

            for (Integer index = 0; index < NoteMatematica.size(); index++) {
                System.out.println(NoteMatematica.get(index));

            }
        }

        if (Materie.equals("maghiara") || Materie.equals("Maghiara")) {
            System.out.println("Notele studentului la maghiara sunt urmatoarele:");

            for (Integer index = 0; index < NoteMaghiara.size(); index++) {
                System.out.println(NoteMaghiara.get(index));

            }
        }

    }

    public void CalculMedie(String Materie) {
        if (Materie.equals("matematica") || Materie.equals("Matematica")) {
            System.out.println("Media studentului la matematica este:");
            float suma = 0;
            Integer nrElemente = NoteMatematica.size();

            for (Integer index = 0; index < NoteMatematica.size(); index++) {
                suma = suma + NoteMatematica.get(index);
            }
            double Medie= suma/nrElemente;
            System.out.println(Medie);
        }



    }





}