
package lab3_u2_pepinosbrian;

//CLASE PRODUCTO ES LA CLASE PADRE
public class Producto {
    //DECLARACION DE LOS ATRIBUTOS DE PRODUCTO TODOS PRIVADOS
    private String nombre;
    private double precio;
    //CREACIÓN DEL CONTRUCTO DE LA CLASE PRODUCTO
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
// CREACIÓN DE LOS METODS SETTER Y GETTER PARA PODER UTILIZAR LOS ATRIBUTOS YA QUE SE ENCUENTRAN EN PRIVADO
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
//CREACIÓN METODO OBTENER PRECIO PEDIDO MISMO SE ENCUENTRA CON UN PARAMETRO DE LAS UNIDADES PEDIDAS 
    //ESTA VARIABLE VA A ESTAR DEFINIDO EN 5 PRODUCTOS
    //ESTE METODO VAN A HEREDAR LAS CLASES ESTANDAR Y PRODUCTO
    public double obtenerPrecioPedido(int unidadesPedidas) {
        return unidadesPedidas * getPrecio();
    }
    
}
