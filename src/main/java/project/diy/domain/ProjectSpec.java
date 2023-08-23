package project.diy.domain;

import io.hypersistence.utils.hibernate.type.json.JsonType;
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

import java.util.Date;

@Entity
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table (name = "project_spec")
public class ProjectSpec {

    @Id
    @Column(name = "project_id")
    private String projectId;

    @Type(JsonType.class)
    @Column(name = "spec_info")
    private SpecInfo specInfo;

    @Column(name = "is_published")
    private Boolean isPublished;

    @Column(name = "last_saved_date")
    private Date lastSavedDate;

    @Column (name = "last_saved_user")
    private String memberId;

}
