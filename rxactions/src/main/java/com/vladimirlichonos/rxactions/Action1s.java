package com.vladimirlichonos.rxactions;

import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;

import rx.functions.Action1;

/**
 * Static helper methods for combining multiple {@linkplain Action1 Action1} into single action stream
 */
public final class Action1s {

    /**
     * Combines provided actions into a single action stream
     *
     * @param a1 Action
     * @return Single action stream combined of the provided actions
     */
    @CheckResult
    @NonNull
    public static <T> Action1<T> combine(@NonNull Action1<T> a1) {
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
    public static <T> Action1<T> combine(@NonNull final Action1<T> a1, @NonNull final Action1<T> a2) {
        return new Action1<T>() {
            @Override
            public void call(T t) {
                a1.call(t);
                a2.call(t);
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
    public static <T> Action1<T> combine(@NonNull final Action1<T> a1, @NonNull final Action1<T> a2, @NonNull final Action1<T> a3) {
        return new Action1<T>() {
            @Override
            public void call(T t) {
                a1.call(t);
                a2.call(t);
                a3.call(t);
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
    public static <T> Action1<T> combine(@NonNull final Action1<T> a1, @NonNull final Action1<T> a2, @NonNull final Action1<T> a3, @NonNull final Action1<T> a4) {
        return new Action1<T>() {
            @Override
            public void call(T t) {
                a1.call(t);
                a2.call(t);
                a3.call(t);
                a4.call(t);
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
    public static <T> Action1<T> combine(@NonNull final Action1<T> a1, @NonNull final Action1<T> a2, @NonNull final Action1<T> a3, @NonNull final Action1<T> a4, @NonNull final Action1<T> a5) {
        return new Action1<T>() {
            @Override
            public void call(T t) {
                a1.call(t);
                a2.call(t);
                a3.call(t);
                a4.call(t);
                a5.call(t);
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
    public static <T> Action1<T> combine(@NonNull final Action1<T> a1, @NonNull final Action1<T> a2, @NonNull final Action1<T> a3, @NonNull final Action1<T> a4, @NonNull final Action1<T> a5, @NonNull final Action1<T> a6) {
        return new Action1<T>() {
            @Override
            public void call(T t) {
                a1.call(t);
                a2.call(t);
                a3.call(t);
                a4.call(t);
                a5.call(t);
                a6.call(t);
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
    public static <T> Action1<T> combine(@NonNull final Action1<T> a1, @NonNull final Action1<T> a2, @NonNull final Action1<T> a3, @NonNull final Action1<T> a4, @NonNull final Action1<T> a5, @NonNull final Action1<T> a6, @NonNull final Action1<T> a7) {
        return new Action1<T>() {
            @Override
            public void call(T t) {
                a1.call(t);
                a2.call(t);
                a3.call(t);
                a4.call(t);
                a5.call(t);
                a6.call(t);
                a7.call(t);
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
    public static <T> Action1<T> combine(@NonNull final Action1<T> a1, @NonNull final Action1<T> a2, @NonNull final Action1<T> a3, @NonNull final Action1<T> a4, @NonNull final Action1<T> a5, @NonNull final Action1<T> a6, @NonNull final Action1<T> a7, @NonNull final Action1<T> a8) {
        return new Action1<T>() {
            @Override
            public void call(T t) {
                a1.call(t);
                a2.call(t);
                a3.call(t);
                a4.call(t);
                a5.call(t);
                a6.call(t);
                a7.call(t);
                a8.call(t);
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
    public static <T> Action1<T> combine(@NonNull final Action1<T> a1, @NonNull final Action1<T> a2, @NonNull final Action1<T> a3, @NonNull final Action1<T> a4, @NonNull final Action1<T> a5, @NonNull final Action1<T> a6, @NonNull final Action1<T> a7, @NonNull final Action1<T> a8, @NonNull final Action1<T> a9) {
        return new Action1<T>() {
            @Override
            public void call(T t) {
                a1.call(t);
                a2.call(t);
                a3.call(t);
                a4.call(t);
                a5.call(t);
                a6.call(t);
                a7.call(t);
                a8.call(t);
                a9.call(t);
            }
        };
    }

    /**
     * Combines provided actions into a single action stream
     *
     * @param a Actions
     * @return Single action stream combined of the provided actions
     */
    @SafeVarargs
    @CheckResult
    @NonNull
    public static <T> Action1<T> combine(@NonNull final Action1<T>... a) {
        return new Action1<T>() {
            @Override
            public void call(T t) {
                //noinspection ForLoopReplaceableByForEach
                for (int i = 0, count = a.length; i < count; i++) {
                    a[i].call(t);
                }
            }
        };
    }

    private Action1s() {
        throw new AssertionError("No instances.");
    }
}