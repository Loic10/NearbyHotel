package modele;

import modele.hotel.Room;
import modele.user.User;

/**
 * Created by Fox Mc-Tag on 05/10/2016.
 * Property of Mc-Tag's corporation, all rights reserved.
 */
public class Reservation {

    private Int ID;
    private Date arrivalDate;
    private Date departureDate;
    private User user;
    private Room room;



    public Reservation(Int ID, Date arrivalDate, Date departureDate, User user, Room room){
        this.ID= ID;
        new Reservation(arrivalDate, departureDate, user, room);
    }
    public Reservation(Date arrivalDate, Date departureDate, User user, Room room){
        this.arrivalDate= arrivalDate;
        this.departureDate= departureDate;
        this.user= user;
        this.room= room;
    }




    public Reservation get(){return this;}
    public Int getID(){return ID;}
    public Date getArrivalDate(){return arrivalDate;}
    public Date getDepartureDate(){return departureDate;}
    public Room getRoom(){return room;}

    public void setID(Int ID){this.ID= ID;}
    public void setArrivalDate(Date arrivalDate){this.arrivalDate= arrivalDate;}
    public void setDepartureDate(Date departureDate){this.departureDate= departureDate;}
    public void setRoom(Room room){this.room= room;}




}
