package Aula03;

public class Teste1 {


    public static void main(String[] args) {
        Caneta1 c1 = new Caneta1();
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada = true;

        c1.tampar();
        c1.statusCaneta();

    }
}
