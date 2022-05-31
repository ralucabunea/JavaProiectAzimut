package OOP_INTERFETE;

public class PersoanaSomerStudent extends PersoanaInterfata implements Student, Somer{
    public PersoanaSomerStudent(String nume, String prenume, String meserie) {
        super(nume, prenume, meserie);
    }

    @Override
    public void Someaza() {
        System.out.println("Somerul/studentul " + getNume() + " " + getPrenume() + "someaza");
    }

    @Override
    public void PrimesteAjutorSocial() {
        System.out.println("Somerul/studentul " + getNume() + " " + getPrenume() + "primeste ajutor social");

    }

    @Override
    public void Invata() {
        System.out.println("Somerul/studentul " + getNume() + " " + getPrenume() + "invata");

    }

    @Override
    public void PrimesteBursa() {
        System.out.println("Somerul/studentul " + getNume() + " " + getPrenume() + "primeste bursa");

    }
}
