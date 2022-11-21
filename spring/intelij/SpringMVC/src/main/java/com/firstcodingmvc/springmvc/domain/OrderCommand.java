package com.firstcodingmvc.springmvc.domain;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class OrderCommand {

    private List<OrderItem> orderItems;
    private Address address;

}
