package pdp.uz.template;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

@MappedSuperclass
@Setter
@Getter
public abstract class AbsUUIDEntity extends AbsMainEntity{

    @Id
    @GeneratedValue(generator = "uuid2")
    @Type(type = "org.hibernate.PostgresUUIDType")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;
}
