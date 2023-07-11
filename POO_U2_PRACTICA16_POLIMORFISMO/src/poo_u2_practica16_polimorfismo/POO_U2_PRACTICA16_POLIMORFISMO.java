
package poo_u2_practica16_polimorfismo;


public class POO_U2_PRACTICA16_POLIMORFISMO {

   
    public static void main(String[] args) {
        mostardatosFiguras(new Triangulo(4,5,"verde"));
        mostardatosFiguras(new Circulo(4,"azul"));
    }
    /*aplicando polimorfismo
    reutilizar codigo, alforzar a todas las clases
    a tener el mismo
    esta expresion vale para cualquier sub clase de figura
    cuyos onjetos vengan aqui como parametros
    
    */
    private static void mostardatosFiguras(Figura f){
        System.out.println("Color: "+f.getColor());
        System.out.println("Superficie: "+f.calcSuperficie());
}
}
