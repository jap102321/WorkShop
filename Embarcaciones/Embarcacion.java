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

    public Embarcacion(int precio_base, int valor_adicional, Capitan capitan, int longitud) {
        this.precio_base = precio_base;
        this.valor_adicional = valor_adicional;
        this.capitan = capitan;
        this.longitud = longitud;

    }

    public abstract int getValor_adicional();
    public abstract void setValor_adicional(int valor_adicional);
    public abstract int alquilarEmbarcacion();

}
