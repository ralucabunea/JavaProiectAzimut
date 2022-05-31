package Structuri;

import org.junit.Test;

public class Algebra {

    //STRUCTURA REPETITIVA CU "FOR"


    @Test
    public void AlgebraTest(){
        PrinteazaNumere();
        PrinteazaNumereWhile();
        PrinteazaPar(100);
    }

    //Printam primele 50 de numere

    //[ 0,...,50] mereu in programare se porneste de la zero; FOR( INTEGER INDEX=0; INDEX X<51 pt ca iti va testa si 50 dupa care index + +
    //dupa ce scri for Integer index=0....pui system out println dupa care sus la @ Test scrii de la public void ce nume ai dat
    //FOR are nr finit
    //WHILE are nr infinit de pasi iar daca nu pui la structura de while la final dupa system out println se duce cu cifra 0 la infinit
    //depinde de caz ce folosesti, ex daca iti zice ca pe site ul x merge dupa 5 secunde un click, folosesti FOR, daca e vorba de ceva infinit, o conexiune 3G  folosesti WHILE

    public void PrinteazaNumere(){
        for (Integer index=0; index<51; index++){
            System.out.println(index);
        }

    }

    //STRUCTURA REPETITIVA CU "WHILE"

    public void PrinteazaNumereWhile(){
        Integer index=0;
        while (index<51){
            System.out.println(index);
            index++;
        }
    }

    //Printam numerele pare de la 0 pana la un numar
    public void PrinteazaPar(Integer capat){
        for (Integer index=0; index<capat; index++){
            if (index%2==0){
                System.out.println(index);
            }
        }
    }
    //am folosit si IF din metodele anterioare pentru ca in cerinta era cerere de nr pare
    //% se foloseste la rest
    // / se foloseste la cat
}
