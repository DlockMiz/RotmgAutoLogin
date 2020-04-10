package project.school.rotmgautologin.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import project.school.rotmgautologin.Models.LoginResponse.PassFailAccounts;

@Repository
public interface PassFailAccountsRepository extends CrudRepository<PassFailAccounts, String> {}
