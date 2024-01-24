package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {

    /*
    Qualifer의 우선 순위가 Primary 보다 높다
    하지만 @Qualifier를 붙여줘야하기 때문에
    범용적으로 사용하는 것은 Primary, 지역적으로 사용되는 것은 Qualifier를 사용하는게 좋다
    스프링에서 같은 역할을 하는 에노테이션은 범위가 좁은게 우선순위가 보통 높다
     */
    @Autowired
    @Qualifier("pizza")
    Food food;


    @Test
    @DisplayName("테스트")
    void test1(){
        food.eat();
    }
}
