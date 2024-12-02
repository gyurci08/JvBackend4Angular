package hu.jandzsogyorgy.spring_db_backend.service.mapping;

import java.util.List;
import java.util.stream.Collectors;

/**
 * DTO -> entity mapper
 *
 * @param <E>Entity
 * @param <D>DTO
 */
public interface EntityMapper<D, E> {

    E toEntity(D dto);

}
