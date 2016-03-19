package com.vladimirlichonos.rxactions;

import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;

import rx.functions.Action7;

/**
 * Static helper methods for combining multiple {@linkplain Action7 Action7} into single action stream
 */
public final class Action7s {

    /**
     * Combines provided actions into a single action stream
     *
     * @param a1 Action
     * @return Single action stream combined of the provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7> Action7<T1, T2, T3, T4, T5, T6, T7> combine(@NonNull Action7<T1, T2, T3, T4, T5, T6, T7> a1) {
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
    public static <T1, T2, T3, T4, T5, T6, T7> Action7<T1, T2, T3, T4, T5, T6, T7> combine(@NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a1, @NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a2) {
        return new Action7<T1, T2, T3, T4, T5, T6, T7>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
                a1.call(t1, t2, t3, t4, t5, t6, t7);
                a2.call(t1, t2, t3, t4, t5, t6, t7);
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
    public static <T1, T2, T3, T4, T5, T6, T7> Action7<T1, T2, T3, T4, T5, T6, T7> combine(@NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a1, @NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a2, @NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a3) {
        return new Action7<T1, T2, T3, T4, T5, T6, T7>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
                a1.call(t1, t2, t3, t4, t5, t6, t7);
                a2.call(t1, t2, t3, t4, t5, t6, t7);
                a3.call(t1, t2, t3, t4, t5, t6, t7);
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
    public static <T1, T2, T3, T4, T5, T6, T7> Action7<T1, T2, T3, T4, T5, T6, T7> combine(@NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a1, @NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a2, @NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a3, @NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a4) {
        return new Action7<T1, T2, T3, T4, T5, T6, T7>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
                a1.call(t1, t2, t3, t4, t5, t6, t7);
                a2.call(t1, t2, t3, t4, t5, t6, t7);
                a3.call(t1, t2, t3, t4, t5, t6, t7);
                a4.call(t1, t2, t3, t4, t5, t6, t7);
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
    public static <T1, T2, T3, T4, T5, T6, T7> Action7<T1, T2, T3, T4, T5, T6, T7> combine(@NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a1, @NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a2, @NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a3, @NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a4, @NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a5) {
        return new Action7<T1, T2, T3, T4, T5, T6, T7>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
                a1.call(t1, t2, t3, t4, t5, t6, t7);
                a2.call(t1, t2, t3, t4, t5, t6, t7);
                a3.call(t1, t2, t3, t4, t5, t6, t7);
                a4.call(t1, t2, t3, t4, t5, t6, t7);
                a5.call(t1, t2, t3, t4, t5, t6, t7);
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
    public static <T1, T2, T3, T4, T5, T6, T7> Action7<T1, T2, T3, T4, T5, T6, T7> combine(@NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a1, @NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a2, @NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a3, @NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a4, @NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a5, @NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a6) {
        return new Action7<T1, T2, T3, T4, T5, T6, T7>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
                a1.call(t1, t2, t3, t4, t5, t6, t7);
                a2.call(t1, t2, t3, t4, t5, t6, t7);
                a3.call(t1, t2, t3, t4, t5, t6, t7);
                a4.call(t1, t2, t3, t4, t5, t6, t7);
                a5.call(t1, t2, t3, t4, t5, t6, t7);
                a6.call(t1, t2, t3, t4, t5, t6, t7);
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
    public static <T1, T2, T3, T4, T5, T6, T7> Action7<T1, T2, T3, T4, T5, T6, T7> combine(@NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a1, @NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a2, @NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a3, @NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a4, @NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a5, @NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a6, @NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a7) {
        return new Action7<T1, T2, T3, T4, T5, T6, T7>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
                a1.call(t1, t2, t3, t4, t5, t6, t7);
                a2.call(t1, t2, t3, t4, t5, t6, t7);
                a3.call(t1, t2, t3, t4, t5, t6, t7);
                a4.call(t1, t2, t3, t4, t5, t6, t7);
                a5.call(t1, t2, t3, t4, t5, t6, t7);
                a6.call(t1, t2, t3, t4, t5, t6, t7);
                a7.call(t1, t2, t3, t4, t5, t6, t7);
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
    public static <T1, T2, T3, T4, T5, T6, T7> Action7<T1, T2, T3, T4, T5, T6, T7> combine(@NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a1, @NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a2, @NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a3, @NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a4, @NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a5, @NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a6, @NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a7, @NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a8) {
        return new Action7<T1, T2, T3, T4, T5, T6, T7>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
                a1.call(t1, t2, t3, t4, t5, t6, t7);
                a2.call(t1, t2, t3, t4, t5, t6, t7);
                a3.call(t1, t2, t3, t4, t5, t6, t7);
                a4.call(t1, t2, t3, t4, t5, t6, t7);
                a5.call(t1, t2, t3, t4, t5, t6, t7);
                a6.call(t1, t2, t3, t4, t5, t6, t7);
                a7.call(t1, t2, t3, t4, t5, t6, t7);
                a8.call(t1, t2, t3, t4, t5, t6, t7);
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
    public static <T1, T2, T3, T4, T5, T6, T7> Action7<T1, T2, T3, T4, T5, T6, T7> combine(@NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a1, @NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a2, @NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a3, @NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a4, @NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a5, @NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a6, @NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a7, @NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a8, @NonNull final Action7<T1, T2, T3, T4, T5, T6, T7> a9) {
        return new Action7<T1, T2, T3, T4, T5, T6, T7>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
                a1.call(t1, t2, t3, t4, t5, t6, t7);
                a2.call(t1, t2, t3, t4, t5, t6, t7);
                a3.call(t1, t2, t3, t4, t5, t6, t7);
                a4.call(t1, t2, t3, t4, t5, t6, t7);
                a5.call(t1, t2, t3, t4, t5, t6, t7);
                a6.call(t1, t2, t3, t4, t5, t6, t7);
                a7.call(t1, t2, t3, t4, t5, t6, t7);
                a8.call(t1, t2, t3, t4, t5, t6, t7);
                a9.call(t1, t2, t3, t4, t5, t6, t7);
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
    public static <T1, T2, T3, T4, T5, T6, T7> Action7<T1, T2, T3, T4, T5, T6, T7> combine(@NonNull final Action7<T1, T2, T3, T4, T5, T6, T7>... a) {
        return new Action7<T1, T2, T3, T4, T5, T6, T7>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
                //noinspection ForLoopReplaceableByForEach
                for (int i = 0, count = a.length; i < count; i++) {
                    a[i].call(t1, t2, t3, t4, t5, t6, t7);
                }
            }
        };
    }

    private Action7s() {
        throw new AssertionError("No instances.");
    }
}