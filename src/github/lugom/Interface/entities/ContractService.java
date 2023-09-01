package github.lugom.Interface.entities;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(){}
    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public OnlinePaymentService getOnlinePaymentService() {
        return onlinePaymentService;
    }

    public void setOnlinePaymentService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {
        LocalDate contractDate = contract.getDate();
        double contractValueMonths = contract.getTotalValue() / months;
        for(int i = 0; i < months; i++)
        {
            double result = onlinePaymentService.fees(contractValueMonths, i+1);
            result = onlinePaymentService.payment(result);
            contract.addInstallment(new Installment(contractDate.plusMonths(i+1), result));
        }
    }
}
