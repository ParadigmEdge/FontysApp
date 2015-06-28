package Domain;

/**
 * ShippingAddres 
 * created by @author RY Jin on Jun 20, 2015
 */
class ShippingAddres {

    private final String Street;
    private final String Number;
    private final String PostalCode;
    private final String Place;

    public ShippingAddres(String street, String number, String postalcode, String place) {
        this.Street = street;
        this.Number = number;
        this.PostalCode = postalcode;
        this.Place = place;
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
