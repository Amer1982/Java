package DesktopAplication.predavanje3.model;

import java.io.Serializable;
import java.util.StringJoiner;

public class Show implements Serializable {
    private int actorID;
    private String firstName;
    private String lastName;
    private int lastUpdate;

    public Show(){
        super();
    }

    public int getActorID() {
        return actorID;
    }

    public void setActorId(int actorId) {
        this.actorID = actorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(int lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ")
                .add(actorID +"")
                .add(firstName)
                .add(lastName +"")
                .add(lastUpdate +"")
                .toString();
    }
}