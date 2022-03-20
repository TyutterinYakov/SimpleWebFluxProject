package com.example.service;

import com.example.domain.Person;
import com.example.repository.PersonRepository;
import com.example.util.PersonCreator;
import io.netty.util.concurrent.BlockingOperationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import reactor.blockhound.BlockHound;
import reactor.core.scheduler.Schedulers;

import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

//@ExtendWith(SpringExtension.class)
public class PersonServiceTest {

//    @InjectMocks
//    private PersonService personService;
//
//    @Mock
//    private PersonRepository personDaoMock;
//
//    private final Person person = PersonCreator.createValidPerson();
//
//    @BeforeAll
//    public static void blockHoundSetup(){
//        BlockHound.install();
//    }
//
//    @Test
//    public void blockHoundWorks() {
//        try {
//            FutureTask<?> task = new FutureTask<>(() -> {
//                Thread.sleep(0);
//                return "";
//            });
//            Schedulers.parallel().schedule(task);
//            task.get(10, TimeUnit.SECONDS);
//            Assertions.fail("should fail");
//        } catch(Exception ex){
//            Assertions.assertTrue(ex.getCause() instanceof BlockingOperationException);
//        }
//    }

}
