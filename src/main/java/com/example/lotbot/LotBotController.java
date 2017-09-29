package com.example.lotbot;

import org.springframework.web.bind.annotation.*;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


@RestController// Or @RestController, which one? Why?
public class LotBotController {
    // Here we're storing a list of lots.
    // does a list make sense here? It may,
    // but it's also possible another data
    // structure will make your life easier.
    // think critically about your choices
    List<Lot> lots = new ArrayList<>();

    @CrossOrigin
    @RequestMapping(path = "/lots", method = RequestMethod.GET)
    public List<Lot> getSpaces() {
        return lots;
    }

//    @CrossOrigin
//    @RequestMapping(path = "/lots/<id>", method = RequestMethod.GET)
//    public List<Lot> getId() {
//        return lots;
//    }

//    @CrossOrigin
//    @RequestMapping(path = "/lots/<id>", method = RequestMethod.POST)
//    public void addSpaceship(@RequestBody Spaceship spaceship) {
//        .add(spaceship);
//    }




    /**
     * The @PostConstruct method will cause whichever
     * method it's annotating to run after the controller
     * is created by Spring.
     *
     * In this case, let's use it to give a value to
     * our list of "lots"
     */
    @PostConstruct
    public void postConstruct() {
        // we have to create lots of lots here
        // if you want fewer lots than 20
        // that's okay too
        for (int i = 0;i < 4;i++) {
            lots.add(Lot.createLot());
        }
    }
}
