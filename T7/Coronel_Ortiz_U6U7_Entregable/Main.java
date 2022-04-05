package com.company;

import java.io.*;
import java.util.*;

public class Main{
    static TreeSet<Alumno> alumnos = new TreeSet<Alumno>();
    static Map<String, Alumno> alumnoMap = new HashMap<String, Alumno>();
    public static void main(String[] args) {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("alumnos.dat"));
            alumnos = (TreeSet<Alumno>) objectInputStream.readObject();
        }catch (Exception E){

        }
        boolean a = true;
        int b;
        Scanner teclado = new Scanner(System.in);
        while (a){
            System.out.println("Selecciona una opcion");
            b = teclado.nextInt();
            switch (b){
                case 1:{
                    insertarAlumno();
                    break;
                }
                case 2:{
                    borrarAlumno();
                    break;
                }
                case 3:{
                    motrarAlumnos();
                    break;
                }
                case 4:{
                    mostrarAlumnosCurso();
                    break;
                }
                case 5:{
                    modificarAlumno();
                    break;
                }
                case 6:{
                    salir();
                    a = false;
                    break;
                }
            }
        }
    }

    public static boolean insertarAlumno(){
        Scanner teclado = new Scanner(System.in);
        String[] a = new String[6];
        boolean b;
        System.out.println("De la información necesaria");
        for (int i = 0; i < a.length; i++) {
            a[i] = teclado.nextLine();
        }
        b = teclado.nextBoolean();
        if (alumnoMap.containsKey(a[4])){
            System.out.println();
            return false;
        }else {
            Alumno alumno = new Alumno(a[0], a[1], a[2], a[3], a[4], a[5], b);
            alumnoMap.put(a[4], alumno);
            alumnos.add(alumno);
            return true;
        }
    }

    public static boolean borrarAlumno(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("dni del alumno a borrar");
        String a = teclado.nextLine();
        if (alumnoMap.containsKey(a)){
            alumnos.remove(alumnoMap.get(a));
            alumnoMap.remove(a, alumnoMap.get(a));
            return true;
        }else{
            System.out.println("ALUMN@ NO EXISTE");
            return false;
        }
    }
    public static void motrarAlumnos(){

    }
    public static boolean mostrarAlumnosCurso(){
        Alumno[] alumnos1 = alumnoMap.values().toArray(new Alumno[0]);
        Alumno[] aux = new Alumno[0];
        Scanner teclado = new Scanner(System.in);
        String curso = teclado.nextLine();
        for (int i = 0; i < alumnos1.length; i++) {
            if (alumnos1[i].getCurso().equals(curso)){
                aux = Arrays.copyOf(aux, aux.length + 1);
                aux[aux.length-1]=alumnos1[i];
            }
        }
        if (aux.length == 0){
            System.out.println("NO HAY ALUMNOS DE ESE CURSO");
            return false;
        }else {
            System.out.println(Arrays.toString(aux));
            return true;
        }
    }
    public static boolean modificarAlumno(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("dni del alumno a modificar");
        String c = teclado.nextLine();
        if (alumnoMap.containsKey(c)){
            alumnos.remove(alumnoMap.get(c));
            alumnoMap.remove(c, alumnoMap.get(c));
            String[] a = new String[5];
            boolean b;
            System.out.println("De la información necesaria");
            for (int i = 0; i < a.length; i++) {
                a[i] = teclado.nextLine();
            }
            b = teclado.nextBoolean();
                Alumno alumno = new Alumno(a[0], a[1], a[2], a[3], c, a[4], b);
                alumnoMap.put(c, alumno);
                alumnos.add(alumno);
            return true;
        }else{
            System.out.println("NO EXISTE ALUMNO CON ESE DNI");
            return false;
        }
    }
    public static void salir(){
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("alumnos.dat"));
            objectOutputStream.writeObject(alumnos);
            objectOutputStream.close();
        }catch (Exception E){

        }
    }
}
