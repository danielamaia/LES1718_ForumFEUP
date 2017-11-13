package forum.ws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;

@Controller
public class AppWS {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

}
