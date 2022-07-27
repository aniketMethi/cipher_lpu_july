package Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String category_name;
    @ManyToMany(mappedBy = "categories" , fetch = FetchType.LAZY)
    private List<Video> videos = new ArrayList<>();

    public Category(int id, String category_name, List<Video> videos) {
        this.id = id;
        this.category_name = category_name;
        this.videos = videos;
    }

    public Category(String category_name) {
        this.category_name = category_name;
    }

    public Category() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }
}
