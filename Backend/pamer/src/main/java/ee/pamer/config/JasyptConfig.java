package ee.pamer.config;

import ee.pamer.security.MyStringEncryptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JasyptConfig<StringEncryptor> {

    @Bean("jasyptStringEncryptor")
    public StringEncryptor stringEncryptor() {
        return (StringEncryptor) new MyStringEncryptor("BC67B74DB69EA69FC31337DEC1AF5");
    }
}
