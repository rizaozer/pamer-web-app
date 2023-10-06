package ee.pamer.security;

import org.jasypt.encryption.StringEncryptor;
import org.jasypt.exceptions.EncryptionOperationNotPossibleException;
import org.jasypt.util.text.BasicTextEncryptor;
import org.springframework.stereotype.Component;

@Component
public class MyStringEncryptor implements StringEncryptor {

    private final BasicTextEncryptor delegate;

    public MyStringEncryptor(String secretKey) {
        delegate = new BasicTextEncryptor();
        delegate.setPassword(secretKey);
    }

    @Override
    public String encrypt(String message) throws EncryptionOperationNotPossibleException {
        return delegate.encrypt(message);
    }

    @Override
    public String decrypt(String encryptedMessage) throws EncryptionOperationNotPossibleException {
        return delegate.decrypt(encryptedMessage);
    }
}
