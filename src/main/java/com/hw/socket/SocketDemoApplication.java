package com.hw.socket;

import com.hw.socket.service.ServerByNetty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hongwen
 */
@SpringBootApplication
public class SocketDemoApplication implements CommandLineRunner {

    @Autowired
    ServerByNetty serverByNetty;

    public static void main(String[] args) {
        SpringApplication.run(SocketDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        serverByNetty.startServer();
    }
}
