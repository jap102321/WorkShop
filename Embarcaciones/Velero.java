package Embarcaciones;

import java.time.LocalDate;

public class Velero extends Embarcacion{
    private int precio_base;
    private int valor_adicional;

    private Capitan capitan;

    private int longitud;
    private LocalDate fecha_fabric;
    private int n_mastiles;
    private int precio_total;

    public Velero(int precio_base, Capitan capitan, int longitud, LocalDate fecha_fabric, int n_mastiles){
        super(precio_base, capitan, longitud);
        this.precio_base = precio_base;
        this.capitan = capitan;
        this.longitud = longitud;
        this.fecha_fabric = fecha_fabric;
        this.n_mastiles = n_mastiles;
    }

    @Override
    public int getValor_adicional() {
        if(n_mastiles > 4){
            this.valor_adicional = 250 * n_mastiles;
        }else{
            this.valor_adicional = 0;
        }
        return valor_adicional;
    }

    @Override
    public void setValor_adicional(int valor_adicional) {

    }

    @Override
    public int alquilarEmbarcacion() {
        if(fecha_fabric.isAfter(LocalDate.of(2020, 12, 31))){
            precio_total = getValor_adicional() + precio_base + 20000;

        }else{
            precio_total = getValor_adicional() + precio_base;
        }
        return precio_total;
    }

    @Override
    public String toString() {
        return "\nVelero \n " +
                "Precio base: " + precio_base +
                ", valor adicional: " + valor_adicional +
                ", longitud: " + longitud +
                ", fecha de fabricacion: " + fecha_fabric +
                ", numero de mastiles: " + n_mastiles +
                ", precio total: " + precio_total
                + capitan ;
    }
}