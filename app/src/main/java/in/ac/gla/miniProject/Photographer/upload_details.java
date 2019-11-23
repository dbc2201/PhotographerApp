package in.ac.gla.miniProject.Photographer;

public class upload_details {
    String imageurl;
    String title;
    String description;
    String key;

    public upload_details(String imageurl, String title, String description, String key) {
        this.imageurl = imageurl;
        this.title = title;
        this.description = description;
        this.key = key;
    }

    public upload_details() {
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
