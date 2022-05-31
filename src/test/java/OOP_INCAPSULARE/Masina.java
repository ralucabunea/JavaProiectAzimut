package OOP_INCAPSULARE;

public class Masina {

    //Incapsulare= conceptul prin care tinem departe de exterior valorile variabilelor
    //Private= acces control care blocheaza valorile variabilelor sa fie vazute in afara clasei in care le-ai declarat
    //Ca sa vedem/modificam valorile folosim conceptul de GET/SET



    private String brand;
    private String model;
    private Integer pret;

    //POLIMORFISM = 2 TIPURI:DINAMIC SI STATIC
    //POLIMORFISM DINAMIC= intr o ierarhie de clase obtinute prin mostenire o metoda poate avea implementari dif
    //POLIMORFISM STATIC= mai multe metode cu acelasi nume se pot diferentia prin nr de parametri si tip
    //POLIMORFISM DINAMIC= OVERRIDE
    //POLIMORFISM STATIC= OVERLOAD
    //POLIMORFISMUL STATIC nu se poate aplica la metodele cu return


    //private tine de incapsulare doar
    //public vizibil peste tot
    //private vizibil doar in clasa respectiva
    //concept de get si set se gaseste la incapsulare

    public Masina(String brand, String model, Integer pret) {
        this.brand = brand;
        this.model = model;
        this.pret = pret;
    }

    //click dreapta pt a genera doar GET acum

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getPret() {
        return pret;
    }

    //click dr pt a genera SET doar pt model

    public void setModel(String model) {
        this.model = model;
    }

    //Definim o metoda pe care o vom suprascrie
    public void cumparaMasina(){
        System.out.println("Vreau sa cumpar o masina");


    }
}
