package OOP_INTERFETE;

public class PersoanaAngajat extends PersoanaInterfata implements Angajat{
    public PersoanaAngajat(String nume, String prenume, String meserie) {
        super(nume, prenume, meserie);
    }

    @Override
    public void Munceste() {
        System.out.println("Angajatul " + getNume() + " " + getPrenume() + "munceste");
    }

    @Override
    public void PrimesteSalar() {
        System.out.println("Angajatul " + getNume() + " " + getPrenume() + "primeste salar");

    }
}
