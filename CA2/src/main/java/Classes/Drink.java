package Classes;

import java.net.URL;

public class Drink {

    private String name,origin,texture;
    private URL image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public URL getImage() {
        return image;
    }

    public void setImage(URL image) {
        this.image = image;
    }

    public Drink(String n,String o,String t,URL i){
        name=n;
        origin=o;
        texture=t;
        image=i;
    }
}
