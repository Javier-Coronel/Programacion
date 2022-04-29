public class Main {
    public static void main(String[] args) {
        SAE sae = new SAE();
        Trabajador a = new Trabajador("ytkd","gdghfj","rtjshgt",40, "dhgghf");
        Trabajador b = new Trabajador("trhdfg","abcd","abcd",28, "dhgghf");
        Trabajador c = new Trabajador("rtjfgjytf","bcde","bcde",60, "dhgghf");
        Trabajador d = new Trabajador("dgtujfyukyr", "rtjktd", "weayd", 90, "si");
        Trabajador e = new Trabajador("lojrigeud", "aytfsgsyugbre", "aaaaaurybgr", 20, "si");
        Trabajador f = new Trabajador("dgtujfyukyr", "rfigjytfjt", "weayd", 124, "si");
        Trabajador g = new Trabajador("zzzzzzzzzewhtedg", "zzzzzzzzzewhtedg", "zzzzzzzzzewhtedg", 354, "si");
        Trabajador h = new Trabajador("aaaaaaaaaaaaagjgh", "aaaaaaaaaaaaagjgh", "aaaaaaaaaaaaagjgh", 456, "si");
        Trabajador i = new Trabajador("teghf", "rtjktd", "aaaaaaaaaaaaagjgh", 23, "si");
        Trabajador j = new Trabajador("ryuflghmjyurhngr", "rtjktd", "zzzzzzzzzewhtedg", 93569346, "si");
        sae.addOferta(new Oferta(2, "hh", true));
        sae.addOferta(new Oferta(3, "htrgjh", false));
        sae.addOferta(new Oferta(1, "hh", true));
        sae.addOferta(new Oferta(4, "ytdfkh", true));
        sae.addOferta(new Oferta(5, "ytktudghjtur", false));
        sae.addTrabajador(3, a);
        sae.addTrabajador(3, b);
        sae.addTrabajador(3, c);
        for (int k = 1; k <= 5; k++) {
            sae.addTrabajador(k, j);
        }
        sae.mostrarTrabajadores(3);
        sae.mostrarTrabajadoresXEdad(3);
        sae.removeTrabajador(3, a);
        sae.mostrarTrabajadores(3);
        sae.addTrabajador(2, c);
        sae.mostrarOfertas();
        System.out.println(sae.cantidadOfertas("rtjfgjytf"));
        System.out.println(sae.cantidadOfertas(""));
        System.out.println(sae.cantidadOfertas("ryuflghmjyurhngr"));

    }
}
