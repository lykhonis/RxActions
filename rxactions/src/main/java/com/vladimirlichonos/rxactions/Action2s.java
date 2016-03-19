package com.vladimirlichonos.rxactions;

import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;

import rx.functions.Action2;

/**
 * Static helper methods for combining multiple {@linkplain Action2 Action2} into single action stream
 */
public final class Action2s {

    /**
     * Combines provided actions into a single action stream
     *
     * @param a1 Action
     * @return Single action stream combined of the provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2> Action2<T1, T2> combine(@NonNull Action2<T1, T2> a1) {
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
    public static <T1, T2> Action2<T1, T2> combine(@NonNull final Action2<T1, T2> a1, @NonNull final Action2<T1, T2> a2) {
        return new Action2<T1, T2>() {
            @Override
            public void call(T1 t1, T2 t2) {
                a1.call(t1, t2);
                a2.call(t1, t2);
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
    public static <T1, T2> Action2<T1, T2> combine(@NonNull final Action2<T1, T2> a1, @NonNull final Action2<T1, T2> a2, @NonNull final Action2<T1, T2> a3) {
        return new Action2<T1, T2>() {
            @Override
            public void call(T1 t1, T2 t2) {
                a1.call(t1, t2);
                a2.call(t1, t2);
                a3.call(t1, t2);
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
    public static <T1, T2> Action2<T1, T2> combine(@NonNull final Action2<T1, T2> a1, @NonNull final Action2<T1, T2> a2, @NonNull final Action2<T1, T2> a3, @NonNull final Action2<T1, T2> a4) {
        return new Action2<T1, T2>() {
            @Override
            public void call(T1 t1, T2 t2) {
                a1.call(t1, t2);
                a2.call(t1, t2);
                a3.call(t1, t2);
                a4.call(t1, t2);
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
    public static <T1, T2> Action2<T1, T2> combine(@NonNull final Action2<T1, T2> a1, @NonNull final Action2<T1, T2> a2, @NonNull final Action2<T1, T2> a3, @NonNull final Action2<T1, T2> a4, @NonNull final Action2<T1, T2> a5) {
        return new Action2<T1, T2>() {
            @Override
            public void call(T1 t1, T2 t2) {
                a1.call(t1, t2);
                a2.call(t1, t2);
                a3.call(t1, t2);
                a4.call(t1, t2);
                a5.call(t1, t2);
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
    public static <T1, T2> Action2<T1, T2> combine(@NonNull final Action2<T1, T2> a1, @NonNull final Action2<T1, T2> a2, @NonNull final Action2<T1, T2> a3, @NonNull final Action2<T1, T2> a4, @NonNull final Action2<T1, T2> a5, @NonNull final Action2<T1, T2> a6) {
        return new Action2<T1, T2>() {
            @Override
            public void call(T1 t1, T2 t2) {
                a1.call(t1, t2);
                a2.call(t1, t2);
                a3.call(t1, t2);
                a4.call(t1, t2);
                a5.call(t1, t2);
                a6.call(t1, t2);
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
    public static <T1, T2> Action2<T1, T2> combine(@NonNull final Action2<T1, T2> a1, @NonNull final Action2<T1, T2> a2, @NonNull final Action2<T1, T2> a3, @NonNull final Action2<T1, T2> a4, @NonNull final Action2<T1, T2> a5, @NonNull final Action2<T1, T2> a6, @NonNull final Action2<T1, T2> a7) {
        return new Action2<T1, T2>() {
            @Override
            public void call(T1 t1, T2 t2) {
                a1.call(t1, t2);
                a2.call(t1, t2);
                a3.call(t1, t2);
                a4.call(t1, t2);
                a5.call(t1, t2);
                a6.call(t1, t2);
                a7.call(t1, t2);
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
    public static <T1, T2> Action2<T1, T2> combine(@NonNull final Action2<T1, T2> a1, @NonNull final Action2<T1, T2> a2, @NonNull final Action2<T1, T2> a3, @NonNull final Action2<T1, T2> a4, @NonNull final Action2<T1, T2> a5, @NonNull final Action2<T1, T2> a6, @NonNull final Action2<T1, T2> a7, @NonNull final Action2<T1, T2> a8) {
        return new Action2<T1, T2>() {
            @Override
            public void call(T1 t1, T2 t2) {
                a1.call(t1, t2);
                a2.call(t1, t2);
                a3.call(t1, t2);
                a4.call(t1, t2);
                a5.call(t1, t2);
                a6.call(t1, t2);
                a7.call(t1, t2);
                a8.call(t1, t2);
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
    public static <T1, T2> Action2<T1, T2> combine(@NonNull final Action2<T1, T2> a1, @NonNull final Action2<T1, T2> a2, @NonNull final Action2<T1, T2> a3, @NonNull final Action2<T1, T2> a4, @NonNull final Action2<T1, T2> a5, @NonNull final Action2<T1, T2> a6, @NonNull final Action2<T1, T2> a7, @NonNull final Action2<T1, T2> a8, @NonNull final Action2<T1, T2> a9) {
        return new Action2<T1, T2>() {
            @Override
            public void call(T1 t1, T2 t2) {
                a1.call(t1, t2);
                a2.call(t1, t2);
                a3.call(t1, t2);
                a4.call(t1, t2);
                a5.call(t1, t2);
                a6.call(t1, t2);
                a7.call(t1, t2);
                a8.call(t1, t2);
                a9.call(t1, t2);
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
    public static <T1, T2> Action2<T1, T2> combine(@NonNull final Action2<T1, T2>... a) {
        return new Action2<T1, T2>() {
            @Override
            public void call(T1 t1, T2 t2) {
                //noinspection ForLoopReplaceableByForEach
                for (int i = 0, count = a.length; i < count; i++) {
                    a[i].call(t1, t2);
                }
            }
        };
    }

    private Action2s() {
        throw new AssertionError("No instances.");
    }
}