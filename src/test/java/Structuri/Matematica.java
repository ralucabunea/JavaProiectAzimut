package Structuri;

import org.junit.Test;

import java.time.temporal.TemporalUnit;

public class Matematica
{
    //17.05.2022 STRUCTURI ALTERNATIVE SI REPETITIVE
    //Structuri= alternative si repetitive
    //Structuri alternative= 1) IF...THEN...ELSE si SWITCH...CASE 1,2...
    //dupa THEN deschizi paranteze patrate neaparat CU SYSTEM OUT PRINTLN

    @Test
    public void MatematicaTest(){
        numarMaiMareCa20();
        numarPar();
        numarMaiMareCaUnNumar(68, 18);
        numarMaiMareCaUnNumar(5, 10);
        verificParitateNumar( 21);
        verificParitateNumar(64);
        verificNumarImparDivizibil(5);
        verificNumarImparDivizibil(10);
        verificNumarImparDivizibil(14);
        verificNumarImparDivizibil(9);
        printeazaZi("Duminica");
        printeazaZi( "Luni");
        printeazaZi("Marti");
    }

    //verific paritate nr scrii dircet in paranteze rotunde nr de la tine impar sau par si pare direct number scris
    //verific paritate nr scrii sus sub test dupa ce ai scris jos

    //Verificam daca un numar este mai mare ca 20.
    public void numarMaiMareCa20() {

       if (38>20) {
           System.out.println("Numarul 38 este mai mare ca 20");
       }
       else {
           System.out.println("Numarul 38 este mai mic decat 20");
       }
    }

    //copiat inca o data ex de mai sus cu parametrii pentru a fi la general , parametrii se scriu intre parantezele rotunde
    // 38 fiind nr intreg scrii Integer sa cuprinda toate nr mai mari ca 20
    // ca al treilea pas mergi sus la TEST si adaugi nr mai amre ca un nr , apare automat iar intre paranteze rotunde pui tu nr mai mari si mai mici ca 20

    public void numarMaiMareCaUnNumar(Integer Numar, Integer Comparatie) {

        if (Numar>Comparatie) {
            System.out.println("Numarul "+ Numar + " este mai mare ca " + Comparatie);
        }
        else {
            System.out.println("Numarul " + Numar + " este mai mic ca " + Comparatie);
        }
    }


    //Verificam daca un numar este par
    // "/" este folosit in programare pentru a reprenta impartirea sau cu "%" cand restul este egal cu zero

    public void numarPar(){
        if (8%2==0){
            System.out.println("Numarul este par");
        }
        else {
            System.out.println("Numarul este impar");
        }
    }

    public void verificParitateNumar(Integer Number){
        if (Number%2==0){
            System.out.println(Number + " este par ");
        }
        else {
            System.out.println(Number + " este impar ");
        }
    }



    //Verific daca un numar este impar si divizibil cu 5
    public void verificNumarImparDivizibil(Integer Numar){
        if (Numar%2==1){
            if (Numar%5==0){
            System.out.println(Numar+ " este impar si divizibil cu 5");
            }
            else{
                System.out.println(Numar+ " este impar dar nu este divizibil cu 5");
            }
        }
        else{
            if (Numar%5==1){
                    System.out.println(Numar+ " este par si divizibil cu 5");
                }
                else{
                    System.out.println(Numar+ " este par dar nu este divizibil cu 5");
                }

        }
        }


        //Switch case cealalta structura alternativa pe zilele saptamanii

    public void printeazaZi(String ZiCurenta){
        switch (ZiCurenta){
            case "Duminica":
                System.out.println( " Astazi este Duminica");
                break;
            case "Luni":
                System.out.println( " Astazi este Luni");
                break;
            case "Marti":
                System.out.println( " Astazi este Marti");
                break;

                //URMEAZA TEMA A SI B DE REZOLVAT










        }
    }
}
