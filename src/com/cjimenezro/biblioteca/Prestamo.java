package com.cjimenezro.biblioteca;

public class Prestamo {

    private Integer id;

    private Integer isbnBook;

    private Integer dniUser;

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

    public Integer getIsbnBook(){
        return isbnBook;
    }
    public void setIsbnBook(Integer isbnBook){
        this.isbnBook = isbnBook;
    }

    public Integer getDniUser(){
        return dniUser;
    }
    public void setDniUser(Integer dniUser){
        this.dniUser = dniUser;
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
