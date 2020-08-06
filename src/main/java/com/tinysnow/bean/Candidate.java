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
public class Candidate {
    private int candidateId;
    private int projectId;
    private String candidateName;
    private String describeMsg;
    private int voteNumber;
}
