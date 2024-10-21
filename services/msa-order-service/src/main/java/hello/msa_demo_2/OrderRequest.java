package hello.msa_demo_2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest {
    private Long productId;
    private int quantity;
}
