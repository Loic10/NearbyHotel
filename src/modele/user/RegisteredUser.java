package modele.user;

import modele.Ville;

/**
 * Created by Fox Mc-Tag on 05/10/2016.
 * Property of Mc-Tag's corporation, all rights reserved.
 */
public class RegisteredUser extends User {

    private String lastName;
    private String firstName;
    private Ville ville;
    private String login;
    private int password;

    private final int sizeLogin= 25;
    private final int sizePassword= 25;
    private final int sizeLastName= 25;
    private final int sizeFirstName= 25;



    public RegisteredUser(String login, int password, String lastName, String firstName, Ville ville){

        this.login= login;
        this.password= password;
        this.lastName= lastName;
        this.firstName= firstName;
        this.ville= ville;

    }




    public String getLogin(){return login;}
    public int getPassword(){return password;}
    public String getLastName(){return lastName;}
    public String getFirstName(){return firstName;}
    public Ville getVille(){return ville;}

    public void setLogin(String login){this.login= login;}
    public void setPassword(int password){this.password= password;}
    public void setLastName(String lastName){this.lastName= lastName;}
    public void setFirstName(String firstName){this.firstName= firstName;}
    public void setVille(Ville ville){this.ville= ville;}



    public boolean isRegistered() {return true;}
    public boolean isNonRegistered() {return false;}
    public boolean isClient(){return false;}




}
