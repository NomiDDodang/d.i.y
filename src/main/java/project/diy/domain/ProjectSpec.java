package project.diy.domain;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import io.swagger.v3.core.util.Json;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import project.diy.domain.dto.SpecInfo;

import java.util.Date;
import java.util.Map;

@Entity
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table (name = "project_spec")
public class ProjectSpec {

    @Id
    @Column(name = "project_id")
    String projectId;

    @Type(JsonType.class)
    @Column(name = "spec_info")
    SpecInfo specInfo;

    @Column(name = "last_saved_date")
    Date lastSavedDate;



}
