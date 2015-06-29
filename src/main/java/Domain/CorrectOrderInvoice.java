package Domain;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * CorrectOrderInvoice created by @author RY Jin on Jun 28, 2015
 */
public class CorrectOrderInvoice {

    private String nameClient;
    private ShippingAddres shippingAddress;
    private String reparationDescription;
    private ArrayList<WorkPerformedInfo> workperformed;
    private ArrayList<PartInfo> parts;
    private String bankAccount;

    public CorrectOrderInvoice() {
    }

    public CorrectOrderInvoice(String NameClient, ShippingAddres ShippingAddres, String ReparationDescription, ArrayList<WorkPerformedInfo> Workperformed, ArrayList<PartInfo> Parts, String BankAccount) {
        this.nameClient = NameClient;
        this.shippingAddress = ShippingAddres;
        this.reparationDescription = ReparationDescription;
        this.workperformed = Workperformed;
        this.parts = Parts;
        this.bankAccount = BankAccount;
    }

    public String getNameClient() {
        return nameClient;
    }

    public ShippingAddres getShippingAddres() {
        return shippingAddress;
    }

    public String getReparationDescription() {
        return reparationDescription;
    }

    public ArrayList<WorkPerformedInfo> getWorkperformed() {
        return workperformed;
    }

    public ArrayList<PartInfo> getParts() {
        return parts;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setNameClient(String NameClient) {
        this.nameClient = NameClient;
    }

    public void setShippingAddres(ShippingAddres ShippingAddres) {
        this.shippingAddress = ShippingAddres;
    }

    public void setReparationDescription(String ReparationDescription) {
        this.reparationDescription = ReparationDescription;
    }

    public void setWorkperformed(ArrayList<WorkPerformedInfo> Workperformed) {
        this.workperformed = Workperformed;
    }

    public void setParts(ArrayList<PartInfo> Parts) {
        this.parts = Parts;
    }

    public void setBankAccount(String BankAccount) {
        this.bankAccount = BankAccount;
    }
}
