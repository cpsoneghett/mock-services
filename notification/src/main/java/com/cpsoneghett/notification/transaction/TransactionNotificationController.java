package com.cpsoneghett.notification.transaction;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("notification")
public class TransactionNotificationController {


    @PostMapping
    public ResponseEntity<TransactionDTO> notifyTransaction(@RequestBody TransactionDTO transaction) {
        return ResponseEntity.ok().body(transaction);
    }
}
