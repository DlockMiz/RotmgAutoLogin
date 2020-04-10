package project.school.rotmgautologin.Models.LoginResponse;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.ArrayList;

@RedisHash("PassFailAccounts")
public class PassFailAccounts {

    @Id public int id;
    public ArrayList<Chars> passed = new ArrayList<>();
    public ArrayList<String> failed = new ArrayList<>();
}
