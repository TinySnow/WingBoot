package com.tinysnow.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author TinySnow
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Judge {
    private int judgeId;
    private String projectId;
    private String judgeName;
    private String judgePwd;
}
