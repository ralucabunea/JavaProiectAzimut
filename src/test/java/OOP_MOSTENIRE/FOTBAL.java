package OOP_MOSTENIRE;

import java.util.List;

public class FOTBAL extends SPORT_EXEMPLU {

    public Boolean Capitan;
    public Integer NrEchipamente;
    public List<String> Reguli;

    //mai jos este un constructor
    public FOTBAL(String nume, String denumire, Boolean esteEchipa, Integer numarMembri, Boolean Capitan,
                  Integer NrEchipamente,List<String> Reguli) {
        super(nume, denumire, esteEchipa, numarMembri);
        this.Capitan= Capitan;
        this.NrEchipamente= NrEchipamente;
        this.Reguli= Reguli;

    }
    public void InfoFotbal(){
        System.out.println("Informatiile despre fotbal sunt: ");
        InfoSport();
        System.out.println("Capitan");
        System.out.println("NrEchipamente");
        System.out.println("Reguli");
    }

}
