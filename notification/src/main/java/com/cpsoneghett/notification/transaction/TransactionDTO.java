package com.cpsoneghett.notification.transaction;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record TransactionDTO(Long idTransaction,
                             Long payer,
                             Long payee,
                             BigDecimal value,
                             LocalDateTime createdAt,
                             TransactionStatus status) {
}
