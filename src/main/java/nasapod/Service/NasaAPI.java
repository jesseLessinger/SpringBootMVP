package nasapod.Service;

import nasapod.Entity.NasaPic;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;




@Service
public class NasaAPI {

    public NasaPic getPic() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://api.nasa.gov/planetary/apod?api_key=jiUumSZ3lqXkdg66LLy4WilvbKBBhx0awp0dth7z", NasaPic.class);

    }

    public NasaPic getPic(String date) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://api.nasa.gov/planetary/apod?api_key=jiUumSZ3lqXkdg66LLy4WilvbKBBhx0awp0dth7z&date="+date, NasaPic.class);
    }
}
