package hello.msa_demo_1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest {
    private Long productId;
    private int quantity;
}
