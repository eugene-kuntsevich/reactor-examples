package com.example.reactorexamples;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

public class FluxJustTest {
    @Test
    void testFluxJust() {
        Flux<String> just = Flux.just("test1", "test2")
                .map(String::toUpperCase);

        StepVerifier.create(just)
                .expectNext("TEST1")
                .expectNext("TEST2")
                .verifyComplete();
    }
}
