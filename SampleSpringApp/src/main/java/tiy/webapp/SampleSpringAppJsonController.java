package tiy.webapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yehia830 on 9/12/16.
 */
@RestController
public class SampleSpringAppJsonController{
    @RequestMapping(path = "/person.json", method = RequestMethod.GET)
    public Person jsonHome(String name, String city, int age) {
        return new Person(name, city, age);
    }
}
