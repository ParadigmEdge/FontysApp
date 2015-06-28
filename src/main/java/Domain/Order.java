package Domain;

import java.awt.List;

/**
 * Order
 * created by @author RY Jin on Jun 20, 2015
 */
public class Order {

    private final String NameClient;
    private final ContactPersoon ContactPersoon;
    private final ShippingAddres ShippingAddres;
    private final String ReparationDescription;
    private final List Workperformed;
    private final List Parts;

    public Order(String nameclient, ContactPersoon contactpersoon, ShippingAddres shippingaddres, String reparationDescription, List workperformed, List parts) {
        this.NameClient = nameclient;
        this.ContactPersoon = contactpersoon;
        this.ShippingAddres = shippingaddres;
        this.ReparationDescription = reparationDescription;
        this.Workperformed = workperformed;
        this.Parts = parts;
    }

    public String getNameClient() {
        return this.NameClient;
    }

    public ContactPersoon getContactPersoon() {
        return this.ContactPersoon;
    }

    public ShippingAddres getNameShippingAddres() {
        return this.ShippingAddres;
    }

    public String getReparationDescription() {
        return this.ReparationDescription;
    }

    public List getWorkperformed() {
        return this.Workperformed;
    }

    public List getParts() {
        return this.Parts;
    }
}
