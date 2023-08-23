package project.diy.json_resources;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonSyntaxException;
import org.springframework.core.io.ClassPathResource;
import project.diy.domain.SpecInfo;

import java.io.File;
import java.io.IOException;


public class ConvertJsonResources {

//    public SpecificationDto getJsonSchemaConvert() throws JsonSyntaxException {
//        return new Gson().fromJson(getJsonString(), SpecificationDto.class);
//    }
//
//    private String getJsonString() {
//        try {
//            File file = new ClassPathResource("specification.json").getFile();
//            InputStream in = new FileInputStream(file);
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
//            StringBuilder sb = new StringBuilder();
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                sb.append(line).append("\n");
//            }
//            bufferedReader.close();
//            in.close();
//            return sb.toString();
//
//        } catch (IOException exception) {
//            exception.getStackTrace();
//        }
//
//        return "";
//    }
//

    public String specificationDto() throws JsonSyntaxException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File file;
        file = new ClassPathResource("specification.json").getFile();
        SpecInfo specInfo = objectMapper.readValue(file, SpecInfo.class);
        return specInfo.toString();

    }

}
