package com.cjimenezro.biblioteca;

public class Usuarios {

    private Integer dni;

    private String name;

    private String surname;

    private String telephone;

    private String direction;

    private String popularion;

    /**
     * Funciones
     */

    public Integer getDni(){
        return dni;
    }
    public void setDni (Integer dni){
        this.dni = dni;
    }

    public String getName (){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getSurname (){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getTelephone(){
        return telephone;
    }
    public void setTelephone(String telephone){
        this.telephone=telephone;
    }

    public String getDirection(){
        return direction;
    }
    public void setDirection(String direction){
        this.direction=direction;
    }

    public String getPopularion(){
        return popularion;
    }
    public void setPopularion(String popularion){
        this.popularion=popularion;
    }
}
