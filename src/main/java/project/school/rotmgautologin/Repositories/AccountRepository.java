package project.school.rotmgautologin.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import project.school.rotmgautologin.Models.RealmAccount;

@Repository
public interface AccountRepository extends CrudRepository<RealmAccount, String> {}

