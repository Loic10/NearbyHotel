package modele;

/**
 * Created by Fox Mc-Tag on 12/10/2016.
 * Property of Mc-Tag's corporation, all rights reserved.
 */
public class Int {

    private int data;
    private int maxLength;



    public Int(int maxLength){this.maxLength= maxLength;}
    public Int(int maxLength, int data){
        new Int(maxLength);
        this.data= data;
    }




    public Int get(){return this;}
    public int getData(){return data;}
    public int getMaxLength(){return maxLength;}

    public void setData(int data){this.data= data;}
    //TO DO: implements check and exception raising for data exceeding maxLength
    public void setMaxLength(int maxLength){this.maxLength= maxLength;}
}
