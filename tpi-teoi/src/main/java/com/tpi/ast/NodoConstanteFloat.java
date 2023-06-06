package com.tpi.ast;

public class NodoConstanteFloat extends NodoExpresion {
    private final float valor;

    public NodoConstanteFloat(float valor) {
        super("CTE");
        this.valor = valor;
        this.setId("_" + String.valueOf(valor).replace(".", "@punto"));
    }

    @Override
    public boolean soyHoja() {
        return true;
    }
}
