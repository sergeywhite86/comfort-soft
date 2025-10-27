package org.sergey_white.comfortsofttask.controller;


import org.sergey_white.comfortsofttask.service.FindNumberService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/numbers")
public class FindNumberController {

    private final FindNumberService service;

    public FindNumberController(FindNumberService findNumberService) {
        this.service = findNumberService;
    }

    @GetMapping("/find-Nth-min")
    public int findNthMin(@RequestParam String filePath, @RequestParam int n) throws Exception {
        return service.findNthMinNumber(filePath, n);
    }

}
