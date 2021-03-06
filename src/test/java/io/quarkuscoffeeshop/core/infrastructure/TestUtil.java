package io.quarkuscoffeeshop.core.infrastructure;

import io.quarkuscoffeeshop.core.domain.Order;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class TestUtil {

    /**
     * Provides a Mockito Answer to use when mocking DB inserts
     */
    protected static class AssignIdToEntityAnswer implements Answer<Void> {

        private final String id;

        public AssignIdToEntityAnswer(final String id) {
            this.id = id;
        }

        @Override
        public Void answer(final InvocationOnMock invocation) throws Throwable {
            final Order order = (Order) invocation.getArguments()[0];
            order.id = id;
            return null;
        }
    }

}
