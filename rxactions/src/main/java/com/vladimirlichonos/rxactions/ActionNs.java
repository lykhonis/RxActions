package com.vladimirlichonos.rxactions;

import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;

import rx.functions.ActionN;

/**
 * Static helper methods for combining multiple {@linkplain ActionN ActionN} into single action stream
 */
public final class ActionNs {

    /**
     * Combines provided actions into a single action stream
     *
     * @param a1 Action
     * @return Single action stream combined of the provided actions
     */
    @CheckResult
    @NonNull
    public static ActionN combine(@NonNull ActionN a1) {
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
    public static ActionN combine(@NonNull final ActionN a1, @NonNull final ActionN a2) {
        return new ActionN() {
            @Override
            public void call(Object... args) {
                a1.call(args);
                a2.call(args);
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
    public static ActionN combine(@NonNull final ActionN a1, @NonNull final ActionN a2, @NonNull final ActionN a3) {
        return new ActionN() {
            @Override
            public void call(Object... args) {
                a1.call(args);
                a2.call(args);
                a3.call(args);
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
    public static ActionN combine(@NonNull final ActionN a1, @NonNull final ActionN a2, @NonNull final ActionN a3, @NonNull final ActionN a4) {
        return new ActionN() {
            @Override
            public void call(Object... args) {
                a1.call(args);
                a2.call(args);
                a3.call(args);
                a4.call(args);
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
    public static ActionN combine(@NonNull final ActionN a1, @NonNull final ActionN a2, @NonNull final ActionN a3, @NonNull final ActionN a4, @NonNull final ActionN a5) {
        return new ActionN() {
            @Override
            public void call(Object... args) {
                a1.call(args);
                a2.call(args);
                a3.call(args);
                a4.call(args);
                a5.call(args);
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
    public static ActionN combine(@NonNull final ActionN a1, @NonNull final ActionN a2, @NonNull final ActionN a3, @NonNull final ActionN a4, @NonNull final ActionN a5, @NonNull final ActionN a6) {
        return new ActionN() {
            @Override
            public void call(Object... args) {
                a1.call(args);
                a2.call(args);
                a3.call(args);
                a4.call(args);
                a5.call(args);
                a6.call(args);
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
    public static ActionN combine(@NonNull final ActionN a1, @NonNull final ActionN a2, @NonNull final ActionN a3, @NonNull final ActionN a4, @NonNull final ActionN a5, @NonNull final ActionN a6, @NonNull final ActionN a7) {
        return new ActionN() {
            @Override
            public void call(Object... args) {
                a1.call(args);
                a2.call(args);
                a3.call(args);
                a4.call(args);
                a5.call(args);
                a6.call(args);
                a7.call(args);
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
    public static ActionN combine(@NonNull final ActionN a1, @NonNull final ActionN a2, @NonNull final ActionN a3, @NonNull final ActionN a4, @NonNull final ActionN a5, @NonNull final ActionN a6, @NonNull final ActionN a7, @NonNull final ActionN a8) {
        return new ActionN() {
            @Override
            public void call(Object... args) {
                a1.call(args);
                a2.call(args);
                a3.call(args);
                a4.call(args);
                a5.call(args);
                a6.call(args);
                a7.call(args);
                a8.call(args);
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
    public static ActionN combine(@NonNull final ActionN a1, @NonNull final ActionN a2, @NonNull final ActionN a3, @NonNull final ActionN a4, @NonNull final ActionN a5, @NonNull final ActionN a6, @NonNull final ActionN a7, @NonNull final ActionN a8, @NonNull final ActionN a9) {
        return new ActionN() {
            @Override
            public void call(Object... args) {
                a1.call(args);
                a2.call(args);
                a3.call(args);
                a4.call(args);
                a5.call(args);
                a6.call(args);
                a7.call(args);
                a8.call(args);
                a9.call(args);
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
    public static ActionN combine(@NonNull final ActionN... a) {
        return new ActionN() {
            @Override
            public void call(Object... args) {
                //noinspection ForLoopReplaceableByForEach
                for (int i = 0, count = a.length; i < count; i++) {
                    a[i].call(args);
                }
            }
        };
    }

    private ActionNs() {
        throw new AssertionError("No instances.");
    }
}