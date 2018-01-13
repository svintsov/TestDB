package com.company.entity;

public class Master {
    private int id;
    private String name;
    private String secondName;
    private String position;
    private User user;

    public Master(){

    }

    public Master(int id, String name, String secondName, String position, User user) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
        this.position = position;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Master master = (Master) o;

        if (id != master.id) return false;
        if (name != null ? !name.equals(master.name) : master.name != null) return false;
        if (secondName != null ? !secondName.equals(master.secondName) : master.secondName != null) return false;
        if (position != null ? !position.equals(master.position) : master.position != null) return false;
        return user != null ? user.equals(master.user) : master.user == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }
}
