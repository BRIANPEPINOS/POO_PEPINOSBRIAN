package poo_u2_practica16_polimorfismo;


public abstract class Figura {
    private String color;
    public Figura (String color){
        this.color=color;
    }
    public abstract double calcSuperficie();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
