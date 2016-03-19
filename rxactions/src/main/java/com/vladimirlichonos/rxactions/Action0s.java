package com.vladimirlichonos.rxactions;

import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;

import rx.functions.Action0;

/**
 * Static helper methods for combining multiple {@linkplain Action0 Action0} into single action stream
 */
public final class Action0s {

    /**
     * Combines provided actions into a single action stream
     *
     * @param a1 Action
     * @return Single action stream combined of the provided actions
     */
    @CheckResult
    @NonNull
    public static Action0 combine(@NonNull Action0 a1) {
        return a1;
    }

    /**
     * Combines provided actions into a single action stream
     *
     * @param a1 Action
     * @param a2 Action
     * @return Single action stream combined of the provided actions
     */
    @CheckResult
    @NonNull
    public static Action0 combine(@NonNull final Action0 a1, @NonNull final Action0 a2) {
        return new Action0() {
            @Override
            public void call() {
                a1.call();
                a2.call();
            }
        };
    }

    /**
     * Combines provided actions into a single action stream
     *
     * @param a1 Action
     * @param a2 Action
     * @param a3 Action
     * @return Single action stream combined of the provided actions
     */
    @CheckResult
    @NonNull
    public static Action0 combine(@NonNull final Action0 a1, @NonNull final Action0 a2, @NonNull final Action0 a3) {
        return new Action0() {
            @Override
            public void call() {
                a1.call();
                a2.call();
                a3.call();
            }
        };
    }

    /**
     * Combines provided actions into a single action stream
     *
     * @param a1 Action
     * @param a2 Action
     * @param a3 Action
     * @param a4 Action
     * @return Single action stream combined of the provided actions
     */
    @CheckResult
    @NonNull
    public static Action0 combine(@NonNull final Action0 a1, @NonNull final Action0 a2, @NonNull final Action0 a3, @NonNull final Action0 a4) {
        return new Action0() {
            @Override
            public void call() {
                a1.call();
                a2.call();
                a3.call();
                a4.call();
            }
        };
    }

    /**
     * Combines provided actions into a single action stream
     *
     * @param a1 Action
     * @param a2 Action
     * @param a3 Action
     * @param a4 Action
     * @param a5 Action
     * @return Single action stream combined of the provided actions
     */
    @CheckResult
    @NonNull
    public static Action0 combine(@NonNull final Action0 a1, @NonNull final Action0 a2, @NonNull final Action0 a3, @NonNull final Action0 a4, @NonNull final Action0 a5) {
        return new Action0() {
            @Override
            public void call() {
                a1.call();
                a2.call();
                a3.call();
                a4.call();
                a5.call();
            }
        };
    }

    /**
     * Combines provided actions into a single action stream
     *
     * @param a1 Action
     * @param a2 Action
     * @param a3 Action
     * @param a4 Action
     * @param a5 Action
     * @param a6 Action
     * @return Single action stream combined of the provided actions
     */
    @CheckResult
    @NonNull
    public static Action0 combine(@NonNull final Action0 a1, @NonNull final Action0 a2, @NonNull final Action0 a3, @NonNull final Action0 a4, @NonNull final Action0 a5, @NonNull final Action0 a6) {
        return new Action0() {
            @Override
            public void call() {
                a1.call();
                a2.call();
                a3.call();
                a4.call();
                a5.call();
                a6.call();
            }
        };
    }

    /**
     * Combines provided actions into a single action stream
     *
     * @param a1 Action
     * @param a2 Action
     * @param a3 Action
     * @param a4 Action
     * @param a5 Action
     * @param a6 Action
     * @param a7 Action
     * @return Single action stream combined of the provided actions
     */
    @CheckResult
    @NonNull
    public static Action0 combine(@NonNull final Action0 a1, @NonNull final Action0 a2, @NonNull final Action0 a3, @NonNull final Action0 a4, @NonNull final Action0 a5, @NonNull final Action0 a6, @NonNull final Action0 a7) {
        return new Action0() {
            @Override
            public void call() {
                a1.call();
                a2.call();
                a3.call();
                a4.call();
                a5.call();
                a6.call();
                a7.call();
            }
        };
    }

    /**
     * Combines provided actions into a single action stream
     *
     * @param a1 Action
     * @param a2 Action
     * @param a3 Action
     * @param a4 Action
     * @param a5 Action
     * @param a6 Action
     * @param a7 Action
     * @param a8 Action
     * @return Single action stream combined of the provided actions
     */
    @CheckResult
    @NonNull
    public static Action0 combine(@NonNull final Action0 a1, @NonNull final Action0 a2, @NonNull final Action0 a3, @NonNull final Action0 a4, @NonNull final Action0 a5, @NonNull final Action0 a6, @NonNull final Action0 a7, @NonNull final Action0 a8) {
        return new Action0() {
            @Override
            public void call() {
                a1.call();
                a2.call();
                a3.call();
                a4.call();
                a5.call();
                a6.call();
                a7.call();
                a8.call();
            }
        };
    }

    /**
     * Combines provided actions into a single action stream
     *
     * @param a1 Action
     * @param a2 Action
     * @param a3 Action
     * @param a4 Action
     * @param a5 Action
     * @param a6 Action
     * @param a7 Action
     * @param a8 Action
     * @param a9 Action
     * @return Single action stream combined of the provided actions
     */
    @CheckResult
    @NonNull
    public static Action0 combine(@NonNull final Action0 a1, @NonNull final Action0 a2, @NonNull final Action0 a3, @NonNull final Action0 a4, @NonNull final Action0 a5, @NonNull final Action0 a6, @NonNull final Action0 a7, @NonNull final Action0 a8, @NonNull final Action0 a9) {
        return new Action0() {
            @Override
            public void call() {
                a1.call();
                a2.call();
                a3.call();
                a4.call();
                a5.call();
                a6.call();
                a7.call();
                a8.call();
                a9.call();
            }
        };
    }

    /**
     * Combines provided actions into a single action stream
     *
     * @param a Actions
     * @return Single action stream combined of the provided actions
     */
    @CheckResult
    @NonNull
    public static Action0 combine(@NonNull final Action0... a) {
        return new Action0() {
            @Override
            public void call() {
                //noinspection ForLoopReplaceableByForEach
                for (int i = 0, count = a.length; i < count; i++) {
                    a[i].call();
                }
            }
        };
    }

    private Action0s() {
        throw new AssertionError("No instances.");
    }
}