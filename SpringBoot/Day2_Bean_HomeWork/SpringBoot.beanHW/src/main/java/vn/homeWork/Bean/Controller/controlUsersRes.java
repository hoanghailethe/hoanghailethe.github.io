package vn.homeWork.Bean.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import vn.homeWork.Bean.javaClasses.Tivi;

@Controller
public class controlUsersRes {

    @Autowired
    private Tivi myTivi;

    @ResponseBody
    @GetMapping(value ="/", produces = MediaType.TEXT_HTML_VALUE)
    public String getHomePage() {
        return myTivi.toString();
    }
}
