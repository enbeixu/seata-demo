package com.enbei.stock.model;

import lombok.Data;
import lombok.experimental.Accessors;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tab_order")
@Data
@Accessors(chain = true)
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long total;

    private Long productId;

    private Long used;

}
