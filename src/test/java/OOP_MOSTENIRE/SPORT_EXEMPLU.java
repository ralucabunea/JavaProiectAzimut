package OOP_MOSTENIRE;

public class SPORT_EXEMPLU {
    //proprietati care se gasesc la nivel mare la orice sport

    public String Nume;
    public String Denumire;
    public Boolean EsteEchipa;
    public Integer NumarMembri;

    //integram un constructor

    public SPORT_EXEMPLU(String nume, String denumire, Boolean esteEchipa, Integer numarMembri) {
        Nume = nume;
        Denumire = denumire;
        this.EsteEchipa= esteEchipa;
        this.NumarMembri = numarMembri;
    }

    // OOP -MOSTENIRE = principiul pe baza caruia  clasa PARINTE poate sa fie mostenita de N clase COPII
    // EX: casa bunicilor cu nepotii (in casa bunicilor sunt obiecte care le raman mostenire copiilor , dupa care ei decid ce fac cu ele
    // In Java putem mosteni o  singura clasa=lbj primeste 1 clasa
    // In momentul in care clasa COPIL mosteneste clasa PARINTE trb sa apelam constrctorul din clasa PARINTE

    //mai jos este o metoda
    public void InfoSport(){
        System.out.println("Nume");
        System.out.println("Denumire");
        System.out.println("EsteEchipa");
        System.out.println("NumarMembri");
    }
}
