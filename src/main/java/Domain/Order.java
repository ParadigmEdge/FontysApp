package Domain;

import java.awt.List;
import java.util.ArrayList;

/**
 * Order
 * created by @author RY Jin on Jun 20, 2015
 */
public class Order {

    private String NameClient;
    private ContactPersoon ContactPersoon;
    private ShippingAddres ShippingAddres;
    private String ReparationDescription;
    private ArrayList Workperformed;
    private ArrayList Parts;

    public Order(String nameclient, ContactPersoon contactpersoon, ShippingAddres shippingaddres, String reparationDescription, ArrayList workperformed, ArrayList parts) {
        this.NameClient = nameclient;
        this.ContactPersoon = contactpersoon;
        this.ShippingAddres = shippingaddres;
        this.ReparationDescription = reparationDescription;
        this.Workperformed = workperformed;
        this.Parts = parts;
    }
    
    public Order(){
        
    }

    public void setNameClient(String NameClient) {
        this.NameClient = NameClient;
    }

    public void setContactPersoon(ContactPersoon ContactPersoon) {
        this.ContactPersoon = ContactPersoon;
    }

    public void setShippingAddres(ShippingAddres ShippingAddres) {
        this.ShippingAddres = ShippingAddres;
    }

    public void setReparationDescription(String ReparationDescription) {
        this.ReparationDescription = ReparationDescription;
    }

    public void setWorkperformed(ArrayList Workperformed) {
        this.Workperformed = Workperformed;
    }

    public void setParts(ArrayList Parts) {
        this.Parts = Parts;
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

    public ArrayList getWorkperformed() {
        return this.Workperformed;
    }

    public ArrayList getParts() {
        return this.Parts;
    }
}
