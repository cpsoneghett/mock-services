package com.cpsoneghett.authorizer.transaction;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("authorizer")
public class TransactionAuthorizerController {

    @GetMapping
    public ResponseEntity<TransactionResponse> authorize() throws InterruptedException {
        Random random = new Random();

        var num = random.nextInt(3);

        var response = switch (num) {
            case 0 -> ResponseEntity.ok().body(new TransactionResponse("Authorized"));
            case 1 -> ResponseEntity.ok().body(new TransactionResponse("Unauthorized"));
            case 2 -> {
                // Thread.sleep(5000);
                yield ResponseEntity.ok().body(new TransactionResponse("Authorized"));
            }
            default -> ResponseEntity.internalServerError().body(new TransactionResponse("Error"));
        };


        return response;
    }
}