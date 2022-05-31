package VariableMethod;

import org.junit.Test;

public class Cursant {

    //acesta e un comentariu
    /*acesta este un alt fel de comentariu*/
    //class= o colectie de variabile si metode
    //intr-un fisier java putem avea mai multe clase
    //recunoastem o clasa dupa cuvantul cheie "class"
    //structura clasa= public class NUME {}
    //orice structura invatam trebuie scrisa in interiorul unei clase (java)
    //variabila= atributul, proprietatea unei clase
    //o clasa poate avea N variabile/deloc
    //tipuri variabile= globala si locala
    //o variabila trebuie sau nu sa primeasca o valoare
    //structura variabila globala= PUBLIC TIP VARIABILE NUME VARIABILA
    //dam o valoare unei variabile cu "="
    public String Nume;
    public String Prenume;
    public Integer Varsta;
    public String Ocupatie;
    public Character Sex;
    public Double Inaltime;
    public Boolean esteAngajat;
    //metoda= actiunea unei clase
    //o clasa poate sa contina sau nu N metode
    //tipuri metode= void si return
    //structura metoda void= PUBLIC VOID NUME METODA (){}
    //metodele pot sau nu sa contina parametrii

    @Test
    public void AtribuireVariabile(){
        //dam valori pentru variabilele de mai sus
        Nume="bunea";
        Prenume="raluca";
        Varsta=25;
        Ocupatie="ocupatie";
        Sex='F';
        Inaltime=1.70;
        esteAngajat=true;

        //printam o valoare in consola
        System.out.print(Nume);
        System.out.print(' ');
        System.out.print(Prenume);
        System.out.print(' ');
        System.out.print(Varsta);
        System.out.print(' ');
        System.out.print(Sex);
        System.out.print(' ');
        System.out.print(Inaltime);
        System.out.print(' ');
        System.out.println(esteAngajat);
        //print vs println
        //print= printeaza si ramane pe randul curent
        //println= printeaza si sare la randul urmator
        printeazaNota();
        promovareCurs();

        System.out.println(getSalarV1());
        System.out.println(getSalarV2());

    }
    //variabila locala= tip variabila + nume
    public void printeazaNota(){
        Integer notamanual = 10;
        Integer notaautomation = 10;
        System.out.println("Cursanta Raluca a luat notele:" +notamanual+ "," +notaautomation);
    }

    public void promovareCurs(){
        Boolean promovare =true;
        System.out.println("A promovat cursantul:" +Nume+ " " +Prenume+ "? ");
        System.out.println(promovare);

    }

    //12.05.2022

    //Metoda return=  exprimare care contine "returneaza", doar tu vezi info si decizi ce faci cu ele , ex salariul tau
    //Structura metoda return= public + "tip de data"+Nume"(){}
    //Exista o conventie in JAVA ca metodele cu return sa aiba in fata "get"
    //Returnam salariul dorit

    public  Integer getSalarV1(){
        Integer salariu= 10000;
        return salariu;
    }

    public  Integer getSalarV2(){
        Integer salariu= 5000;
        return salariu;

    }

}
