package com.jarfans.solo.project.based.on.jypfans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SoloProjectBasedOnJypfansApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoloProjectBasedOnJypfansApplication.class, args);
	}

}
