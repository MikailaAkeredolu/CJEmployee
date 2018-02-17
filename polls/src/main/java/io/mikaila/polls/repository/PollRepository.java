package io.mikaila.polls.repository;
import io.mikaila.polls.domain.Poll;

import org.springframework.data.repository.CrudRepository;

public interface PollRepository extends CrudRepository<Poll, Long> {

}
