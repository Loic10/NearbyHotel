package modele;

/**
 * Created by Fox Mc-Tag on 12/10/2016.
 * Property of Mc-Tag's corporation, all rights reserved.
 */
public class Ville {

    private Int ID;
    private Varchar name;



    public Ville(Int ID, Varchar name){
        this.ID= ID;
        new Ville(name);
    }
    public Ville(Varchar name){this.name= name;}




    public Ville get(){return this;}
    public Int getID(){return ID;}
    public Varchar getName(){return name;}

    public void setID(Int ID){this.ID= ID;}
    public void setName(Varchar name){this.name= name;}




}
