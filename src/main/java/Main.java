import Entity.Category;
import Entity.Profile;
import Entity.Users;
import Entity.Video;
import Repository.CategoryRepository;
import Repository.UserRepository;
import Repository.VideoRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Users user = new Users("rahul123", "qwerty", new Profile("rahul", "NB", 20, "rahul@gmail.com", "rajasthan"));
//        ArrayList<Video> videoArrayList = new ArrayList<>();

        UserRepository userRepository = new UserRepository();

        Video video = new Video("java", "learn java by cipherschools", "cipherschools.com",new Date(), user);
//        videoArrayList.add(video);
//        user.setVideos(videoArrayList);
        List<Category> categories= new ArrayList<>();
        categories.add(new Category("Technical"));
        categories.add(new Category("Educational"));
        video.setCategories(categories);
        userRepository.saveUser(user);

        VideoRepository videoRepository = new VideoRepository();

        videoRepository.uploadVideo(video);


    }

}
