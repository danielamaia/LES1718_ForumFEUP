package forum.service;

import forum.domain.Student;
import forum.domain.Vote;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface VoteMapper {

    VoteMapper INSTANCE = Mappers.getMapper( VoteMapper.class );

    Vote toVote(VoteDTO vote);
    @InheritInverseConfiguration
    VoteDTO fromVote(Vote vote);

    List<VoteDTO> votesToVoteDtos(List<Vote> votes);
}
