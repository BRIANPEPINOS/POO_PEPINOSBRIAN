
package lab3_u2_pepinosbrian;

//CLASE ESTANDAR HEREDA ATRIBUTOS Y METODOS DE LA CLASE PRODUCTO
public class Estandar extends Producto {
   //DECLARACION DE LOS ATRIBUTOS DE ESTANDAR TODOS PRIVADOS

    private String seccion;
    
    //CREACION DEL CONSTRUCTOR ESTANDAR EL MISMO HEREDA LOS ATRIBUTOS DE LA CLASE PRODUCTO
    public Estandar(String nombre, double precio, String seccion) {
        super(nombre, precio);
        this.seccion = seccion;
    }
//CREACION DE LOS METODOS SETTER Y GETTER PARA EL ATRIBUTO DE LA CLASE ESTANDAR
    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
//SOBREESCRITURA DEL METODO OBTENERPRECIO QUE HEREDAMOS DE LA CLASE PRODUCTO IGUALMENTE CON UN PARAMETRO DE UNIDADES PEDIDAS QUE ESTARA DEFINIDO EN 5

    @Override
    public double obtenerPrecioPedido(int unidadesPedidas) {
        //HEREDAMOS EL VALOR DEL METODO DE LA CLASE PADRE obtenerPrecioPedido con la palabra super
        double precioPedido = super.obtenerPrecioPedido(unidadesPedidas);
        if (unidadesPedidas >= 5) {
            precioPedido *= 0.9; 
        }
        return precioPedido;
    }
    
}
    
    
    

