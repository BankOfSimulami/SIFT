package xyz.stoneworkssift.gateway.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xyz.stoneworkssift.library.json.interaction.Interaction;

@RestController
@RequestMapping("/interaction/{bid}")
public class InteractionController {

    @PostMapping
    public ResponseEntity<HttpStatus> receive(@PathVariable("bid") String bid, @RequestBody Interaction resource) {
        System.out.println(bid);
        System.out.println(resource);
        return ResponseEntity.ok(HttpStatus.OK);
    }

}
