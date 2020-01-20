package vb.springframework.vbbeerservice.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vb.springframework.vbbeerservice.web.model.BeerDto;

import java.util.UUID;

/**
 * Created by SAP_ALL  on 1/20/2020  3:44 PM
 */

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId) {
        // ToDo Impl
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto) {
        // ToDo Impl
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto) {
        // ToDo Impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
