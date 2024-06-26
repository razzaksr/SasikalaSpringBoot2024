package sasikala.explore.service.cardapiartifact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sasikala.explore.security.entities.CreditCard;
import sasikala.explore.security.remotes.CardRepository;
import sasikala.explore.service.cardapiartifact.authorize.Officials;
import sasikala.explore.service.cardapiartifact.authorize.OfficialsService;

import java.util.List;

@RestController
@ComponentScan("sasikala.explore.security")
public class CardRestController {
    @Autowired
    CardRepository cardRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    OfficialsService officialsService;

    @GetMapping("/dashboard")
    public ResponseEntity dash(){
        return ResponseEntity.ok().body("Logged successfully");
    }

    @PostMapping("/signup")
    public Officials register(@RequestBody Officials officials){
        officials.setPassword(passwordEncoder.encode(officials.getPassword()));
        return officialsService.signUP(officials);
    }

    @PostMapping("/")
    @PreAuthorize("hasAuthority('manager')")
    public ResponseEntity requestToApprove(@RequestBody CreditCard creditCard){
        CreditCard card = cardRepository.approve(creditCard);
        return ResponseEntity.ok().body(card);
    }

    @GetMapping("/")
    public ResponseEntity requestToView(){
        List<CreditCard> customers = cardRepository.viewCustomers();
        return ResponseEntity.ok().body(customers);
    }
}
