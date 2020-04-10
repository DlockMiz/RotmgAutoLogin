package project.school.rotmgautologin.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("RealmAccount")
public class RealmAccount {
    @Id public String username;
    public String password;
}
