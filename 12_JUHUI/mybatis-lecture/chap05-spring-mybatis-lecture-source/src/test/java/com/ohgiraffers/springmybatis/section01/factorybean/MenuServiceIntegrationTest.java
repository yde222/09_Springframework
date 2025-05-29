package com.ohgiraffers.springmybatis.section01.factorybean;

/* 통합 테스트
* 실제 스프링 컨텍스트를 로딩하여 MenuService 의 전체 동작(실제 DB와 연동 및 비즈니스 로직 적용)
* 을 검증하는 테스트
* */

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest // 스프링 부트의 전체 컨텍스트를 로딩
@ActiveProfiles("test") // 테스트 실행 시에 application-test.yml 설정을 사용
@Transactional // 테스트 완료 후 DB에 반영된 변경사항을 롤백
@Sql(statements = {
        "INSERT INTO tbl_menu(menu_name, menu_price, category_code, orderable_status) " +
                "VALUES ('김치찌개', 8000, 1, 'Y')",
        "INSERT INTO tbl_menu(menu_name, menu_price, category_code, orderable_status) " +
                "VALUES ('된장찌개', 9000, 2, 'Y')",
        "INSERT INTO tbl_menu(menu_name, menu_price, category_code, orderable_status) " +
                "VALUES ('비빔밥', 10000, 3, 'N')"
})
public class MenuServiceIntegrationTest {

    @Autowired
    private MenuService menuService; // 필드 주입

    @Test
    private void testFindAllMenuByOrderableStatus_Orderable() {

        // given
        
    }
}
