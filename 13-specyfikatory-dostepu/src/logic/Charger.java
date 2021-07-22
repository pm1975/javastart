package logic;

import model.Telephone;

public class Charger {
    private Telephone telephone;

    public Charger(Telephone telephone) {
        this.telephone = telephone;
    }

    public void Charging() {
        telephone.setChargeLevel(telephone.getChargeLevel() + 1);
    }
}
