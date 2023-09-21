//generar un metodo de forma alatoria genere 500 nodos cada nodo estara formado por una palabra de 5 caracteres 
//dentro del menu generar nodos, mostar nodos , y ordenar nodos , y desordenar nodos , 
//dentro de ordenar busqueda binaria y burbuja

import java.util.Scanner;

public class Nodo3 {
  Scanner sc = new Scanner(System.in);
    
  static class Nodo {
        StringBuilder nombre = new StringBuilder();
        Nodo sig;
        int id;
  }
    Nodo tem=null;
    Nodo tfin=null;
    Nodo fin = null;
    Nodo inicio = null;
    Nodo inicios = null;
    Nodo fins = null;
    int cont=1;
    
    public void agregar() {
        Nodo temp = new Nodo();
        temp.id=cont;    
        char angel= (char) (Math.random() *47 + 0);
        char luis= (char) (Math.random() *47 + 0);
        char hernandez= (char) (Math.random() *47 + 0);
        char chavez= (char) (Math.random() *47 + 0);
        char papi = (char) (Math.random() *47 + 0);
        temp.nombre.append(angel).append(luis).append(hernandez).append(chavez).append(papi);
        
        if (inicio == null) {
            inicio = temp;
            inicio.sig = null;
            fin = temp;
        } else {
            fin.sig=temp;
            temp.sig = null;
            fin = temp;
        }
        System.out.println("dato agregado con id: "+ fin.id);
        cont++;
    }

    public void mostrar() {
        Nodo actual = new Nodo();
        actual = inicios;
        if (inicios != null) {
            while (actual != null) {
                System.out.print(""+actual.nombre  +actual.id);
                System.out.println("");
                actual = actual.sig;
            }
        } else {
            System.out.println("\n La lista se encuentra vacia\n");
        }
    }
    public void busqueda() {
        if (inicio != null) {            
             Nodo actual = new Nodo(); 
             Nodo actual1 = new Nodo();   
              actual = inicio;
              actual1 = null;
              System.out.println("diguite el numero");
              int fenix=sc.nextInt();
               for(int i=0;i<=500;i++){
                if(actual.id== fenix ){
                  actual1=actual;
                }else{
                  actual = actual.sig;
                             
                } }
         
                  if (inicios == null) {
                   System.out.println(""+fenix);
                   inicios = actual1;
                   inicios.sig = null;
                   fins = actual1;
                  }
                  else {
                   System.out.println(""+fenix);
                   fins.sig=actual1;
                   actual1.sig=null;
                   fins = actual1;                   
             }          
       	 
        }else {
            System.out.println("\n La lista se encuentra vacia\n");
        }
    }
    public void desordenar() {
        if (inicio != null ) { 
          Nodo auxi = new Nodo();
          auxi = inicio;
          Nodo actual = new Nodo();   
          actual = inicio;
          int ale=(int) (Math.random()*500 + 1);
          while(auxi != null){
          //for(int i=0;i<=500;i++){
              System.out.println("1 "+auxi.id  );
              System.out.println("2 " +ale);  
              if(auxi.id == ale && auxi != inicios ){
                System.out.println("3 "+auxi.id);         
                if (inicios == null) {
                  inicios = auxi;
                  inicios.sig = null;
                  fins = inicio;
                }
                else {
                  fins.sig=auxi;
                  //auxi.sig=null;
                  fins = auxi;                   
                } 
              }else{
                auxi = auxi.sig;   
              }
             
          }   
        }else {
            System.out.println("\n La lista se encuentra vacia\n");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        Nodo3 n = new Nodo3();
        do {
            System.out.println("\n1 add \n"
                    + "2 mostrar \n"
                    + "3 desordenar \n"
                    + "4 busqueda binaria\n"
                    + "5 salir");
            switch (opt = sc.nextInt()) {
                case 1:
                    for(int i=0;i<500;i++){
                      n.agregar();
                    }
                    break;
                case 2:
                    n.mostrar();
                    break;
                case 3:
                    n.desordenar();                   
                    break;
                case 4:
                   n.busqueda();
                    break;  
                default:
                 System.out.println("Dato mal ingresado");
                 break;
            }
        } while (opt != 5);
    }
    
}