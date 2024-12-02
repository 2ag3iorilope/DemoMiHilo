package DemonHilo;

/**
 * Programa honek 2 hari sortzen ditu Luis eta Ana izenenekoak eta
 * 5 aldiz exekutatzen ditu, bi hariak batera exekutatzen direla ematen du konkurrentea baita
 */

public class DemonHilo extends Thread{
    private String nombre;
   
    public DemonHilo(String nom){
        nombre=nom;
    }
   
    public void run(){
      for (int i=0; i<5;i++)
      {
          System.out.println(nombre + " - "+i);
      }
       
    }
   
    public static void main(String[] args) {
    	DemonHilo t1= new DemonHilo("Ana");
    	DemonHilo t2= new DemonHilo("Luis");
     
        t1.start();
        t2.start();
       
    }
}
