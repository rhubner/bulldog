package cz.jrp.bulldog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {


    @GetMapping(value = {"/index", "/"})
    public String getIndex() {
        return "index";
    }


}
