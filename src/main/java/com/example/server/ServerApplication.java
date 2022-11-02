package com.example.server;

import com.example.server.enumeration.Status;
import com.example.server.model.Server;
import com.example.server.repo.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.example.server.enumeration.Status.SERVER_DOWN;
import static com.example.server.enumeration.Status.SERVER_UP;

@SpringBootApplication
public class ServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(ServerApplication.class, args);

    }
@Bean
    CommandLineRunner run(ServerRepo serverRepo) {
        return args -> {
            serverRepo.save(new Server(null,"192.168.1.160","Linux","16 gb","personal computer",
					"http://localhost:8080/server/image/server01.png", SERVER_UP));
            System.out.println("1");
			serverRepo.save(new Server( null,"192.168.1.161","Windows","16 gb","personal computer",
					"http://localhost:8080/server/image/server02.png", SERVER_DOWN));
            System.out.println("2");
			serverRepo.save(new Server( null,"192.168.1.162","Mac","32 gb","web server",
					"http://localhost:8080/server/image/server03.png", SERVER_UP));
			serverRepo.save(new Server( null,"192.168.1.163","Enterprice linux","16 gb","personal computer",
					"http://localhost:8080/server/image/server04.png", SERVER_DOWN));
        };
    }
}


