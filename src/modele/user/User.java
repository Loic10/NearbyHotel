package modele.user;

import modele.Ville;

/**
 * Created by Fox Mc-Tag on 05/10/2016.
 * Property of Mc-Tag's corporation, all rights reserved.
 */
public abstract class User {

    protected int ID;

    protected final int sizeID= 11;



    public User(){}
    public User(int ID){this.ID= ID;}




    public User get(){return this;}
    public int getID(){return ID;}

    public void setID(int ID){this.ID= ID;}



    public boolean isRegistered() {return false;}
    public boolean isNonRegistered() {return false;}
    public boolean isClient(){return false;}




}
