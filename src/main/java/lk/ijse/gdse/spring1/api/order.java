package lk.ijse.gdse.spring1.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
@RestController
@RequestMapping("order")
public class order {
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public String savedOrderJSON(){
        return"Saved orderJSON";
    }

    @PostMapping(consumes = MediaType.APPLICATION_XML_VALUE,produces = MediaType.APPLICATION_XML_VALUE)
    public String savedOrderXML(){
        return"Saved order xML";
    }
}
