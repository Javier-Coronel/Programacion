package com.company;

public class Main {

    public static void main(String[] args) {
        Integrante i = new Integrante(1, "1", 1, "1");
        Integrante i2 = new Integrante(2, "2", 2, "2");
        Integrante[] integrantes =  {i, i2};
        Coro coro = new Coro("a","ghkjhl","fyidsg","frdhrd",Disfraz.D,7,integrantes,243,432);
        System.out.println(Agrupacion.getNumeroDeAgrupaciones());
        System.out.println(coro.toString());
        coro.setIntegrantes(integrantes);
        System.out.println(coro.toString());
        System.out.println(coro.eliminar_integrante(i));
        System.out.println(coro.toString());
        System.out.println(coro.eliminar_integrante(i));
        System.out.println(coro.toString());
        coro.insertar_integrante(i);
        System.out.println(coro.toString());
        coro.cantar_la_presentacion();
        coro.hacer_tipo();
        coro.caminito_del_falla();
        Chirigota comparsa = new Chirigota("sdg","ahlj","fyidsg","frdhrd",Disfraz.D,1000,integrantes,243);
        System.out.println(Agrupacion.getNumeroDeAgrupaciones());
        comparsa.amo_a_escucha();
        AgrupacionOficial[] agrupacionOficials = {coro, comparsa};
        COAC coac = new COAC(agrupacionOficials);
        System.out.println(coac.toString());
        System.out.println(coac.eliminar_agrupacion(comparsa));
        System.out.println(coac.toString());
        coac.inscribir_agrupacion(comparsa);
        System.out.println(coac.toString());
        coac.ordenar_por_autor();
        System.out.println(coac.toString());
        coac.ordenar_por_nombre();
        System.out.println(coac.toString());
        coac.ordenar_por_puntos();
        System.out.println(coac.toString());

    }
}
