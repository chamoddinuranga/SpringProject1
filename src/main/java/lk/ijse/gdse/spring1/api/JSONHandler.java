package lk.ijse.gdse.spring1.api;

import lk.ijse.gdse.spring1.dto.JsonData;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jasonhandle")
public class JSONHandler {
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<JsonData> getJsondata(){
        return new ResponseEntity<>(new JsonData("J001","Kamal","Kalutara"),HttpStatus.CREATED);
    }
}
