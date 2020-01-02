package pl.kkp.jlinkexample.restapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloEndpoint {

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String hello() {
        return "hello";
    }

}
