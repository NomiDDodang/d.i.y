package project.diy.domain.dto.response_message_dto;

public class CreateProjectResponseDto {

    public String isDuplicate() {
        String responseMessage;
        responseMessage = "projectId is already existed";
        return responseMessage;
    }


}
