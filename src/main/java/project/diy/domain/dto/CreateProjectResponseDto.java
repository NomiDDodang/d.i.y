package project.diy.domain.dto;

public class CreateProjectResponseDto {

    public String isDuplicate() {
        String responseMessage;
        responseMessage = "projectId is already existed";
        return responseMessage;
    }


}
