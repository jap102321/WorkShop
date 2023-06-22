package Embarcaciones;

import java.time.LocalDate;

public class Yate extends Embarcacion{
    private int precio_base;
    private int valor_adicional;

    private Capitan capitan;

    private int longitud;
    private LocalDate fecha_fabric;
    private int n_camarotes;
    private int precio_total;

    public Yate(){

    }

    public Yate(int precio_base, int valor_adicional, Capitan capitan, int longitud, LocalDate fecha_fabric, int n_camarotes){
        super(precio_base, valor_adicional, capitan, longitud);
        this.fecha_fabric = fecha_fabric;
        this.n_camarotes = n_camarotes;
    }

    @Override
    public int getValor_adicional() {
        if(n_camarotes > 7){
            this.valor_adicional = 250 * n_camarotes;
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
            this.precio_total = valor_adicional + precio_base + 20000;

        }else{
            this.precio_total = valor_adicional + precio_base;
        }
        return precio_total;
    }
}
