package Aula04;

public class Caneta {

       public String modelo;
       private float ponta;
       private boolean tampada = false;
       private String cor;

    public Caneta(String modelo, float ponta, String cor) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    /*  ACIMA FOI USANDO A TECLA ALT + INSERT NO INTELLIJ
            ABAIXO DISSO FOI DIGITADO NA MÃO


    public Caneta(String m, String c, float p){ //Método construtor é quando tem o mesmo nome da Classe
            this.modelo = m;
            this.cor = c;
            this.ponta = p;
            this.tampar();
            this.cor = "Azul";
       }

       public void tampar (){
           this.tampada = true;
       }

       public void destampar(){
           this.tampada = false;
       }

       public String
       getModelo(){
           return this.modelo;
       }

       public void setModelo (String m){
           this.modelo= m;
       }

       public float getPonta(){
           return ponta;
       }
       public void setPonta(float p){
           this.ponta = p;
       }*/

       public void status(){
           System.out.println("SOBRE A CANETA:");
           System.out.println("MODELO: " +this.getModelo());
           System.out.println("PONTA: " +this.getPonta());
           System.out.println("COR: " +this.cor);
           System.out.println("TAMPADA: " +this.tampada);
       }
    }

