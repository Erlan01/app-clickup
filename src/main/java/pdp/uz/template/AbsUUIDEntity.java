package pdp.uz.template;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

@MappedSuperclass
@EqualsAndHashCode(callSuper = true)
@Data
public abstract class AbsUUIDEntity extends AbsMainEntity{

    @Id
    @GeneratedValue(generator = "uuid2")
    @Type(type = "org.hibernate.PostgresUUIDType")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;
}
