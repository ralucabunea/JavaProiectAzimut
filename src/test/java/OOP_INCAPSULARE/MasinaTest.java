package OOP_INCAPSULARE;

import org.junit.Test;

public class MasinaTest {
    @Test
    public void incapsulareTest(){
        Audi audiA6= new Audi("audi", "A6", 70000);
        System.out.println(audiA6.getPret());
        audiA6.setModel("A3");
        System.out.println(audiA6.getModel());
        audiA6.cumparaMasina();
        Jaguar jaguarNou= new Jaguar("Jaguar", "XF", 30000);
        jaguarNou.cumparaMasina();

    }
}



