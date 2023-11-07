package spring.spring6restmvc.service;

import org.springframework.stereotype.Service;
import spring.spring6restmvc.model.Beer;

import java.util.List;
import java.util.UUID;



// Interface
public interface BeerService {

    Beer getBearById(UUID id);

    List<Beer> listBeers();

    Beer saveNewBeer(Beer beer);

    void updateBeerById(UUID beerId, Beer beer);

    void deleteById(UUID beerId);

    void patchBeerById(UUID beerId, Beer beer);
}
