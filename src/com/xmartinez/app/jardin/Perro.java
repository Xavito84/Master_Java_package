package com.xmartinez.app.jardin;

import com.xmartinez.app.hogar.Persona;

public class Perro {
    protected String nombre;
    protected String raza;



    //instancia de persona solo se puede crear en el package com.xmartinez.app.jardin en ninguno mas porque esta en default
    String jugar(Persona persona) {
        return persona.lanzarPelota();
    }
}
