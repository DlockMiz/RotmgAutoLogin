package project.school.rotmgautologin.Controllers;

import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import project.school.rotmgautologin.Models.LoginResponse.Chars;
import project.school.rotmgautologin.Models.LoginResponse.PassFailAccounts;
import project.school.rotmgautologin.Models.RealmAccount;
import project.school.rotmgautologin.Repositories.AccountRepository;
import project.school.rotmgautologin.Repositories.PassFailAccountsRepository;

@Component
public class RotmgController {

    @Autowired
    PassFailAccountsRepository passFailAccountsRepository;

    @Autowired
    AccountRepository accountRepository;

    RestTemplate restTemplate = new RestTemplate();
    XmlMapper xmlMapper;

    PassFailAccounts passFailAccounts;
    String url = "https://realmofthemadgodhrd.appspot.com/char/list";


    public RotmgController(){
        JacksonXmlModule module = new JacksonXmlModule();
        module.setDefaultUseWrapper(false);
        this.xmlMapper = new XmlMapper(module);
    }

    public void loginRealmAccounts(){
        passFailAccounts = new PassFailAccounts();
        accountRepository.findAll().forEach((acc) -> {
            ResponseEntity<String> response = restTemplate.postForEntity(url, acc, String.class);
            mapResponse(response, acc);
        });

        if (passFailAccountsRepository.findAll().spliterator().getExactSizeIfKnown() > 0){passFailAccountsRepository.deleteAll();}
        passFailAccountsRepository.save(passFailAccounts);
    }

    private void mapResponse(ResponseEntity<String> response, RealmAccount acc){
        try{
            Chars chars = xmlMapper.readValue(response.getBody(), Chars.class);
            passFailAccounts.passed.add(chars);
        }catch(Exception e){
            passFailAccounts.failed.add(acc.username);
        }
    }
}
