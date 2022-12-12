package vvashkolup.spring.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import vvashkolup.spring.core.config.GameConfig;

@Slf4j
public class Main {

    public static void main(String[] args) {
        log.info("Guess the Number game");

        ConfigurableApplicationContext context =
                new AnnotationConfigApplicationContext(GameConfig.class);

        context.close();

    }
}
