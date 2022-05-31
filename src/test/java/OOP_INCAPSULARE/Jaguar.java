package OOP_INCAPSULARE;

public class Jaguar extends Masina{


    public Jaguar(String brand, String model, Integer pret) {
        super(brand, model, pret);
    }

    @Override
    public void cumparaMasina() {
        System.out.println("NU! Cumpar jaguar");
        super.cumparaMasina();
    }
}
