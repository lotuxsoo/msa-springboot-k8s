package hello.msa_demo_1;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @RabbitListener(queues = "${app.rabbitmq.queue}")
    public void processPayment(OrderRequest orderRequest) {
        // 결제 처리 로직
        System.out.println("Processing payment for order: " + orderRequest);
        // 결제 완료 로직
    }
}
