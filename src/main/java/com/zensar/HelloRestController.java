import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
  
  @GetMapping("/api/message")
  public String sayHello(){
    return "Welcome to zensar";
  }
}
