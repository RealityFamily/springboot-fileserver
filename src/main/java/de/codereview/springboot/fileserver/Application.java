package de.codereview.springboot.fileserver;

import de.codereview.springboot.fileserver.service.web.FileController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application
{
	private static final Logger log = LoggerFactory.getLogger(FileController.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
