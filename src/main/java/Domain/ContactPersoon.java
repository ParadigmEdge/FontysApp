package Domain;

/**
 * ContactPersoon created by @author RY Jin on Jun 20, 2015
 */
public class ContactPersoon {

    private String Naam;
//    private String AchterNaam;
    private String Telefoon;

    public ContactPersoon(String naam, String telefoon) {
        this.Naam = naam;
//        this.AchterNaam = achternaam;
        this.Telefoon = telefoon;
    }
    
    public ContactPersoon(){
        
    }

    public void setNaam(String Naam) {
        this.Naam = Naam;
    }

//    public void setAchterNaam(String AchterNaam) {
//        this.AchterNaam = AchterNaam;
//    }

    public void setTelefoon(String Telefoon) {
        this.Telefoon = Telefoon;
    }

    public String getNaam() {
        return this.Naam;
    }

//    public String getAchterNaam() {
//        return this.AchterNaam;
//    }

    public String getTelefoon() {
        return this.Telefoon;
    }
}
