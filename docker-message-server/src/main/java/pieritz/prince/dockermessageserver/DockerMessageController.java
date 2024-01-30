package pieritz.prince.dockermessageserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
public class DockerMessageController {
  @GetMapping("/messages")
  public String getMessage() {
    return "Hello from Docker!";
  }
}