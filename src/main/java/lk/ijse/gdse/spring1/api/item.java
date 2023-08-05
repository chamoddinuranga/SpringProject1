package lk.ijse.gdse.spring1.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
public class item {
    @GetMapping(params ="data")
    public String getItemWithParams(RequestParam data){
        return "get item "+data;
    }

    @PostMapping(headers ="X-token")
    public String getItemWithCustomToken(@RequestHeader("X-token") String token){
        return "Saved the itme as: " + token;
    }
}
