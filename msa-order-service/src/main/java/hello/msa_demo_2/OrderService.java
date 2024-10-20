package hello.msa_demo_2;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${app.rabbitmq.exchange}")
    private String exchange;

    @Value("${app.rabbitmq.routing-key}")
    private String routingKey;

    public void sendPaymentRequest(OrderRequest orderRequest) {
        // 주문 정보를 큐에 전송
        rabbitTemplate.convertAndSend(exchange, routingKey, orderRequest);
        System.out.println("Payment request sent to queue: " + orderRequest);
    }
}
