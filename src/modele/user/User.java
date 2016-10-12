package modele.user;

import modele.Int;
import modele.Ville;

/**
 * Created by Fox Mc-Tag on 05/10/2016.
 * Property of Mc-Tag's corporation, all rights reserved.
 */
public abstract class User {

    protected Int ID;



    public User(){}
    public User(Int ID){this.ID= ID;}




    public User get(){return this;}
    public Int getID(){return ID;}

    public void setID(Int ID){this.ID= ID;}



    public boolean isRegistered() {return false;}
    public boolean isNonRegistered() {return false;}
    public boolean isClient(){return false;}




}
