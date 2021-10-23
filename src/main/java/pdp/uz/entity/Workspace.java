package pdp.uz.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pdp.uz.template.AbsLongEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Workspace extends AbsLongEntity {

    @Column(nullable = false)
    private String name;

    private String color;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private User owner;

    @Column(nullable = false)
    private String initialLetter;

    @ManyToOne(fetch = FetchType.LAZY)
    private Attachment avatar;
}
