package com.vladimirlichonos.rxactions;

import org.junit.Test;
import org.mockito.Mockito;

import rx.functions.Action1;

@SuppressWarnings("unchecked")
public class BooleanActionsTest {

    @Test
    public void testNot() {
        Action1<? super Boolean> action1 = Mockito.mock(Action1.class);
        Action1<? super Boolean> action2 = BooleanActions.not(action1);
        action2.call(true);
        Mockito.verify(action1).call(false);
        action2.call(false);
        Mockito.verify(action1).call(true);
    }
}
