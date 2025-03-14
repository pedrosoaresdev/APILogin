import com.example.demo.service.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class LoginController {

    private final AuthService authService;

    public LoginController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        if (authService.authenticate(username, password)) {
            return "Login bem-sucedido!";
        } else {
            return "Credenciais inválidas!";
        }
    }
}
