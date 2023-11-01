package spring6di.spring6di.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Profile({"dev","default"})
@Service
public class EnvironmentServiceImplDev implements EnvironmentService {
    @Override
    public String data() {
        return "dev";
    }
}
