package project.diy.domain.dto.response_message_dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class ProjectIdDuplicateResponseDto {
    private boolean isDuplicatedId;
}
