package shop.work.app.workshop5sleam.Entity;

/**
 * Created by Asus on 08/10/2017.
 */

public class User {
    String name,country;


    public User(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
