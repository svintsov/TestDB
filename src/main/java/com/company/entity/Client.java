package com.company.entity;

public class Client  {
    private int id;
    private User user;
    private String name;
    private String secondName;

    public Client(int id, User user, String name, String secondName) {
        this.id = id;
        this.user = user;
        this.name = name;
        this.secondName = secondName;
    }

    public Client(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (id != client.id) return false;
        if (!user.equals(client.user)) return false;
        if (!name.equals(client.name)) return false;
        return secondName.equals(client.secondName);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + user.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + secondName.hashCode();
        return result;
    }
}
