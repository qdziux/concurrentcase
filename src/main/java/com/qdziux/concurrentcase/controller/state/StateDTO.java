package com.qdziux.concurrentcase.controller.state;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author AssecoBS
 * @version $Id: StateDTO.java 24.02.19 ankaras@ABS.ASSECOBS.PL $
 */
@AllArgsConstructor(staticName = "create")
public class StateDTO {

    @Getter
    private int percentageProgress;
}
