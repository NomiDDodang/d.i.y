package project.diy.domain.dto;

import io.swagger.v3.core.util.Json;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SpecInfo extends Json {

    String id;
    String name;
    SpecInfo[] children;


}
