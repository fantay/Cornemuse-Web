package streaming.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import streaming.entity.Film;
import streaming.entity.Serie;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-03T13:40:10")
@StaticMetamodel(Genre.class)
public class Genre_ { 

    public static volatile ListAttribute<Genre, Film> films;
    public static volatile ListAttribute<Genre, Serie> series;
    public static volatile SingularAttribute<Genre, Long> id;
    public static volatile SingularAttribute<Genre, String> nom;

}