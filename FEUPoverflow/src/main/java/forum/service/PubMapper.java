package forum.service;

import forum.domain.Pub;
import forum.domain.Student;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PubMapper {

    PubMapper INSTANCE = Mappers.getMapper( PubMapper.class );

    Pub toPub(PubDTO pub);
    @InheritInverseConfiguration
    PubDTO fromPub(Pub pub);

    List<PubDTO> pubsToPubDtos(List<Pub> pubs);
}
