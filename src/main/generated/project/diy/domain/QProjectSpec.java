package project.diy.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QProjectSpec is a Querydsl query type for ProjectSpec
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProjectSpec extends EntityPathBase<ProjectSpec> {

    private static final long serialVersionUID = -454558151L;

    public static final QProjectSpec projectSpec = new QProjectSpec("projectSpec");

    public final NumberPath<Integer> actBookmark = createNumber("actBookmark", Integer.class);

    public final NumberPath<Integer> actChat = createNumber("actChat", Integer.class);

    public final NumberPath<Integer> actComment = createNumber("actComment", Integer.class);

    public final NumberPath<Integer> actContent = createNumber("actContent", Integer.class);

    public final NumberPath<Integer> actMessage = createNumber("actMessage", Integer.class);

    public final NumberPath<Integer> actSubscribe = createNumber("actSubscribe", Integer.class);

    public final NumberPath<Integer> funcAllim = createNumber("funcAllim", Integer.class);

    public final NumberPath<Integer> funcSearch = createNumber("funcSearch", Integer.class);

    public final NumberPath<Integer> funcSort = createNumber("funcSort", Integer.class);

    public final DateTimePath<java.util.Date> latestSavedDate = createDateTime("latestSavedDate", java.util.Date.class);

    public final StringPath projectId = createString("projectId");

    public final NumberPath<Integer> userGubun = createNumber("userGubun", Integer.class);

    public final NumberPath<Integer> userInfo = createNumber("userInfo", Integer.class);

    public final NumberPath<Integer> userLogin = createNumber("userLogin", Integer.class);

    public final NumberPath<Integer> userRegister = createNumber("userRegister", Integer.class);

    public QProjectSpec(String variable) {
        super(ProjectSpec.class, forVariable(variable));
    }

    public QProjectSpec(Path<? extends ProjectSpec> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProjectSpec(PathMetadata metadata) {
        super(ProjectSpec.class, metadata);
    }

}

