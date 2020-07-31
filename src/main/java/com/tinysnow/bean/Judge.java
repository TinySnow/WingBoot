package com.tinysnow.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ilitt
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Judge {
    private int judgeId;
    private String projectId;
    private String judgeName;
    private String password;
}
