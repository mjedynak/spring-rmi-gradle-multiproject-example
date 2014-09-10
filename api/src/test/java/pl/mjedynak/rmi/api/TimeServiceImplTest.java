package pl.mjedynak.rmi.api;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TimeServiceImplTest {

    private TimeService timeService = new TimeServiceImpl();

    @Test
    public void shouldGetTime() {
        assertThat(timeService.getCurrentTime(), is(instanceOf(LocalDateTime.class)));
    }

}