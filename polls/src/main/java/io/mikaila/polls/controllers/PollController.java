package io.mikaila.polls.controllers;
import io.mikaila.polls.domain.Poll;
import io.mikaila.polls.exception.ResourceNotFoundException;
import io.mikaila.polls.repository.PollRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import javax.inject.Inject;
import javax.validation.Valid;
import java.net.URI;

@RestController
public class PollController{

@Inject
 private PollRepository pollRepository;

    protected void verifyPoll(Long pollId) throws ResourceNotFoundException {
        Poll poll = pollRepository.findOne(pollId);
        if(poll == null) {
            throw new ResourceNotFoundException("Poll with id " + pollId + "not found");
        }
    }

     @RequestMapping(value = "/polls", method = RequestMethod.GET)
     public ResponseEntity<Iterable<Poll>>getAllPolls(){
      Iterable<Poll> allPolls = pollRepository.findAll();
      return new ResponseEntity<>(allPolls, HttpStatus.OK);
     }


     @RequestMapping(value = "/polls", method = RequestMethod.POST)
 public ResponseEntity<?> createPoll(@Valid @RequestBody Poll poll){
      poll = pollRepository.save(poll);
      //set the location header
      HttpHeaders responseHeaders = new HttpHeaders();
      URI newPollUri = ServletUriComponentsBuilder
                       .fromCurrentRequest()
                       .path("/{id}")
                       .buildAndExpand(poll.getId())
                       .toUri();
      responseHeaders.setLocation(newPollUri);
      return new ResponseEntity<>(null, responseHeaders, HttpStatus.CREATED);
     }


     @RequestMapping(value = "/polls/{pollId}", method = RequestMethod.GET)
    public ResponseEntity<?>getPoll(@PathVariable Long pollId){
         Poll p = pollRepository.findOne(pollId);
        verifyPoll(pollId);
         return new ResponseEntity<>(p, HttpStatus.OK);
     }

     @RequestMapping(value = "/polls/{pollId}", method = RequestMethod.PUT)
    public ResponseEntity<?>updatePoll(@RequestBody Poll poll, @PathVariable Long pollId){
         verifyPoll(pollId);
         Poll p = pollRepository.save(poll);
         return new ResponseEntity<>(p,HttpStatus.OK);
     }

     @RequestMapping(value = "/polls/{pollId}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deletePoll(@PathVariable Long pollId){
         verifyPoll(pollId);
         pollRepository.delete(pollId);
    return new ResponseEntity<>(HttpStatus.OK);
     }

}
