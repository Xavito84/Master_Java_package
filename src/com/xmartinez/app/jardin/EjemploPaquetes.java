package com.xmartinez.app.jardin;

import com.xmartinez.app.hogar.*;
import static com.xmartinez.app.hogar.ColorPelo.*;
import static com.xmartinez.app.hogar.Persona.*;

public class EjemploPaquetes {
    public static void main(String[] args) {

        Persona p= new Persona();
        //com.xmartinez.app.hogar.Persona p= new com.xmartinez.app.hogar.Persona();
        //Gato gato= new Gato(); no e puede llamar xq esta en default
        Perro perro= new Perro();

        p.setNombre("Xavier");
        p.setApellido("Martinez");
        p.setColorPelo(RUBIO);//p.setColorPelo(ColorPelo.RUBIO); no hace falta porque lo importamos import static com.xmartinez.app.hogar.ColorPelo.*;
        System.out.println("p = " + p.getNombre());

        perro.nombre="Shiva";
        perro.raza="Labrador";

        String jugando = perro.jugar(p);

        System.out.println();
        System.out.println(jugando);
        System.out.println();
        String saludo = saludar(); // No hace falta poner Persona.saludar(); por que hemos importado el metodo statico: import static com.xmartinez.app.hogar.Persona.*;
        System.out.println(saludo);
        String generoMujer= GENERO_FEMENINO;
        String generoHombre= GENERO_MASCULINO;




    }
}
