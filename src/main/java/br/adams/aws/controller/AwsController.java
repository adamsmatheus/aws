package br.adams.aws.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class AwsController {

    private static final Logger LOG = LoggerFactory.getLogger(
            AwsController.class);
    @GetMapping("/dog/{name}")
    public ResponseEntity<?> dogTest(@PathVariable String name) {
        LOG.info("Test controller - name {}", name);
        return ResponseEntity.ok("Name :" + name);
    }

    @GetMapping("/color/color")
    public ResponseEntity<?> dogTest() {
        LOG.info("Welcome back");
        return ResponseEntity.ok("Welcome back");
    }
}
