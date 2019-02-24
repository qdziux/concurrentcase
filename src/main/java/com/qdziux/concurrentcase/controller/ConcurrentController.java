package com.qdziux.concurrentcase.controller;

import com.qdziux.concurrentcase.controller.state.StateDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author AssecoBS
 * @version $Id: ConcurrentController.java 24.02.19 ankaras@ABS.ASSECOBS.PL $
 */
@RestController
@RequestMapping("concurrent")
@Slf4j
public class ConcurrentController {

    @GetMapping(value = "/currentstate")
    public StateDTO state() {
        return StateDTO.create(50);
    }
}
