package Domain;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * CorrectOrderInvoice created by @author RY Jin on Jun 28, 2015
 */
public class CorrectOrderInvoice {

    private String NameClient;
    private ShippingAddres ShippingAddres;
    private String ReparationDescription;
    private ArrayList<WorkPerformedInfo> Workperformed;
    private BigDecimal TotalForWorkPerfomed;
    private ArrayList<PartInfo> Parts;
    private BigDecimal TotalForParts;
    private String BankAccount;

    public CorrectOrderInvoice() {
    }

    public CorrectOrderInvoice(String NameClient, ShippingAddres ShippingAddres, String ReparationDescription, ArrayList<WorkPerformedInfo> Workperformed, BigDecimal TotalForWorkPerfomed, ArrayList<PartInfo> Parts, BigDecimal TotalForParts, String BankAccount) {
        this.NameClient = NameClient;
        this.ShippingAddres = ShippingAddres;
        this.ReparationDescription = ReparationDescription;
        this.Workperformed = Workperformed;
        this.TotalForWorkPerfomed = TotalForWorkPerfomed;
        this.Parts = Parts;
        this.TotalForParts = TotalForParts;
        this.BankAccount = BankAccount;
    }

    public String getNameClient() {
        return NameClient;
    }

    public ShippingAddres getShippingAddres() {
        return ShippingAddres;
    }

    public String getReparationDescription() {
        return ReparationDescription;
    }

    public ArrayList<WorkPerformedInfo> getWorkperformed() {
        return Workperformed;
    }

    public BigDecimal getTotalForWorkPerfomed() {
        return TotalForWorkPerfomed;
    }

    public ArrayList<PartInfo> getParts() {
        return Parts;
    }

    public BigDecimal getTotalForParts() {
        return TotalForParts;
    }

    public String getBankAccount() {
        return BankAccount;
    }

    public void setNameClient(String NameClient) {
        this.NameClient = NameClient;
    }

    public void setShippingAddres(ShippingAddres ShippingAddres) {
        this.ShippingAddres = ShippingAddres;
    }

    public void setReparationDescription(String ReparationDescription) {
        this.ReparationDescription = ReparationDescription;
    }

    public void setWorkperformed(ArrayList<WorkPerformedInfo> Workperformed) {
        this.Workperformed = Workperformed;
    }

    public void setTotalForWorkPerfomed(BigDecimal TotalForWorkPerfomed) {
        this.TotalForWorkPerfomed = TotalForWorkPerfomed;
    }

    public void setParts(ArrayList<PartInfo> Parts) {
        this.Parts = Parts;
    }

    public void setTotalForParts(BigDecimal TotalForParts) {
        this.TotalForParts = TotalForParts;
    }

    public void setBankAccount(String BankAccount) {
        this.BankAccount = BankAccount;
    }
}
