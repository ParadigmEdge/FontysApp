package Domain;

/**
 * ShippingAddres 
 * created by @author RY Jin on Jun 20, 2015
 */
public class ShippingAddres {

    private String Street;
    private String Number;
    private String PostalCode;
    private String Place;

    public ShippingAddres(String street, String number, String postalcode, String place) {
        this.Street = street;
        this.Number = number;
        this.PostalCode = postalcode;
        this.Place = place;
    }
    
    public ShippingAddres(){
        
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public void setNumber(String Number) {
        this.Number = Number;
    }

    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    public void setPlace(String Place) {
        this.Place = Place;
    }

    public String getStreet() {
        return this.Street;
    }

    public String getNumber() {
        return this.Number;
    }

    public String getPostalCode() {
        return this.PostalCode;
    }

    public String getPlace() {
        return this.Place;
    }
}
