package Aula04;

public class Teste {


    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC",0.5F,"Azul");
        c1.setTampada(true);

        Caneta c2 = new Caneta("SHOPPING METRO",1.5f,"VERMELHA");
        c2.setTampada(false);
        //c1.setModelo("BIC");
        //c1.setPonta(0.5f);
        c1.status();
        c2.status();
        //System.out.println("Modelo da Caneta é: " +c1.getModelo());

    }
}
