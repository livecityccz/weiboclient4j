package weiboclient4j;

import org.junit.Test;

import static org.junit.Assert.*;
import weiboclient4j.params.Paging;

/**
 * @author Hover Ruan
 */
public class PagingTest {
    @Test
    public void testHasValue() throws Exception {
        Paging paging = Paging.create();

        assertFalse(paging.hasValue());

        paging.count(20);

        assertTrue(paging.hasValue());
    }
}
