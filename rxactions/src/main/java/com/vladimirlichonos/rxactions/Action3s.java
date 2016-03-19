package com.vladimirlichonos.rxactions;

import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;

import rx.functions.Action3;

/**
 * Static helper methods for combining multiple {@linkplain Action3 Action3} into single action stream
 */
public final class Action3s {

    /**
     * Combines provided actions into a single action stream
     *
     * @param a1 Action
     * @return Single action stream combined of the provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3> Action3<T1, T2, T3> combine(@NonNull Action3<T1, T2, T3> a1) {
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
    public static <T1, T2, T3> Action3<T1, T2, T3> combine(@NonNull final Action3<T1, T2, T3> a1, @NonNull final Action3<T1, T2, T3> a2) {
        return new Action3<T1, T2, T3>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3) {
                a1.call(t1, t2, t3);
                a2.call(t1, t2, t3);
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
    public static <T1, T2, T3> Action3<T1, T2, T3> combine(@NonNull final Action3<T1, T2, T3> a1, @NonNull final Action3<T1, T2, T3> a2, @NonNull final Action3<T1, T2, T3> a3) {
        return new Action3<T1, T2, T3>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3) {
                a1.call(t1, t2, t3);
                a2.call(t1, t2, t3);
                a3.call(t1, t2, t3);
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
    public static <T1, T2, T3> Action3<T1, T2, T3> combine(@NonNull final Action3<T1, T2, T3> a1, @NonNull final Action3<T1, T2, T3> a2, @NonNull final Action3<T1, T2, T3> a3, @NonNull final Action3<T1, T2, T3> a4) {
        return new Action3<T1, T2, T3>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3) {
                a1.call(t1, t2, t3);
                a2.call(t1, t2, t3);
                a3.call(t1, t2, t3);
                a4.call(t1, t2, t3);
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
    public static <T1, T2, T3> Action3<T1, T2, T3> combine(@NonNull final Action3<T1, T2, T3> a1, @NonNull final Action3<T1, T2, T3> a2, @NonNull final Action3<T1, T2, T3> a3, @NonNull final Action3<T1, T2, T3> a4, @NonNull final Action3<T1, T2, T3> a5) {
        return new Action3<T1, T2, T3>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3) {
                a1.call(t1, t2, t3);
                a2.call(t1, t2, t3);
                a3.call(t1, t2, t3);
                a4.call(t1, t2, t3);
                a5.call(t1, t2, t3);
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
    public static <T1, T2, T3> Action3<T1, T2, T3> combine(@NonNull final Action3<T1, T2, T3> a1, @NonNull final Action3<T1, T2, T3> a2, @NonNull final Action3<T1, T2, T3> a3, @NonNull final Action3<T1, T2, T3> a4, @NonNull final Action3<T1, T2, T3> a5, @NonNull final Action3<T1, T2, T3> a6) {
        return new Action3<T1, T2, T3>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3) {
                a1.call(t1, t2, t3);
                a2.call(t1, t2, t3);
                a3.call(t1, t2, t3);
                a4.call(t1, t2, t3);
                a5.call(t1, t2, t3);
                a6.call(t1, t2, t3);
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
    public static <T1, T2, T3> Action3<T1, T2, T3> combine(@NonNull final Action3<T1, T2, T3> a1, @NonNull final Action3<T1, T2, T3> a2, @NonNull final Action3<T1, T2, T3> a3, @NonNull final Action3<T1, T2, T3> a4, @NonNull final Action3<T1, T2, T3> a5, @NonNull final Action3<T1, T2, T3> a6, @NonNull final Action3<T1, T2, T3> a7) {
        return new Action3<T1, T2, T3>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3) {
                a1.call(t1, t2, t3);
                a2.call(t1, t2, t3);
                a3.call(t1, t2, t3);
                a4.call(t1, t2, t3);
                a5.call(t1, t2, t3);
                a6.call(t1, t2, t3);
                a7.call(t1, t2, t3);
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
    public static <T1, T2, T3> Action3<T1, T2, T3> combine(@NonNull final Action3<T1, T2, T3> a1, @NonNull final Action3<T1, T2, T3> a2, @NonNull final Action3<T1, T2, T3> a3, @NonNull final Action3<T1, T2, T3> a4, @NonNull final Action3<T1, T2, T3> a5, @NonNull final Action3<T1, T2, T3> a6, @NonNull final Action3<T1, T2, T3> a7, @NonNull final Action3<T1, T2, T3> a8) {
        return new Action3<T1, T2, T3>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3) {
                a1.call(t1, t2, t3);
                a2.call(t1, t2, t3);
                a3.call(t1, t2, t3);
                a4.call(t1, t2, t3);
                a5.call(t1, t2, t3);
                a6.call(t1, t2, t3);
                a7.call(t1, t2, t3);
                a8.call(t1, t2, t3);
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
    public static <T1, T2, T3> Action3<T1, T2, T3> combine(@NonNull final Action3<T1, T2, T3> a1, @NonNull final Action3<T1, T2, T3> a2, @NonNull final Action3<T1, T2, T3> a3, @NonNull final Action3<T1, T2, T3> a4, @NonNull final Action3<T1, T2, T3> a5, @NonNull final Action3<T1, T2, T3> a6, @NonNull final Action3<T1, T2, T3> a7, @NonNull final Action3<T1, T2, T3> a8, @NonNull final Action3<T1, T2, T3> a9) {
        return new Action3<T1, T2, T3>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3) {
                a1.call(t1, t2, t3);
                a2.call(t1, t2, t3);
                a3.call(t1, t2, t3);
                a4.call(t1, t2, t3);
                a5.call(t1, t2, t3);
                a6.call(t1, t2, t3);
                a7.call(t1, t2, t3);
                a8.call(t1, t2, t3);
                a9.call(t1, t2, t3);
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
    public static <T1, T2, T3> Action3<T1, T2, T3> combine(@NonNull final Action3<T1, T2, T3>... a) {
        return new Action3<T1, T2, T3>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3) {
                //noinspection ForLoopReplaceableByForEach
                for (int i = 0, count = a.length; i < count; i++) {
                    a[i].call(t1, t2, t3);
                }
            }
        };
    }

    private Action3s() {
        throw new AssertionError("No instances.");
    }
}