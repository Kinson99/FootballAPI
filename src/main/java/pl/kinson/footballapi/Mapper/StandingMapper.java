package pl.kinson.footballapi.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StandingMapper {
    StandingMapper STANDING_MAPPER = Mappers.getMapper(StandingMapper.class);


}