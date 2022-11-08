package com.cjimenezro.biblioteca;

import java.lang.reflect.GenericDeclaration;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        /**
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
        **/

        Libro libro = new Libro();
        System.out.println("Por favor introduce el ISBN del libro");
        libro.setIsbn(entrada.nextInt());
        System.out.println("Por favor introduce el titulo del libro");
        libro.setTitle(entrada.next());
        System.out.println("Por favor introduce el autor del libro");
        libro.setAuthor(entrada.next());
        System.out.println("Por favor introduce el genero del libro");
        libro.setGender(entrada.next());
        System.out.println("Por favor introduce la fecha de publicación del libro");
        libro.setPublicationDate(entrada.next());

        System.out.println(libro.getIsbn());
        System.out.println(libro.getTitle());
        System.out.println(libro.getAuthor());
        System.out.println(libro.getGender());
        System.out.println(libro.getPublicationDate());

        Autor autor = new Autor();
        System.out.println("Por favor introduce el ID del autor");
        autor.setId(entrada.nextInt());
        System.out.println("Por favor introduce el nombre del autor");
        autor.setName(entrada.next());
        System.out.println("Por favor introduce los apellidos del autor");
        autor.setSurname(entrada.next());
        System.out.println("Por favor introduce la fecha de nacimiento del autor");
        autor.setDateBrith(entrada.next());
        System.out.println("Por favor introduce el lugar de nacimiento del autor");
        autor.setPlaceBirth(entrada.next());

        System.out.println(autor.getId());
        System.out.println(autor.getName());
        System.out.println(autor.getSurname());
        System.out.println(autor.getDateBrith());
        System.out.println(autor.getPlaceBirth());

        Genero genero = new Genero();
        System.out.println("Por favor introduce el ID del genero");
        genero.setId(entrada.nextInt());
        System.out.println("Por favor introduce el nombre del genero");
        genero.setName(entrada.next());
        System.out.println("Por favor introduce una pequeña descripcion del genero");
        genero.setDescription(entrada.next());

        System.out.println(genero.getId());
        System.out.println(genero.getName());
        System.out.println(genero.getDescription());

        Usuarios usuarios = new Usuarios();
        System.out.println("Por favor introduce el DNI del usuario");
        usuarios.setDni(entrada.nextInt());
        System.out.println("Por favor introduce el nombre del usuario");
        usuarios.setName(entrada.next());
        System.out.println("Por favor introduce los apellidos del usuario");
        usuarios.setSurname(entrada.next());
        System.out.println("Por favor introduce la direccion del usuario");
        usuarios.setDirection(entrada.next());
        System.out.println("Por favor introduce el telefono del usuario");
        usuarios.setTelephone(entrada.next());
        System.out.println("Por favor introduce la provincia del usuario");
        usuarios.setPopularion(entrada.next());

        System.out.println(usuarios.getDni());
        System.out.println(usuarios.getName());
        System.out.println(usuarios.getSurname());
        System.out.println(usuarios.getDirection());
        System.out.println(usuarios.getTelephone());
        System.out.println(usuarios.getPopularion());

    }
}
