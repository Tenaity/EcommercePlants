package com.midterm.ecommerceplants.model;

public class PlantEvent {
    private Plant plant;

    public PlantEvent(Plant plant) {
        this.plant = plant;
    }

    public Plant getPlant() {
        return plant;
    }

    public void setPlant(Plant plant) {
        this.plant = plant;
    }
}
