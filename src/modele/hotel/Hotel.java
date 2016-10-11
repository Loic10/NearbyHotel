package modele.hotel;

/**
 * Created by Fox Mc-Tag on 05/10/2016.
 * Property of Mc-Tag's corporation, all rights reserved.
 */
public class Hotel {

    private int ID;
    private String name;
    private String address;
    private String ZIP_code;
    private String mail;
    private String picture;
    private int roomAmmount;
    private String reception;
    private String description;
    private String equipments;
    private boolean authorizationPets;



    public Hotel(String name, String address, String ZIP_code, String mail, String picture, int roomAmmount, String reception, String description, String equipments, boolean authorizationPets){

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
    }

    public Hotel(int ID, String name, String address, String ZIP_code, String mail, String picture, int roomAmmount, String reception, String description, String equipments, boolean authorizationPets){

        this.ID= ID;
        new Hotel(name, address, ZIP_code, mail, picture, roomAmmount, reception, description, equipments, authorizationPets);


    }




    public Hotel get() {return this;}
    public int getID(){return ID;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getZIP_code(){return ZIP_code;}
    public String getMail(){return mail;}
    public String getPicture(){return picture;}
    public int getRoomAmmount() {return roomAmmount;}
    public String getReception(){return reception;}
    public String getDescription(){return description;}
    public String getEquipments(){return equipments;}
    public boolean getAuthorizationPets(){return authorizationPets;}

    public void setID(int ID){this.ID= ID;}
    public void setName(String name){this.name= name;}
    public void setAddress(String address){this.address= address;}
    public void setZIP_code(String ZIP_code){this.ZIP_code= ZIP_code;}
    public void setMail(String mail){this.mail= mail;}
    public void setPicture(String picture){this.picture= picture;}
    public void setRoomAmmount(int roomAmmount) {this.roomAmmount= roomAmmount;}
    public void setReception(String reception){this.reception= reception;}
    public void setDescription(String description){this.description= description;}
    public void setEquipments(String equipments){this.equipments= equipments;}
    public void setAuthorizationPets(boolean authorizationPets){this.authorizationPets= authorizationPets;}




}
