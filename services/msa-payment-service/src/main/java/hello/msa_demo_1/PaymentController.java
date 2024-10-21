package hello.msa_demo_1;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    // RabbitMQ에서 결제 요청을 처리하는 리스너
    @RabbitListener(queues = "${app.rabbitmq.queue}")
    public void handlePaymentRequest(OrderRequest orderRequest) {
        // PaymentService를 통해 결제 처리 로직을 호출
        paymentService.processPayment(orderRequest);
    }
}
