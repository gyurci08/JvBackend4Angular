package hu.jandzsogyorgy.spring_db_backend.service.mapping;

/**
 * DTO -> entity mapper
 *
 * @param <E>Entity
 * @param <D>DTO
 */
public interface EntityMapper<E, D> {

    E toEntity(D dto);
}
