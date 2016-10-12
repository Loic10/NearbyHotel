package modele.user;

import modele.Varchar;
import modele.Ville;

/**
 * Created by Fox Mc-Tag on 05/10/2016.
 * Property of Mc-Tag's corporation, all rights reserved.
 */
public class NonRegisteredUser extends User {

    private Varchar lastName;
    private Varchar firstName;
    private Ville ville;




    public NonRegisteredUser(Varchar lastName, Varchar firstName, Ville ville){

        this.lastName= lastName;
        this.firstName= firstName;
        this.ville= ville;

    }




    public Varchar getLastName(){return lastName;}
    public Varchar getFirstName(){return firstName;}
    public Ville getVille(){return ville;}

    public void setLastName(Varchar lastName){this.lastName= lastName;}
    public void setFirstName(Varchar firstName){this.firstName= firstName;}
    public void setVille(Ville ville){this.ville= ville;}



    public boolean isRegistered() {return false;}
    public boolean isNonRegistered() {return true;}
    public boolean isClient(){return false;}




}
