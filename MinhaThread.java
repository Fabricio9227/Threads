package MinhaThread;

public class MinhaThread extends Thread { //"Thread" é estendida para criar uma Thread
    //Atributos
    private String nome;
    private int tempo;

    //Construtor
    public MinhaThread(String n, int t) {
        this.nome = n;
        this.tempo = t;
        start(); //Inicia a Thread toda vez que o construtor for executado
    }

    public void run() { //run() é o comando usado para poder rodar as threads
        try {
            for(int i=0; i<6; i++) {
                System.out.println(nome + " contador " + i);
                Thread.sleep(tempo); //Cada vez que for executado, de acordo com o que for passado no parâmetro do construtor, a Thread irá dormir um determinado tempo
            }
        } catch (InterruptedException erro) {
            erro.printStackTrace();
        }
        System.out.println(nome + " terminou a execução");
    }
    
}
