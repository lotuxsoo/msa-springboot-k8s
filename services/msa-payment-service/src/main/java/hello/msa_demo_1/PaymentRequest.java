package hello.msa_demo_1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentRequest {
    private Long orderId; // 주문 ID
    private Long productId; // 상품 ID
    private int amount;
}
