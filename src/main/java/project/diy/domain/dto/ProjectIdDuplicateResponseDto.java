package project.diy.domain.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor
public class ProjectIdDuplicateResponseDto {
    public boolean isDuplicatedId;
}
