package vn.MQ.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

@Controller
public class HomeController {

    @ResponseBody
    @GetMapping(value = "/", produces= MediaType.TEXT_HTML_VALUE)
    public String getCSVFile() {
        String printContentToHTML ="Here is what I read from HTML" + "<br/>";
        //System.out.println(new File("."). getAbsolutePath());   THIS HELP LOCATE THE POSITION/..
        try (BufferedReader br = new BufferedReader(new FileReader("./src/main/resources/bikeList.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                printContentToHTML += line + "<br/>";
            }
        } catch (Exception e) {
            System.out.println("error " + e.toString());
            printContentToHTML += "ERROR " +e.toString();
        }
        return printContentToHTML;
    }
}
