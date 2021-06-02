package vn.CarDealer.Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import vn.CarDealer.model.Car;

@Controller
public class RequestController {

    private final String appName = "Minh Quang's Car Collection";

    private static final String AppName = "appName";
    private static final String CAR_COLLECTION_HTML = "cars";

    @GetMapping("/")
    public String getHomePage(Model themeViewModel) {
        Car[] CarCollection = {
                new Car(1, "Audi", "Audi", 500000000, "audiA6"),
                new Car(2, "Chevrolet I", "Chevrolet", 600000000, "1959-Chevrolet"),
                new Car(3, "Chevrolet II", "Chevrolet", 700000000, "1966-Chevrolet"),
                new Car(4, "1979 Pontiac", "Forb", 800000000, "1979-Pontiac"),
                new Car(5, "Chevrolet C2", "Chevrolet", 900000000, "Chevrolet-C2")
        };
        themeViewModel.addAttribute(AppName, appName);
        themeViewModel.addAttribute(CAR_COLLECTION_HTML, CarCollection);
        return "CarCollectionSelling";
    }

}
