package com.cjimenezro.biblioteca;

public class Control {

    private Integer id;

    private String book;

    private String user;

    private String lonaDate;

    private String returnDate;

    /**
     * Funciones
     */

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id=id;
    }

    public String getBook(){
        return book;
    }
    public void setBook(String book){
        this.book=book;
    }

    public String getUser(){
        return user;
    }
    public void setUser(String user){
        this.user=user;
    }

    public String getLonaDate(){
        return lonaDate;
    }
    public void setLonaDate(String lonaDate0){
        this.lonaDate=lonaDate0;
    }

    public String getReturnDate(){
        return returnDate;
    }
    public void setReturnDate(String returnDate){
        this.returnDate=returnDate;
    }
}
