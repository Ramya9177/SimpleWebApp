public class HelloRestController {
  
  @GetMapping("api/message")
  public String sayHello(){
    return "Welcome to zensar";
  }
}
