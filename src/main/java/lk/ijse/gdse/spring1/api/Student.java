package lk.ijse.gdse.spring1.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("student/{id:S\\d{3}}")
public class Student {

    @GetMapping("student/{id:S\\d{3}}")
    public String getStudentDetails(@PathVariable String id){
        return "Get student data of "+id;

    }
    @GetMapping("student")
    public String getAllStudent(){
        return "get all student data";
    }

    @GetMapping("student/{id}*")
    public String getAllStudentWithAll(@PathVariable String id){
        return "Get all Student data of"+id;
    }

    @GetMapping("student/{id}/{code}")
    public String getAllStudentWithTwoParams(@PathVariable String id,@PathVariable int code){
        return "Get Student data with multi params as id" + id + "and" + code;
    }
}
