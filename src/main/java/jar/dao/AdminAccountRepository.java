package jar.dao;

import jar.entity.AdminAccount;
import org.springframework.data.repository.CrudRepository;

public interface AdminAccountRepository extends CrudRepository <AdminAccount, Long> {

    public AdminAccount findByAdminName(String adminName);

}
