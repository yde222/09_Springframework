package com.ohgiraffers.transaction.service;

import com.ohgiraffers.transaction.domain.Order;
import com.ohgiraffers.transaction.dto.OrderDTO;
import com.ohgiraffers.transaction.dto.OrderMenuDTO;
import com.ohgiraffers.transaction.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderService {

    private final OrderMapper orderMapper;

    public OrderService(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    /* 주문 등록 기능 메소드
    * Controller에서 넘어온 DTO를 도메인 모델로 변환 후
    * 주문 정보 (tbl_order)와 주문별 메뉴 정보 (tbl_order_menu)를
    * 하나의 트랜잭션으로 처리한다.
    *  */

    public void regiseOrder(OrderDTO orderDTO, List<OrderMenuDTO> orderMenuDTOs) {
        // DTO -> Domain 변환 (OrderDTO -> Order)
        Order order = new Order();
        order.setOrderDate(orderDTO.getOrderDate());
        order.setOrderTime(orderDTO.getOrderTime());
        order.setToo

    }
}
