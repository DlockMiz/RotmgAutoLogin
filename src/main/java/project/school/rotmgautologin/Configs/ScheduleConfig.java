package project.school.rotmgautologin.Configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import project.school.rotmgautologin.Controllers.RotmgController;

@Configuration
@EnableScheduling
public class ScheduleConfig {

    @Autowired
    RotmgController realm;

    @Scheduled(cron="0 */12 * * * *")
    public void loginAccount(){
        realm.loginRealmAccounts();
    }

//    @Scheduled(cron="* * * * * *")
//    public void test(){
//        realm.loginRealmAccounts();
//    }
}
