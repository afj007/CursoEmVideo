package Aula03;

public class Caneta {

        public String modelo;
        public String cor;
        private float ponta;
        protected int carga;
        private boolean tampada = false;

        public void statusCaneta (){
            System.out.println("O Modelo daCaneta é: " +modelo);
            System.out.println("A Cor da Caneta é: " +cor);
            System.out.println("A Ponta de é: " +ponta);
            System.out.println("A Carga da Caneta está em: " +carga);
            System.out.println("A Caneta está Tampada? " +tampada);

    }
        public void escrever(){
            if (tampada == true){
                System.out.println("ERRO: Não é possivel escrever com a Caneta.");
            }
            else {
                System.out.println("Aula02.Caneta.Caneta está escrevendo");
            }
        }

        private void rabiscar(){
            if (tampada == true){
                System.out.println("ERRO: Não é possivel rabiscar com a Caneta.");
            }
            else {
                System.out.println("Caneta está rabiscando");
            }
        }

        public void pintar(){

        }

        public void tampar(){

            this.tampada = true;
        }

        public void destampar(){

            this.tampada =false;
        }
    }

