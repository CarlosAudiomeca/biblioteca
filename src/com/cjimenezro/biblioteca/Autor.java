package com.cjimenezro.biblioteca;

public class Autor {

    private Integer id;

    private String name;

    private String surname;

    private String dateBrith;

    private String placeBirth;

    /**
     * Funciones
     */

    public Integer getId (){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName (String name){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }
    public void setSurname (String surname){
        this.surname = surname;
    }

    public String getDateBrith() {
        return dateBrith;
    }
    public void setDateBrith(String dateBrith){
        this.dateBrith = dateBrith;
    }

    public String getPlaceBirth(){
        return  placeBirth;
    }
    public void setPlaceBirth( String placeBirth){
        this.placeBirth = placeBirth;
    }
}
