package umc.spring.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMission is a Querydsl query type for Mission
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMission extends EntityPathBase<Mission> {

    private static final long serialVersionUID = -453449888L;

    public static final QMission mission = new QMission("mission");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<umc.spring.domain.mapping.MemberMission, umc.spring.domain.mapping.QMemberMission> memberMissionList = this.<umc.spring.domain.mapping.MemberMission, umc.spring.domain.mapping.QMemberMission>createList("memberMissionList", umc.spring.domain.mapping.MemberMission.class, umc.spring.domain.mapping.QMemberMission.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> point = createNumber("point", Integer.class);

    public final EnumPath<umc.spring.domain.Enums.MissionStatus> status = createEnum("status", umc.spring.domain.Enums.MissionStatus.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMission(String variable) {
        super(Mission.class, forVariable(variable));
    }

    public QMission(Path<? extends Mission> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMission(PathMetadata metadata) {
        super(Mission.class, metadata);
    }

}

