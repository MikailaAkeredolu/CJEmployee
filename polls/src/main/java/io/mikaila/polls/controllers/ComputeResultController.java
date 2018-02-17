package io.mikaila.polls.controllers;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import io.mikaila.polls.domain.Vote;
import io.mikaila.polls.dto.OptionCount;
import io.mikaila.polls.dto.VoteResult;
import io.mikaila.polls.repository.VoteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class ComputeResultController {

    @Inject
    private VoteRepository voteRepository;

    @RequestMapping(value = "/computeresult", method = RequestMethod.GET)
    public ResponseEntity<?> computeResult(@RequestParam Long pollId){
        VoteResult voteResult = new VoteResult();
        Iterable<Vote> allVotes = voteRepository.findByPoll(pollId);
        //Algorithm to count votes
        int totalVotes = 0;
        Map<Long, OptionCount>tempMap = new HashMap<>();
        for(Vote v : allVotes){
            totalVotes++;
            //get the option count corresponding to this option
            OptionCount optionCount = tempMap.get(v.getOption().getId());
            if(optionCount == null){
                optionCount = new OptionCount();
                optionCount.setOptionId(v.getOption().getId());
                tempMap.put(v.getOption().getId(), optionCount);
            }
            optionCount.setCount(optionCount.getCount()+1);
        }

        voteResult.setTotalVotes(totalVotes);
        voteResult.setResults(tempMap.values());
        return new ResponseEntity<>(voteResult, HttpStatus.OK);
    }










}
