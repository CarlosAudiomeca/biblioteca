package com.cjimenezro.biblioteca;

import jdk.internal.cmm.SystemResourcePressureImpl;

import java.security.CodeSigner;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        List<Genero> listadoGenero = new ArrayList<>();

        for(int i=0; i < 10; i++){
            Genero genero = new Genero();
            genero.setId(1);
            genero.setName(entrada.next());
            genero.setDescription("adasd");
            listadoGenero.add(genero);
        }

        listadoGenero.get(0).getName();

        System.out.println(listadoGenero.get(0).getName());

        Libro libro = new Libro();
        libro.setIsbn(entrada.nextInt());
        libro.setTitle(entrada.next());
        libro.setAuthor(entrada.next());
        libro.setGender(entrada.next());
        libro.setPublicationDate(entrada.next());


        System.out.println(libro.getIsbn());
        System.out.println(libro.getTitle());
        System.out.println(libro.getAuthor());
        System.out.println(libro.getGender());
        System.out.println(libro.getPublicationDate());



    }
}
