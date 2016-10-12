package modele.hotel;

import modele.Int;

/**
 * Created by Fox Mc-Tag on 05/10/2016.
 * Property of Mc-Tag's corporation, all rights reserved.
 */
public class Room {

    private Int ID;
    private Int number;
    private Int price;
    private Int doubleSizeBed;
    private Int simpleSizeBed;
    private Int notes;



    public Room(Int number, Int price, Int doubleSizeBed, Int simpleSizeBed, Int notes){

        this.number= number;
        this.price= price;
        this.doubleSizeBed= doubleSizeBed;
        this.simpleSizeBed= simpleSizeBed;
        this.notes= notes;

    }
    public Room(Int ID, Int number, Int price, Int doubleSizeBed, Int simpleSizeBed, Int notes){
        this.ID= ID;
        new Room(number, price, doubleSizeBed, simpleSizeBed, notes);
    }




    public Room get(){return this;}
    public Int getID(){return ID;}
    public Int getNumber(){return number;}
    public Int getPrice(){return price;}
    public Int getDoubleSizeBed(){return doubleSizeBed;}
    public Int getSimpleSizeBed(){return simpleSizeBed;}
    public Int getNotes(){return notes;}

    public void setID(Int ID){this.ID= ID;}
    public void setNumber(Int number){this.number= number;}
    public void setPrice(Int price){this.price= price;}
    public void setDoubleSizeBed(Int doubleSizeBed){this.doubleSizeBed= doubleSizeBed;}
    public void setSimpleSizeBed(Int simpleSizeBed){this.simpleSizeBed= simpleSizeBed;}
    public void setNotes(Int notes){this.notes= notes;}




}
