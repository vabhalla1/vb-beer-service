package vb.springframework.vbbeerservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Created by SAP_ALL  on 1/19/2020  10:24 AM
 */

@Slf4j
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BeerDto {
    private UUID id;
    private Integer version;

    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;

    private String name;

    private BeerStyleEnum beerStyleEnum;

    private  Long upc;
    private BigDecimal price;
    private Integer quantityOnHand;
}
