package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Watch {

    @Id
    private int wId;
    private String type;
    private String colour;

    @ManyToOne
    @JoinColumn(name = "c_id")
    private Child child;

    public Watch() {
    }

    public Watch(int wId, String type, String colour, Child child) {
        this.wId = wId;
        this.type = type;
        this.colour = colour;
        this.child = child;
    }

    public int getwId() {
        return wId;
    }

    public void setwId(int wId) {
        this.wId = wId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }
}
