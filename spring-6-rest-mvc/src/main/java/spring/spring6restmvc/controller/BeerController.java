package spring.spring6restmvc.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.spring6restmvc.model.Beer;
import spring.spring6restmvc.service.BeerService;

import java.util.List;
import java.util.UUID;

@Slf4j
@RestController                         //We need to modify this as well RestController is used for REST APIs
//@AllArgsConstructor
@RequestMapping("/api/v1/beer")      // This is a global Requestmapping
public class BeerController {

    private final BeerService beerService;

    // Constructor Injection either we use like below or @AllArgsConstructor
    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }
    //==================================================================================================
    // FOR list Beers and that uses the global endpoint - https://localhost:8080/api/v1/beer
    @RequestMapping(method = RequestMethod.GET)
    public List<Beer> listBeers(){
        return beerService.listBeers();
    }

    //==================================================================================================

    // FOR getBeerById - https://localhost:8080/api/v1/beer/{beerId}
    @RequestMapping(value = "{beerId}",method = RequestMethod.GET)
    public Beer getBeerById(@PathVariable("beerId") UUID beerId){
        log.debug("I am inside controller");
        return beerService.getBearById(beerId);
    }

    //==================================================================================================

    @PostMapping
    //@RequestMapping(method = RequestMethod.POST) // we can use this as well or above @PostMapping
    public ResponseEntity handlePost(@RequestBody Beer beer){

        Beer savedBeer = beerService.saveNewBeer(beer);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/beer/" + savedBeer.getId().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }
    //==================================================================================================

    @PatchMapping("{beerId}")
    public ResponseEntity updateBeerPatchById(@PathVariable("beerId")UUID beerId, @RequestBody Beer beer){

        beerService.patchBeerById(beerId, beer);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    //==================================================================================================
    @DeleteMapping("{beerId}")
    public ResponseEntity deleteById(@PathVariable("beerId") UUID beerId){

        beerService.deleteById(beerId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    //==================================================================================================
    @PutMapping("{beerId}")
    public ResponseEntity updateById(@PathVariable("beerId")UUID beerId, @RequestBody Beer beer){

        beerService.updateBeerById(beerId, beer);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    //==================================================================================================
}
