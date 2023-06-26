package Embarcaciones;

import java.time.LocalDate;

public abstract class Embarcacion{

    private int precio_base;
    private int valor_adicional;

    private Capitan capitan;

    private int longitud;
    private int precio_total;

    public Embarcacion(){

    }

    public Embarcacion(int precio_base, Capitan capitan, int longitud) {
        this.precio_base = precio_base;
        this.capitan = capitan;
        this.longitud = longitud;

    }

    public abstract int getValor_adicional();
    public abstract void setValor_adicional(int valor_adicional);
    public abstract int alquilarEmbarcacion();

}