package project.school.rotmgautologin.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import project.school.rotmgautologin.Models.LoginResponse.PassFailAccounts;
import project.school.rotmgautologin.Models.RealmAccount;
import project.school.rotmgautologin.Repositories.AccountRepository;
import project.school.rotmgautologin.Repositories.PassFailAccountsRepository;

@RestController
public class AccountController {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    PassFailAccountsRepository passFailAccountsRepository;

    @PostMapping("/submitAccount")
    private RealmAccount submitAccount(@RequestBody RealmAccount realmAccount){
        accountRepository.save(realmAccount);
        return accountRepository.findById(realmAccount.username).get();
    }

    @GetMapping("/getLoginStatus")
    private PassFailAccounts getLoginStatus(){
        return passFailAccountsRepository.findById("0").get();
    }

    @GetMapping("/deleteAll")
    private void deleteAll(){
        accountRepository.deleteAll();
    }
}
