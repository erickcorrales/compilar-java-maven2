package org.mipruebamaven.Main;

public class Persona {
    //Variable privadas
    private String mi_nombre;
    private int mi_matricula;

    Persona(String nombre, int matricula)
    {
        mi_nombre = nombre;
        mi_matricula = matricula;
    }

    String getNombre()
    {
        return mi_nombre;
    }

    int getMatricula()
    {
        return mi_matricula;
    }

}
