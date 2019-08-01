package nasapod.Controller;

import nasapod.Entity.NasaPic;
import nasapod.Service.DBService;
import nasapod.Service.NasaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class NasaPodController {


    @Autowired
    private NasaAPI nasaAPI;

    @Autowired
    private DBService dbService;

    @GetMapping("/nasapod")
    public String getPic(Model model, @RequestParam(value="month") String month,
                         @RequestParam(value="day") String day,
                         @RequestParam(value="year") String year) {

        // get pic from NASA
        String date = year + '-' + month + '-' + day;
        NasaPic pic = nasaAPI.getPic(date);

        //get history of pics
        Iterable<NasaPic> picList = dbService.findAll();
        model.addAttribute("picList", picList);

        // add pic to db
        dbService.save(pic);


        // add pic to view model
        model.addAttribute("pic", pic);

        return "index"; //view

    }



    @GetMapping("/")
    public String main(Model model) {

        NasaPic pic = nasaAPI.getPic();
        model.addAttribute("pic", pic);

        Iterable<NasaPic> picList = dbService.findAll();
        model.addAttribute("picList", picList);

        return "index"; //view
    }


}
