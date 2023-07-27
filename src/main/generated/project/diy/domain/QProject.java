package project.diy.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QProject is a Querydsl query type for Project
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProject extends EntityPathBase<Project> {

    private static final long serialVersionUID = 1630826846L;

    public static final QProject project = new QProject("project");

    public final DateTimePath<java.util.Date> projectCreatedDate = createDateTime("projectCreatedDate", java.util.Date.class);

    public final StringPath projectDescription = createString("projectDescription");

    public final StringPath projectId = createString("projectId");

    public final DateTimePath<java.util.Date> projectModifiedDate = createDateTime("projectModifiedDate", java.util.Date.class);

    public final StringPath projectName = createString("projectName");

    public final StringPath projectPassword = createString("projectPassword");

    public QProject(String variable) {
        super(Project.class, forVariable(variable));
    }

    public QProject(Path<? extends Project> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProject(PathMetadata metadata) {
        super(Project.class, metadata);
    }

}

