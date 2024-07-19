package com.basic.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
// Customer 생성 시 필요한 객체 정보를 넘기기 위한 클래스
public class CreateCustomer {
    private final String name;
    private final String phoneNumber;
    private final String address;
}
