package com.example;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator{

    @Override
    public Health health() {
       if(isConditionMet()){
        return Health.up().build();
       }

        return Health.down().withDetail("reason", "custom condition not met").build();
    }

    private boolean isConditionMet()
    {
        ///
        return true;
    }
}
