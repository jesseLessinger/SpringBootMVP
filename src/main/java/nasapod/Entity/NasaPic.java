package nasapod.Entity;

import javax.persistence.*;


@Entity
public class NasaPic {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    private String date;
    private String url;
    private String title;

    @Column(length=1024)
    private String explanation;

    private String hdurl;

    public NasaPic(String date, String url, String title, String explanation, String hdurl) {
        this.date = date;
        this.url = url;
        this.title = title;
        this.explanation = explanation;
        this.hdurl = hdurl;
    }

    public NasaPic(){}

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getHdurl() {
        return hdurl;
    }

    public void setHdurl(String hdurl) { this.hdurl = hdurl; }
}
