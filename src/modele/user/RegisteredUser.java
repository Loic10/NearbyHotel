package modele.user;

import modele.Int;
import modele.Varchar;
import modele.Ville;

/**
 * Created by Fox Mc-Tag on 05/10/2016.
 * Property of Mc-Tag's corporation, all rights reserved.
 */
public class RegisteredUser extends User {

    private Varchar lastName;
    private Varchar firstName;
    private Ville ville;
    private Varchar login;
    private Int password;




    public RegisteredUser(Varchar login, Int password, Varchar lastName, Varchar firstName, Ville ville){

        this.login= login;
        this.password= password;
        this.lastName= lastName;
        this.firstName= firstName;
        this.ville= ville;

    }




    public Varchar getLogin(){return login;}
    public Int getPassword(){return password;}
    public Varchar getLastName(){return lastName;}
    public Varchar getFirstName(){return firstName;}
    public Ville getVille(){return ville;}

    public void setLogin(Varchar login){this.login= login;}
    public void setPassword(Int password){this.password= password;}
    public void setLastName(Varchar lastName){this.lastName= lastName;}
    public void setFirstName(Varchar firstName){this.firstName= firstName;}
    public void setVille(Ville ville){this.ville= ville;}



    public boolean isRegistered() {return true;}
    public boolean isNonRegistered() {return false;}
    public boolean isClient(){return false;}




}
