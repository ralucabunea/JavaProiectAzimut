package OOP_ABSTRACT;

public abstract class PersoanaAbstract {
    //abstractizare= concept pe baza careia definim comportamentul unei clase
    //recunoastem o clasa abstracta dupa cuv "abstract"
    //clasa abstracta poate sau nu sa contina metode abstracte
    //o clasa poate extinde o clasa abstracta
    //o clasa abstract poate sa implementeze o interfata
    //poti sa mostenesti o singura clasa abstracta
    //clasa care mosteneste clasa abstracta => implementeaza toate metodele abstracte
    //clasa abstracta poate sa contina un constructor => nu poti crea obiecte

    abstract void Munceste();
    abstract void PrimesteSalar();
    abstract void Invata();
    abstract void PrimesteBursa();
    abstract void Someaza();
    abstract void PrimesteAjutor();

    public void VerificaVarsta(Integer varsta){
        if (varsta >=18){
            System.out.println("Persoana e majora");
        }
        else {
            System.out.println("Persoana e minora");
        }

    }
}
