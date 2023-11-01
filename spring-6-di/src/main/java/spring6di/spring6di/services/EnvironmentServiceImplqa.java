package spring6di.spring6di.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Profile("qa")
@Service
public class EnvironmentServiceImplqa implements EnvironmentService {
    @Override
    public String data() {
        return "qa";
    }
}
