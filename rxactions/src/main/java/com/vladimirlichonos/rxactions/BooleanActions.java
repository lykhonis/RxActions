package com.vladimirlichonos.rxactions;

import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;

import rx.functions.Action1;

/**
 * Static helper methods to provide boolean operations on rx.Action actions
 */
public class BooleanActions {

    /**
     * Converts the provided action into negated value
     *
     * @param a1 Action
     * @return Action that calls provided actions with negated value
     */
    @CheckResult
    @NonNull
    public static Action1<? super Boolean> not(@NonNull final Action1<? super Boolean> a1) {
        return new Action1<Boolean>() {
            @Override
            public void call(Boolean aBoolean) {
                a1.call(Boolean.FALSE.equals(aBoolean));
            }
        };
    }

    private BooleanActions() {
        throw new AssertionError("No instances.");
    }
}
