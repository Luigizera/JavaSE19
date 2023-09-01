package github.lugom.Interface.entities;

public interface OnlinePaymentService {

    Double payment(Double amount);

    Double fees(Double amount, Integer months);
}
