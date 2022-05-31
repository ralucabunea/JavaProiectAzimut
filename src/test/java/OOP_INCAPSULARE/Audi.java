package OOP_INCAPSULARE;

import java.util.List;

public class Audi extends Masina {

    public List<String> dotariInterioare;
    public List<String> dotariExterioare;

    public Audi(String brand, String model, Integer pret) {
        super(brand, model, pret);

    }

    public void infoAudi() {
        System.out.println(getBrand());
        System.out.println(getModel());
        System.out.println(getPret());
    }

    //suprascriem o metoda din clasa PARINTE
    @Override
    public void cumparaMasina() {
        System.out.println("Vreau sa cumpar Audi!");
        super.cumparaMasina();

    }

    //POLIMORFISM STATIC

    public void afiseazaMasini() {
        System.out.println("Nu avem masini");
    }

    public void afiseazaMasini(String brand) {
        System.out.println("Nu avem masini");
    }

    public void afiseazaMasini(Integer brand) {
        System.out.println("Nu avem masini");
    }



    //POLIMORFISM STATIC la metode cu return
    public String getNume(){
        return"Nicu";
    }

    public String getNume(Integer parametru){
        return"Nicu";
    }

    public String getNume(String parametru){
        return"Nicu";
    }


    //polimorfismul static se poate aplica doar la metodele cu return care au parametri
    //nu are nici o importanta nr parametrilor sau tipul lor





}