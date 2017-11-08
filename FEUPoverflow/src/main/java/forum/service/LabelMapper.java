package forum.service;

import forum.domain.Label;
import forum.domain.Pub;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface LabelMapper {

    LabelMapper INSTANCE = Mappers.getMapper( LabelMapper.class );

    Label toLabel(LabelDTO label);
    @InheritInverseConfiguration
    Label fromLabel(Label label);

    List<LabelDTO> labelToLabelDtos(List<Label> labels);
}
