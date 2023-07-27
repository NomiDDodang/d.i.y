package project.diy.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QSpec is a Querydsl query type for Spec
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSpec extends EntityPathBase<Spec> {

    private static final long serialVersionUID = -647757930L;

    public static final QSpec spec = new QSpec("spec");

    public final NumberPath<Integer> parentId = createNumber("parentId", Integer.class);

    public final StringPath specDescription = createString("specDescription");

    public final NumberPath<Integer> specId = createNumber("specId", Integer.class);

    public final StringPath specName = createString("specName");

    public QSpec(String variable) {
        super(Spec.class, forVariable(variable));
    }

    public QSpec(Path<? extends Spec> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSpec(PathMetadata metadata) {
        super(Spec.class, metadata);
    }

}

