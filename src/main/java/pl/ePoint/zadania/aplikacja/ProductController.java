package pl.ePoint.zadania.aplikacja;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @RequestMapping("/products")
    public String viewAllProducts(){
        return "wholeList";
    }
}
