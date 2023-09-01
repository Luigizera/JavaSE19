package github.lugom.Interface.entities;

public class PaypalService implements OnlinePaymentService{

    public PaypalService(){}
    @Override
    public Double payment(Double amount) {
        return amount + (amount * 0.02);
    }

    @Override
    public Double fees(Double amount, Integer months) {
        return amount + (amount * (0.01 * months));
    }
}
