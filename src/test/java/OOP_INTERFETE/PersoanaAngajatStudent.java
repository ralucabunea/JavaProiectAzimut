package OOP_INTERFETE;

public class PersoanaAngajatStudent extends PersoanaInterfata implements Angajat, Student{
    public PersoanaAngajatStudent(String nume, String prenume, String meserie) {
        super(nume, prenume, meserie);
    }

    @Override
    public void Munceste() {
        System.out.println("Student/angajat " + getNume() + " " + getPrenume() + "munceste");
    }

    @Override
    public void PrimesteSalar() {
        System.out.println("Student/angajat " + getNume() + " " + getPrenume() + "primeste salar");

    }

    @Override
    public void Invata() {
        System.out.println("Student/angajat " + getNume() + " " + getPrenume() + "invata");

    }

    @Override
    public void PrimesteBursa() {
        System.out.println("Student/angajat " + getNume() + " " + getPrenume() + "primeste bursa");

    }

}
