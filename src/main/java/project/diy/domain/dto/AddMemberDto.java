package project.diy.domain.dto;


import jakarta.persistence.EntityListeners;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
import java.util.List;


@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class AddMemberDto {

    List<String> memberNameList;
    String projectId;


}

