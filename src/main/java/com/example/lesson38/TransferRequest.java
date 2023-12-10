package com.example.lesson38;

import java.math.BigDecimal;

public class TransferRequest {

    private long senderId;
    private long receiveId;
    private BigDecimal amount;

    public long getSenderId() {
        return senderId;
    }

    public void setSenderId(long senderId) {
        this.senderId = senderId;
    }

    public long getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(long receiveId) {
        this.receiveId = receiveId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
