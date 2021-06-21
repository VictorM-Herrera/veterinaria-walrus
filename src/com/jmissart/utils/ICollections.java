package com.jmissart.utils;

public interface ICollections {
    public void add(Object e);
    public void create(Object e);
    public String showCollection();
    public void update(Object e);
    public Object search(String data);
    public String showElementByX(String data);
    /*  encontrado = Search
        String resultado = encontrado.toString;
        return resultado;
    */
    public void remove(Object e);
}