
package lab3_u2_pepinosbrian;

//CLASE OFERTA HEREDA ATRIBUTOS Y METODOS DE LA CLASE PRODUCTO
public class Oferta extends Producto {
    //DECLARACION DE LOS ATRIBUTOS DE OFERTA TODOS PRIVADOS
    private int dias;
//CREACION DEL CONSTRUCTOR Oferta EL MISMO HEREDA LOS ATRIBUTOS DE LA CLASE PRODUCTO
    public Oferta(String nombre, double precio, int dias) {
        super(nombre, precio);
        this.dias = dias;
    }
//CREACION DE LOS METODOS SETTER Y GETTER PARA EL ATRIBUTO DE LA CLASE ESTANDAR
    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
//SOBREESCRITURA DEL METODO OBTENERPRECIO QUE HEREDAMOS DE LA CLASE PRODUCTO IGUALMENTE CON UN PARAMETRO DE UNIDADES PEDIDAS QUE ESTARA DEFINIDO EN 5
    @Override
    public double obtenerPrecioPedido(int unidadesPedidas) {
        double total=0;
        if (getDias() == 1) {
            setPrecio(getPrecio()-(getPrecio()*0.2)); 
            total=getPrecio()*unidadesPedidas;
            // Aplicar descuento del 20% si queda 1 día
        } else if (dias == 2 || dias == 3) {
            setPrecio(getPrecio()-(getPrecio()*0.15)); 
            total=getPrecio()*unidadesPedidas;
            // Aplicar descuento del 15% si quedan 2 o 3 días
        } else if (dias > 3) {
            setPrecio(getPrecio()-(getPrecio()*0.1)); 
            total=getPrecio()*unidadesPedidas; // Aplicar descuento del 10% si quedan más de 3 días
        }else{
            total=getPrecio();
        }
        return total;
    }

}
