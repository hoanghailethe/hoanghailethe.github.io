package cookies.example.HW12.Cookies.Controller;

import cookies.example.HW12.Cookies.CookiesUtils;
import cookies.example.HW12.Cookies.Request.settingRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.print.DocFlavor;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

@Controller
public class MainController {
    @RequestMapping({"/","/home"})
    public String home() {
        return "home";
    }

    @RequestMapping("/layout")
    public String showLayout() {
        return "./layouts/main-layout";
    }

    @RequestMapping("/products")
    public String products() {
        return "product";
    }

    @RequestMapping("/setting")
    public String setting(Model model) {
        model.addAttribute("settingRequest", new settingRequest());
        return "setting";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }

    @PostMapping("/submitSetting")
    public String submitSetting
            (@ModelAttribute settingRequest setting,
             BindingResult result,
             HttpServletRequest request,
             HttpServletResponse response
             ) {
        //Cookie for Background color (if need)
        if (setting.getBgColor() != 0) {
            String bgcolor ="";
            switch(setting.getBgColor()){
                case 1: bgcolor = "white";break;
                case 2: bgcolor = "gray";break;
                case 3: bgcolor = "orange";break;
                case 4: bgcolor = "marron";break;
                case 5: bgcolor = "black";
            }
            //create Cookie
            Cookie bgColor = CookiesUtils.createCookie
                    (
                            "bgColor",
                            bgcolor,
                            10, false, false,
                            "/",request.getServerName()
                    );
            response.addCookie(bgColor);
        }

        //Cookie for Font color (if need)
        if (setting.getFontColor() != 0) {
            String fontcolor ="";
            switch(setting.getFontColor()){
                case 1: fontcolor = "white";break;
                case 2: fontcolor = "gray";break;
                case 3: fontcolor = "orange";break;
                case 4: fontcolor = "marron";break;
                case 5: fontcolor = "black";
            }
            //create Cookie
            Cookie fontColor = CookiesUtils.createCookie
                    (
                            "fontColor",
                            fontcolor,
                            10, false, false,
                            "/",request.getServerName()
                    );
            response.addCookie(fontColor);
        }

        //Cookie for fontSize
        double max = 3;
        double min = 0.5;
        Double fontsize = setting.getFontSize()/100*(max-min) + min;

        //create Cookie
        Cookie fontSize = CookiesUtils.createCookie
                (
                        "fontSize",
                        fontsize+"em",
                        10, false, false,
                        "/",request.getServerName()
                );
        response.addCookie(fontSize);
        return "setting";
    }

    @RequestMapping("readCookies")
    public String readCookies(HttpServletRequest request) {
        Optional<String> cookie = CookiesUtils.readCookie(request, "bgColor");
        if(cookie.isPresent()) {
            System.out.println(cookie.get());
        }
        return "setting";
    }

}
