package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Child {
    @Id
    private int cId;
    private String name;
    private String address;

    @OneToMany(mappedBy = "child",fetch = FetchType.LAZY)

    private List<Watch> watchList;

    public Child() {
    }

    public Child(int cId, String name, String address, List<Watch> watchList) {
        this.cId = cId;
        this.name = name;
        this.address = address;
        this.watchList = watchList;
    }

    public int getsId() {
        return cId;
    }

    public void setsId(int sId) {
        this.cId = sId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Watch> getWatchList() {
        return watchList;
    }

    public void setWatchList(List<Watch> watchList) {
        this.watchList = watchList;
    }
}
