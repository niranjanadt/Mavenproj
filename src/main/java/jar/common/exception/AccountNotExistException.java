package jar.common.exception;

import jar.util.AppUtil;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public class AccountNotExistException extends UsernameNotFoundException {

    public AccountNotExistException() {
        super(AppUtil.getMessage("accountNotExistException"));
    }

    public AccountNotExistException(String msg) {
        super(msg);
    }
}
