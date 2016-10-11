package modele.user;

import modele.Ville;

/**
 * Created by Fox Mc-Tag on 05/10/2016.
 * Property of Mc-Tag's corporation, all rights reserved.
 */
public class NonRegisteredUser extends User {

    private String lastName;
    private String firstName;
    private Ville ville;

    private final int sizeLastName= 25;
    private final int sizeFirstName= 25;



    public NonRegisteredUser(String lastName, String firstName, Ville ville){

        this.lastName= lastName;
        this.firstName= firstName;
        this.ville= ville;

    }




    public String getLastName(){return lastName;}
    public String getFirstName(){return firstName;}
    public Ville getVille(){return ville;}

    public void setLastName(String lastName){this.lastName= lastName;}
    public void setFirstName(String firstName){this.firstName= firstName;}
    public void setVille(Ville ville){this.ville= ville;}



    public boolean isRegistered() {return false;}
    public boolean isNonRegistered() {return true;}
    public boolean isClient(){return false;}




}
