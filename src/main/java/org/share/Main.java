package org.share;

import org.share.domain.Position;
import org.share.domain.Share;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@SpringBootApplication
public class Main {

    private List<Position> openPositions = new ArrayList();
    @RequestMapping("/")
    String home() {
        return "Your Open positions: " + openPositions.stream().mapToDouble(f -> f.getQuantity()).sum();
    }

    @GetMapping("/share/delivery/{ric}/{quantity}/{price}")
    @ResponseBody
    public String getShareDelivery(@PathVariable String ric, @PathVariable Integer quantity, @PathVariable BigDecimal price) {
        Position position = new Position(new Share(ric), quantity, price);
        openPositions.add(position);
        return "New Position Open: " + position;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}