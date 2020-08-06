package com.tinysnow.mappers;

import com.tinysnow.bean.Candidate;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import java.util.List;

/**
 * @author TinySnow
 */
@Component
public interface CandidateMapper {

    /**
     *
     * @return
     */

    List<Candidate> queryAllInfoOfACandidate();

    /**
     *
     * @param projectId
     * @param candidateName
     */
    int receivedAVote(@Param("projectId") int projectId,
                      @Param("candidateName") String candidateName);
}
