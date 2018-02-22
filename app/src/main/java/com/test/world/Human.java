package com.test.world;

public class Human {
    private String name;
    private int idWorker;
    private long telephone;
    private boolean isMarried;
    private boolean isWork;
    private Human spouse;

    public Human(String name, long telephone, boolean isMarried, boolean isWork, Human spouse) {
        this.name = name;
        this.telephone = telephone;
        this.isMarried = isMarried;
        this.isWork = isWork;
        this.spouse = spouse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdWorker() {
        return idWorker;
    }

    public void setIdWorker(int idWorker) {
        this.idWorker = idWorker;
    }

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public boolean isWork() {
        return isWork;
    }

    public void setWork(boolean work) {
        isWork = work;
    }

    public Human getSpouse() {
        return spouse;
    }

    public void setSpouse(Human spouse) {
        this.spouse = spouse;
    }
}
