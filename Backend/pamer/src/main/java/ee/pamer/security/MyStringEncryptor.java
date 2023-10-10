package ee.pamer.security;

import org.jasypt.encryption.StringEncryptor;
import org.jasypt.exceptions.EncryptionOperationNotPossibleException;
import org.jasypt.util.text.BasicTextEncryptor;
import org.springframework.stereotype.Component;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

@Component
public class MyStringEncryptor implements StringEncryptor {

    private final BasicTextEncryptor delegate;


    public String encryptProperty(String property, String secretKey) {
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword(secretKey);
        return encryptor.encrypt(property);
    }

    public String decryptProperty(String encryptedProperty, String secretKey) {
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword(secretKey);
        return encryptor.decrypt(encryptedProperty);
    }


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
