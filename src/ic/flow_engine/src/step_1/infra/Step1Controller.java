package step_1.infra;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Step1Controller {

    @GetMapping("/entry-point")
    public String entryPoint() {
        return "Hello, World!";
    }

}
