package OOP_INTERFETE;

public interface Angajat {
    //am crat o noua clasa cu class interface
    //interfata contine doar metode abstracte(se defineste tipul metodei fara sa contina body)
    //interfata se recunoaste dupa cuv "interface"
    //poate sa contina variabile sau nu
    //interfata nu se mosteneste , se implementeaza
    //clasa care implementeaza interfata trb sa impl toate metodele interfetei
    //o clasa poate sa implementeze mai multe interfete
    //o clasa abstracta poate sa implementeze o interfata
    //o interfata nu contine un constructor ->nu putem declara obiecte

    //avem o PERSOANA cu 3 copii = 1) Angajat 2) Student 3) Somer
    //mai jos facem pt angajat ex
    void Munceste();
    void PrimesteSalar();

}
