package com.cjimenezro.biblioteca;

public class Libro {
    private Integer isbn;

    private String title;

    private String author;

    private String gender;

    private String publicationDate;


    /**
     * Funciones
     */


    public Integer getIsbn (){
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender=gender;
    }

    public String getPublicationDate(){
        return publicationDate;
    }
    public void setPublicationDate(String publicationDate){
        this.publicationDate = publicationDate;
    }
}
