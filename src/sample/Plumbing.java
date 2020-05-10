package sample;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Plumbing {
    protected SimpleStringProperty name;
    protected SimpleIntegerProperty quantity;

    public Plumbing() {

    }

    public Plumbing(String name, int quantity) {
        this.name = new SimpleStringProperty(name);
        this.quantity = new SimpleIntegerProperty(quantity);
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name = new SimpleStringProperty(name);
    }

    public int getQuantity() {
        return quantity.get();
    }

    public SimpleIntegerProperty quantityProperty() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = new SimpleIntegerProperty(quantity);
    }
}

