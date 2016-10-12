package modele.hotel;

import modele.Int;
import modele.Varchar;
import modele.Ville;

/**
 * Created by Fox Mc-Tag on 05/10/2016.
 * Property of Mc-Tag's corporation, all rights reserved.
 */
public class Hotel {

    private Int ID;
    private Varchar name;
    private Varchar address;
    private Varchar ZIP_code;
    private Varchar mail;
    private Varchar picture;
    private Int roomAmmount;
    private Varchar reception;
    private Varchar description;
    private Varchar equipments;
    private boolean authorizationPets;
    private Ville ville;



    public Hotel(Varchar name, Varchar address, Varchar ZIP_code, Varchar mail, Varchar picture, Int roomAmmount, Varchar reception, Varchar description, Varchar equipments, boolean authorizationPets, Ville ville){

        this.name= name;
        this.address= address;
        this.ZIP_code= ZIP_code;
        this.mail= mail;
        this.picture= picture;
        this.roomAmmount= roomAmmount;
        this.reception= reception;
        this.description= description;
        this.equipments= equipments;
        this.authorizationPets= authorizationPets;
        this.ville= ville;
    }

    public Hotel(Int ID, Varchar name, Varchar address, Varchar ZIP_code, Varchar mail, Varchar picture, Int roomAmmount, Varchar reception, Varchar description, Varchar equipments, boolean authorizationPets, Ville ville){

        this.ID= ID;
        new Hotel(name, address, ZIP_code, mail, picture, roomAmmount, reception, description, equipments, authorizationPets, ville);


    }




    public Hotel get() {return this;}
    public Int getID(){return ID;}
    public Varchar getName(){return name;}
    public Varchar getAddress(){return address;}
    public Varchar getZIP_code(){return ZIP_code;}
    public Varchar getMail(){return mail;}
    public Varchar getPicture(){return picture;}
    public Int getRoomAmmount() {return roomAmmount;}
    public Varchar getReception(){return reception;}
    public Varchar getDescription(){return description;}
    public Varchar getEquipments(){return equipments;}
    public boolean getAuthorizationPets(){return authorizationPets;}
    public Ville getVille(){return ville;}

    public void setID(Int ID){this.ID= ID;}
    public void setName(Varchar name){this.name= name;}
    public void setAddress(Varchar address){this.address= address;}
    public void setZIP_code(Varchar ZIP_code){this.ZIP_code= ZIP_code;}
    public void setMail(Varchar mail){this.mail= mail;}
    public void setPicture(Varchar picture){this.picture= picture;}
    public void setRoomAmmount(Int roomAmmount) {this.roomAmmount= roomAmmount;}
    public void setReception(Varchar reception){this.reception= reception;}
    public void setDescription(Varchar description){this.description= description;}
    public void setEquipments(Varchar equipments){this.equipments= equipments;}
    public void setAuthorizationPets(boolean authorizationPets){this.authorizationPets= authorizationPets;}
    public void setVille(Ville ville){this.ville= ville;}




}
