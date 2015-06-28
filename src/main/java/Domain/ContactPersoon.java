package Domain;

/**
 * ContactPersoon 
 * created by @author RY Jin on Jun 20, 2015
 */
public class ContactPersoon {

    private final String Naam;
    private final String AchterNaam;
    private final String Telefoon;

    public ContactPersoon(String naam, String achternaam, String telefoon) {
        this.Naam = naam;
        this.AchterNaam = achternaam;
        this.Telefoon = telefoon;
    }

    public String getNaam() {
        return this.Naam;
    }

    public String getAchterNaam() {
        return this.AchterNaam;
    }

    public String getTelefoon() {
        return this.Telefoon;
    }
}
