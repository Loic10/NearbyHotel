package modele;

/**
 * Created by Fox Mc-Tag on 12/10/2016.
 * Property of Mc-Tag's corporation, all rights reserved.
 */
public class Varchar {

    private String data;
    private int maxLength;



    public Varchar(int maxLength){this.maxLength= maxLength;}
    public Varchar(int maxLength, String data){
        new Varchar(maxLength);
        this.data= data;
    }




    public Varchar get(){return this;}
    public String getData(){return data;}
    public int getMaxLength(){return maxLength;}

    public void setData(String data){this.data= data;}
    //TO DO: implements check and exception raising for data exceeding maxLength
    public void setMaxLength(int maxLength){this.maxLength= maxLength;}




}
