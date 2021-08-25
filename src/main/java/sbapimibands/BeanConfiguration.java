package sbapimibands;

import br.com.mibands.BandaRepositoryPort;
import br.com.mibands.BandaService;
import br.com.mibands.BandaServicePort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    BandaRepositoryPort bandaRepositoryPort() {
        return new BandaRepositoryImpl();
    }

    @Bean
    BandaServicePort bandaServicePort() {
        return new BandaService(bandaRepositoryPort());
    }
}
