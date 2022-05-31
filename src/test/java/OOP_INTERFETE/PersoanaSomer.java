package OOP_INTERFETE;

public class PersoanaSomer extends PersoanaInterfata implements Somer {

    public PersoanaSomer(String nume, String prenume, String meserie) {
        super(nume, prenume, meserie);
    }

    @Override
    public void Someaza() {
        System.out.println("Somerul " + getNume() + " " + getPrenume() + "someaza");
    }

    @Override
    public void PrimesteAjutorSocial() {
        System.out.println("Somerul " + getNume() + " " + getPrenume() + "primeste ajutor");

    }
}
