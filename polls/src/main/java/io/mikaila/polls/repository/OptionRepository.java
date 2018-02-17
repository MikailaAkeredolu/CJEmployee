package io.mikaila.polls.repository;

import io.mikaila.polls.domain.Option;
import org.springframework.data.repository.CrudRepository;

public interface OptionRepository extends CrudRepository<Option, Long> {
}
