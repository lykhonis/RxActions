package com.vladimirlichonos.rxactions;

import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;

import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Action2;
import rx.functions.Action3;
import rx.functions.Action4;
import rx.functions.Action5;
import rx.functions.Action6;
import rx.functions.Action7;
import rx.functions.Action8;
import rx.functions.Action9;
import rx.functions.ActionN;

/**
 * Static helper methods for combining multiple rx.Action actions into single action stream
 */
public class Actions {

    /**
     * Combines provided actions into a single action stream
     *
     * @param a1 Action
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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

    /**
     * Combines provided actions into a single action stream
     *
     * @param a1 Action
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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

    /**
     * Combines provided actions into a single action stream
     *
     * @param a1 Action
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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

    /**
     * Combines provided actions into a single action stream
     *
     * @param a1 Action
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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

    /**
     * Combines provided actions into a single action stream
     *
     * @param a1 Action
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4> Action4<T1, T2, T3, T4> combine(@NonNull Action4<T1, T2, T3, T4> a1) {
        return a1;
    }

    /**
     * Combines provided actions into a single action stream
     *
     * @param a1 Action
     * @param a2 Action
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4> Action4<T1, T2, T3, T4> combine(@NonNull final Action4<T1, T2, T3, T4> a1, @NonNull final Action4<T1, T2, T3, T4> a2) {
        return new Action4<T1, T2, T3, T4>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4) {
                a1.call(t1, t2, t3, t4);
                a2.call(t1, t2, t3, t4);
            }
        };
    }

    /**
     * Combines provided actions into a single action stream
     *
     * @param a1 Action
     * @param a2 Action
     * @param a3 Action
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4> Action4<T1, T2, T3, T4> combine(@NonNull final Action4<T1, T2, T3, T4> a1, @NonNull final Action4<T1, T2, T3, T4> a2, @NonNull final Action4<T1, T2, T3, T4> a3) {
        return new Action4<T1, T2, T3, T4>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4) {
                a1.call(t1, t2, t3, t4);
                a2.call(t1, t2, t3, t4);
                a3.call(t1, t2, t3, t4);
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
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4> Action4<T1, T2, T3, T4> combine(@NonNull final Action4<T1, T2, T3, T4> a1, @NonNull final Action4<T1, T2, T3, T4> a2, @NonNull final Action4<T1, T2, T3, T4> a3, @NonNull final Action4<T1, T2, T3, T4> a4) {
        return new Action4<T1, T2, T3, T4>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4) {
                a1.call(t1, t2, t3, t4);
                a2.call(t1, t2, t3, t4);
                a3.call(t1, t2, t3, t4);
                a4.call(t1, t2, t3, t4);
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
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4> Action4<T1, T2, T3, T4> combine(@NonNull final Action4<T1, T2, T3, T4> a1, @NonNull final Action4<T1, T2, T3, T4> a2, @NonNull final Action4<T1, T2, T3, T4> a3, @NonNull final Action4<T1, T2, T3, T4> a4, @NonNull final Action4<T1, T2, T3, T4> a5) {
        return new Action4<T1, T2, T3, T4>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4) {
                a1.call(t1, t2, t3, t4);
                a2.call(t1, t2, t3, t4);
                a3.call(t1, t2, t3, t4);
                a4.call(t1, t2, t3, t4);
                a5.call(t1, t2, t3, t4);
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
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4> Action4<T1, T2, T3, T4> combine(@NonNull final Action4<T1, T2, T3, T4> a1, @NonNull final Action4<T1, T2, T3, T4> a2, @NonNull final Action4<T1, T2, T3, T4> a3, @NonNull final Action4<T1, T2, T3, T4> a4, @NonNull final Action4<T1, T2, T3, T4> a5, @NonNull final Action4<T1, T2, T3, T4> a6) {
        return new Action4<T1, T2, T3, T4>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4) {
                a1.call(t1, t2, t3, t4);
                a2.call(t1, t2, t3, t4);
                a3.call(t1, t2, t3, t4);
                a4.call(t1, t2, t3, t4);
                a5.call(t1, t2, t3, t4);
                a6.call(t1, t2, t3, t4);
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
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4> Action4<T1, T2, T3, T4> combine(@NonNull final Action4<T1, T2, T3, T4> a1, @NonNull final Action4<T1, T2, T3, T4> a2, @NonNull final Action4<T1, T2, T3, T4> a3, @NonNull final Action4<T1, T2, T3, T4> a4, @NonNull final Action4<T1, T2, T3, T4> a5, @NonNull final Action4<T1, T2, T3, T4> a6, @NonNull final Action4<T1, T2, T3, T4> a7) {
        return new Action4<T1, T2, T3, T4>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4) {
                a1.call(t1, t2, t3, t4);
                a2.call(t1, t2, t3, t4);
                a3.call(t1, t2, t3, t4);
                a4.call(t1, t2, t3, t4);
                a5.call(t1, t2, t3, t4);
                a6.call(t1, t2, t3, t4);
                a7.call(t1, t2, t3, t4);
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
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4> Action4<T1, T2, T3, T4> combine(@NonNull final Action4<T1, T2, T3, T4> a1, @NonNull final Action4<T1, T2, T3, T4> a2, @NonNull final Action4<T1, T2, T3, T4> a3, @NonNull final Action4<T1, T2, T3, T4> a4, @NonNull final Action4<T1, T2, T3, T4> a5, @NonNull final Action4<T1, T2, T3, T4> a6, @NonNull final Action4<T1, T2, T3, T4> a7, @NonNull final Action4<T1, T2, T3, T4> a8) {
        return new Action4<T1, T2, T3, T4>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4) {
                a1.call(t1, t2, t3, t4);
                a2.call(t1, t2, t3, t4);
                a3.call(t1, t2, t3, t4);
                a4.call(t1, t2, t3, t4);
                a5.call(t1, t2, t3, t4);
                a6.call(t1, t2, t3, t4);
                a7.call(t1, t2, t3, t4);
                a8.call(t1, t2, t3, t4);
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
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4> Action4<T1, T2, T3, T4> combine(@NonNull final Action4<T1, T2, T3, T4> a1, @NonNull final Action4<T1, T2, T3, T4> a2, @NonNull final Action4<T1, T2, T3, T4> a3, @NonNull final Action4<T1, T2, T3, T4> a4, @NonNull final Action4<T1, T2, T3, T4> a5, @NonNull final Action4<T1, T2, T3, T4> a6, @NonNull final Action4<T1, T2, T3, T4> a7, @NonNull final Action4<T1, T2, T3, T4> a8, @NonNull final Action4<T1, T2, T3, T4> a9) {
        return new Action4<T1, T2, T3, T4>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4) {
                a1.call(t1, t2, t3, t4);
                a2.call(t1, t2, t3, t4);
                a3.call(t1, t2, t3, t4);
                a4.call(t1, t2, t3, t4);
                a5.call(t1, t2, t3, t4);
                a6.call(t1, t2, t3, t4);
                a7.call(t1, t2, t3, t4);
                a8.call(t1, t2, t3, t4);
                a9.call(t1, t2, t3, t4);
            }
        };
    }

    /**
     * Combines provided actions into a single action stream
     *
     * @param a Actions
     * @return Single action stream combined from provided actions
     */
    @SafeVarargs
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4> Action4<T1, T2, T3, T4> combine(@NonNull final Action4<T1, T2, T3, T4>... a) {
        return new Action4<T1, T2, T3, T4>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4) {
                //noinspection ForLoopReplaceableByForEach
                for (int i = 0, count = a.length; i < count; i++) {
                    a[i].call(t1, t2, t3, t4);
                }
            }
        };
    }

    /**
     * Combines provided actions into a single action stream
     *
     * @param a1 Action
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5> Action5<T1, T2, T3, T4, T5> combine(@NonNull Action5<T1, T2, T3, T4, T5> a1) {
        return a1;
    }

    /**
     * Combines provided actions into a single action stream
     *
     * @param a1 Action
     * @param a2 Action
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5> Action5<T1, T2, T3, T4, T5> combine(@NonNull final Action5<T1, T2, T3, T4, T5> a1, @NonNull final Action5<T1, T2, T3, T4, T5> a2) {
        return new Action5<T1, T2, T3, T4, T5>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
                a1.call(t1, t2, t3, t4, t5);
                a2.call(t1, t2, t3, t4, t5);
            }
        };
    }

    /**
     * Combines provided actions into a single action stream
     *
     * @param a1 Action
     * @param a2 Action
     * @param a3 Action
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5> Action5<T1, T2, T3, T4, T5> combine(@NonNull final Action5<T1, T2, T3, T4, T5> a1, @NonNull final Action5<T1, T2, T3, T4, T5> a2, @NonNull final Action5<T1, T2, T3, T4, T5> a3) {
        return new Action5<T1, T2, T3, T4, T5>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
                a1.call(t1, t2, t3, t4, t5);
                a2.call(t1, t2, t3, t4, t5);
                a3.call(t1, t2, t3, t4, t5);
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
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5> Action5<T1, T2, T3, T4, T5> combine(@NonNull final Action5<T1, T2, T3, T4, T5> a1, @NonNull final Action5<T1, T2, T3, T4, T5> a2, @NonNull final Action5<T1, T2, T3, T4, T5> a3, @NonNull final Action5<T1, T2, T3, T4, T5> a4) {
        return new Action5<T1, T2, T3, T4, T5>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
                a1.call(t1, t2, t3, t4, t5);
                a2.call(t1, t2, t3, t4, t5);
                a3.call(t1, t2, t3, t4, t5);
                a4.call(t1, t2, t3, t4, t5);
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
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5> Action5<T1, T2, T3, T4, T5> combine(@NonNull final Action5<T1, T2, T3, T4, T5> a1, @NonNull final Action5<T1, T2, T3, T4, T5> a2, @NonNull final Action5<T1, T2, T3, T4, T5> a3, @NonNull final Action5<T1, T2, T3, T4, T5> a4, @NonNull final Action5<T1, T2, T3, T4, T5> a5) {
        return new Action5<T1, T2, T3, T4, T5>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
                a1.call(t1, t2, t3, t4, t5);
                a2.call(t1, t2, t3, t4, t5);
                a3.call(t1, t2, t3, t4, t5);
                a4.call(t1, t2, t3, t4, t5);
                a5.call(t1, t2, t3, t4, t5);
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
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5> Action5<T1, T2, T3, T4, T5> combine(@NonNull final Action5<T1, T2, T3, T4, T5> a1, @NonNull final Action5<T1, T2, T3, T4, T5> a2, @NonNull final Action5<T1, T2, T3, T4, T5> a3, @NonNull final Action5<T1, T2, T3, T4, T5> a4, @NonNull final Action5<T1, T2, T3, T4, T5> a5, @NonNull final Action5<T1, T2, T3, T4, T5> a6) {
        return new Action5<T1, T2, T3, T4, T5>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
                a1.call(t1, t2, t3, t4, t5);
                a2.call(t1, t2, t3, t4, t5);
                a3.call(t1, t2, t3, t4, t5);
                a4.call(t1, t2, t3, t4, t5);
                a5.call(t1, t2, t3, t4, t5);
                a6.call(t1, t2, t3, t4, t5);
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
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5> Action5<T1, T2, T3, T4, T5> combine(@NonNull final Action5<T1, T2, T3, T4, T5> a1, @NonNull final Action5<T1, T2, T3, T4, T5> a2, @NonNull final Action5<T1, T2, T3, T4, T5> a3, @NonNull final Action5<T1, T2, T3, T4, T5> a4, @NonNull final Action5<T1, T2, T3, T4, T5> a5, @NonNull final Action5<T1, T2, T3, T4, T5> a6, @NonNull final Action5<T1, T2, T3, T4, T5> a7) {
        return new Action5<T1, T2, T3, T4, T5>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
                a1.call(t1, t2, t3, t4, t5);
                a2.call(t1, t2, t3, t4, t5);
                a3.call(t1, t2, t3, t4, t5);
                a4.call(t1, t2, t3, t4, t5);
                a5.call(t1, t2, t3, t4, t5);
                a6.call(t1, t2, t3, t4, t5);
                a7.call(t1, t2, t3, t4, t5);
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
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5> Action5<T1, T2, T3, T4, T5> combine(@NonNull final Action5<T1, T2, T3, T4, T5> a1, @NonNull final Action5<T1, T2, T3, T4, T5> a2, @NonNull final Action5<T1, T2, T3, T4, T5> a3, @NonNull final Action5<T1, T2, T3, T4, T5> a4, @NonNull final Action5<T1, T2, T3, T4, T5> a5, @NonNull final Action5<T1, T2, T3, T4, T5> a6, @NonNull final Action5<T1, T2, T3, T4, T5> a7, @NonNull final Action5<T1, T2, T3, T4, T5> a8) {
        return new Action5<T1, T2, T3, T4, T5>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
                a1.call(t1, t2, t3, t4, t5);
                a2.call(t1, t2, t3, t4, t5);
                a3.call(t1, t2, t3, t4, t5);
                a4.call(t1, t2, t3, t4, t5);
                a5.call(t1, t2, t3, t4, t5);
                a6.call(t1, t2, t3, t4, t5);
                a7.call(t1, t2, t3, t4, t5);
                a8.call(t1, t2, t3, t4, t5);
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
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5> Action5<T1, T2, T3, T4, T5> combine(@NonNull final Action5<T1, T2, T3, T4, T5> a1, @NonNull final Action5<T1, T2, T3, T4, T5> a2, @NonNull final Action5<T1, T2, T3, T4, T5> a3, @NonNull final Action5<T1, T2, T3, T4, T5> a4, @NonNull final Action5<T1, T2, T3, T4, T5> a5, @NonNull final Action5<T1, T2, T3, T4, T5> a6, @NonNull final Action5<T1, T2, T3, T4, T5> a7, @NonNull final Action5<T1, T2, T3, T4, T5> a8, @NonNull final Action5<T1, T2, T3, T4, T5> a9) {
        return new Action5<T1, T2, T3, T4, T5>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
                a1.call(t1, t2, t3, t4, t5);
                a2.call(t1, t2, t3, t4, t5);
                a3.call(t1, t2, t3, t4, t5);
                a4.call(t1, t2, t3, t4, t5);
                a5.call(t1, t2, t3, t4, t5);
                a6.call(t1, t2, t3, t4, t5);
                a7.call(t1, t2, t3, t4, t5);
                a8.call(t1, t2, t3, t4, t5);
                a9.call(t1, t2, t3, t4, t5);
            }
        };
    }

    /**
     * Combines provided actions into a single action stream
     *
     * @param a Actions
     * @return Single action stream combined from provided actions
     */
    @SafeVarargs
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5> Action5<T1, T2, T3, T4, T5> combine(@NonNull final Action5<T1, T2, T3, T4, T5>... a) {
        return new Action5<T1, T2, T3, T4, T5>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
                //noinspection ForLoopReplaceableByForEach
                for (int i = 0, count = a.length; i < count; i++) {
                    a[i].call(t1, t2, t3, t4, t5);
                }
            }
        };
    }

    /**
     * Combines provided actions into a single action stream
     *
     * @param a1 Action
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5, T6> Action6<T1, T2, T3, T4, T5, T6> combine(@NonNull Action6<T1, T2, T3, T4, T5, T6> a1) {
        return a1;
    }

    /**
     * Combines provided actions into a single action stream
     *
     * @param a1 Action
     * @param a2 Action
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5, T6> Action6<T1, T2, T3, T4, T5, T6> combine(@NonNull final Action6<T1, T2, T3, T4, T5, T6> a1, @NonNull final Action6<T1, T2, T3, T4, T5, T6> a2) {
        return new Action6<T1, T2, T3, T4, T5, T6>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
                a1.call(t1, t2, t3, t4, t5, t6);
                a2.call(t1, t2, t3, t4, t5, t6);
            }
        };
    }

    /**
     * Combines provided actions into a single action stream
     *
     * @param a1 Action
     * @param a2 Action
     * @param a3 Action
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5, T6> Action6<T1, T2, T3, T4, T5, T6> combine(@NonNull final Action6<T1, T2, T3, T4, T5, T6> a1, @NonNull final Action6<T1, T2, T3, T4, T5, T6> a2, @NonNull final Action6<T1, T2, T3, T4, T5, T6> a3) {
        return new Action6<T1, T2, T3, T4, T5, T6>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
                a1.call(t1, t2, t3, t4, t5, t6);
                a2.call(t1, t2, t3, t4, t5, t6);
                a3.call(t1, t2, t3, t4, t5, t6);
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
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5, T6> Action6<T1, T2, T3, T4, T5, T6> combine(@NonNull final Action6<T1, T2, T3, T4, T5, T6> a1, @NonNull final Action6<T1, T2, T3, T4, T5, T6> a2, @NonNull final Action6<T1, T2, T3, T4, T5, T6> a3, @NonNull final Action6<T1, T2, T3, T4, T5, T6> a4) {
        return new Action6<T1, T2, T3, T4, T5, T6>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
                a1.call(t1, t2, t3, t4, t5, t6);
                a2.call(t1, t2, t3, t4, t5, t6);
                a3.call(t1, t2, t3, t4, t5, t6);
                a4.call(t1, t2, t3, t4, t5, t6);
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
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5, T6> Action6<T1, T2, T3, T4, T5, T6> combine(@NonNull final Action6<T1, T2, T3, T4, T5, T6> a1, @NonNull final Action6<T1, T2, T3, T4, T5, T6> a2, @NonNull final Action6<T1, T2, T3, T4, T5, T6> a3, @NonNull final Action6<T1, T2, T3, T4, T5, T6> a4, @NonNull final Action6<T1, T2, T3, T4, T5, T6> a5) {
        return new Action6<T1, T2, T3, T4, T5, T6>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
                a1.call(t1, t2, t3, t4, t5, t6);
                a2.call(t1, t2, t3, t4, t5, t6);
                a3.call(t1, t2, t3, t4, t5, t6);
                a4.call(t1, t2, t3, t4, t5, t6);
                a5.call(t1, t2, t3, t4, t5, t6);
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
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5, T6> Action6<T1, T2, T3, T4, T5, T6> combine(@NonNull final Action6<T1, T2, T3, T4, T5, T6> a1, @NonNull final Action6<T1, T2, T3, T4, T5, T6> a2, @NonNull final Action6<T1, T2, T3, T4, T5, T6> a3, @NonNull final Action6<T1, T2, T3, T4, T5, T6> a4, @NonNull final Action6<T1, T2, T3, T4, T5, T6> a5, @NonNull final Action6<T1, T2, T3, T4, T5, T6> a6) {
        return new Action6<T1, T2, T3, T4, T5, T6>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
                a1.call(t1, t2, t3, t4, t5, t6);
                a2.call(t1, t2, t3, t4, t5, t6);
                a3.call(t1, t2, t3, t4, t5, t6);
                a4.call(t1, t2, t3, t4, t5, t6);
                a5.call(t1, t2, t3, t4, t5, t6);
                a6.call(t1, t2, t3, t4, t5, t6);
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
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5, T6> Action6<T1, T2, T3, T4, T5, T6> combine(@NonNull final Action6<T1, T2, T3, T4, T5, T6> a1, @NonNull final Action6<T1, T2, T3, T4, T5, T6> a2, @NonNull final Action6<T1, T2, T3, T4, T5, T6> a3, @NonNull final Action6<T1, T2, T3, T4, T5, T6> a4, @NonNull final Action6<T1, T2, T3, T4, T5, T6> a5, @NonNull final Action6<T1, T2, T3, T4, T5, T6> a6, @NonNull final Action6<T1, T2, T3, T4, T5, T6> a7) {
        return new Action6<T1, T2, T3, T4, T5, T6>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
                a1.call(t1, t2, t3, t4, t5, t6);
                a2.call(t1, t2, t3, t4, t5, t6);
                a3.call(t1, t2, t3, t4, t5, t6);
                a4.call(t1, t2, t3, t4, t5, t6);
                a5.call(t1, t2, t3, t4, t5, t6);
                a6.call(t1, t2, t3, t4, t5, t6);
                a7.call(t1, t2, t3, t4, t5, t6);
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
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5, T6> Action6<T1, T2, T3, T4, T5, T6> combine(@NonNull final Action6<T1, T2, T3, T4, T5, T6> a1, @NonNull final Action6<T1, T2, T3, T4, T5, T6> a2, @NonNull final Action6<T1, T2, T3, T4, T5, T6> a3, @NonNull final Action6<T1, T2, T3, T4, T5, T6> a4, @NonNull final Action6<T1, T2, T3, T4, T5, T6> a5, @NonNull final Action6<T1, T2, T3, T4, T5, T6> a6, @NonNull final Action6<T1, T2, T3, T4, T5, T6> a7, @NonNull final Action6<T1, T2, T3, T4, T5, T6> a8) {
        return new Action6<T1, T2, T3, T4, T5, T6>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
                a1.call(t1, t2, t3, t4, t5, t6);
                a2.call(t1, t2, t3, t4, t5, t6);
                a3.call(t1, t2, t3, t4, t5, t6);
                a4.call(t1, t2, t3, t4, t5, t6);
                a5.call(t1, t2, t3, t4, t5, t6);
                a6.call(t1, t2, t3, t4, t5, t6);
                a7.call(t1, t2, t3, t4, t5, t6);
                a8.call(t1, t2, t3, t4, t5, t6);
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
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5, T6> Action6<T1, T2, T3, T4, T5, T6> combine(@NonNull final Action6<T1, T2, T3, T4, T5, T6> a1, @NonNull final Action6<T1, T2, T3, T4, T5, T6> a2, @NonNull final Action6<T1, T2, T3, T4, T5, T6> a3, @NonNull final Action6<T1, T2, T3, T4, T5, T6> a4, @NonNull final Action6<T1, T2, T3, T4, T5, T6> a5, @NonNull final Action6<T1, T2, T3, T4, T5, T6> a6, @NonNull final Action6<T1, T2, T3, T4, T5, T6> a7, @NonNull final Action6<T1, T2, T3, T4, T5, T6> a8, @NonNull final Action6<T1, T2, T3, T4, T5, T6> a9) {
        return new Action6<T1, T2, T3, T4, T5, T6>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
                a1.call(t1, t2, t3, t4, t5, t6);
                a2.call(t1, t2, t3, t4, t5, t6);
                a3.call(t1, t2, t3, t4, t5, t6);
                a4.call(t1, t2, t3, t4, t5, t6);
                a5.call(t1, t2, t3, t4, t5, t6);
                a6.call(t1, t2, t3, t4, t5, t6);
                a7.call(t1, t2, t3, t4, t5, t6);
                a8.call(t1, t2, t3, t4, t5, t6);
                a9.call(t1, t2, t3, t4, t5, t6);
            }
        };
    }

    /**
     * Combines provided actions into a single action stream
     *
     * @param a Actions
     * @return Single action stream combined from provided actions
     */
    @SafeVarargs
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5, T6> Action6<T1, T2, T3, T4, T5, T6> combine(@NonNull final Action6<T1, T2, T3, T4, T5, T6>... a) {
        return new Action6<T1, T2, T3, T4, T5, T6>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
                //noinspection ForLoopReplaceableByForEach
                for (int i = 0, count = a.length; i < count; i++) {
                    a[i].call(t1, t2, t3, t4, t5, t6);
                }
            }
        };
    }

    /**
     * Combines provided actions into a single action stream
     *
     * @param a1 Action
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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

    /**
     * Combines provided actions into a single action stream
     *
     * @param a1 Action
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, T8> Action8<T1, T2, T3, T4, T5, T6, T7, T8> combine(@NonNull Action8<T1, T2, T3, T4, T5, T6, T7, T8> a1) {
        return a1;
    }

    /**
     * Combines provided actions into a single action stream
     *
     * @param a1 Action
     * @param a2 Action
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, T8> Action8<T1, T2, T3, T4, T5, T6, T7, T8> combine(@NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a1, @NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a2) {
        return new Action8<T1, T2, T3, T4, T5, T6, T7, T8>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
                a1.call(t1, t2, t3, t4, t5, t6, t7, t8);
                a2.call(t1, t2, t3, t4, t5, t6, t7, t8);
            }
        };
    }

    /**
     * Combines provided actions into a single action stream
     *
     * @param a1 Action
     * @param a2 Action
     * @param a3 Action
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, T8> Action8<T1, T2, T3, T4, T5, T6, T7, T8> combine(@NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a1, @NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a2, @NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a3) {
        return new Action8<T1, T2, T3, T4, T5, T6, T7, T8>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
                a1.call(t1, t2, t3, t4, t5, t6, t7, t8);
                a2.call(t1, t2, t3, t4, t5, t6, t7, t8);
                a3.call(t1, t2, t3, t4, t5, t6, t7, t8);
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
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, T8> Action8<T1, T2, T3, T4, T5, T6, T7, T8> combine(@NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a1, @NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a2, @NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a3, @NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a4) {
        return new Action8<T1, T2, T3, T4, T5, T6, T7, T8>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
                a1.call(t1, t2, t3, t4, t5, t6, t7, t8);
                a2.call(t1, t2, t3, t4, t5, t6, t7, t8);
                a3.call(t1, t2, t3, t4, t5, t6, t7, t8);
                a4.call(t1, t2, t3, t4, t5, t6, t7, t8);
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
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, T8> Action8<T1, T2, T3, T4, T5, T6, T7, T8> combine(@NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a1, @NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a2, @NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a3, @NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a4, @NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a5) {
        return new Action8<T1, T2, T3, T4, T5, T6, T7, T8>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
                a1.call(t1, t2, t3, t4, t5, t6, t7, t8);
                a2.call(t1, t2, t3, t4, t5, t6, t7, t8);
                a3.call(t1, t2, t3, t4, t5, t6, t7, t8);
                a4.call(t1, t2, t3, t4, t5, t6, t7, t8);
                a5.call(t1, t2, t3, t4, t5, t6, t7, t8);
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
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, T8> Action8<T1, T2, T3, T4, T5, T6, T7, T8> combine(@NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a1, @NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a2, @NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a3, @NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a4, @NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a5, @NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a6) {
        return new Action8<T1, T2, T3, T4, T5, T6, T7, T8>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
                a1.call(t1, t2, t3, t4, t5, t6, t7, t8);
                a2.call(t1, t2, t3, t4, t5, t6, t7, t8);
                a3.call(t1, t2, t3, t4, t5, t6, t7, t8);
                a4.call(t1, t2, t3, t4, t5, t6, t7, t8);
                a5.call(t1, t2, t3, t4, t5, t6, t7, t8);
                a6.call(t1, t2, t3, t4, t5, t6, t7, t8);
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
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, T8> Action8<T1, T2, T3, T4, T5, T6, T7, T8> combine(@NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a1, @NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a2, @NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a3, @NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a4, @NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a5, @NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a6, @NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a7) {
        return new Action8<T1, T2, T3, T4, T5, T6, T7, T8>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
                a1.call(t1, t2, t3, t4, t5, t6, t7, t8);
                a2.call(t1, t2, t3, t4, t5, t6, t7, t8);
                a3.call(t1, t2, t3, t4, t5, t6, t7, t8);
                a4.call(t1, t2, t3, t4, t5, t6, t7, t8);
                a5.call(t1, t2, t3, t4, t5, t6, t7, t8);
                a6.call(t1, t2, t3, t4, t5, t6, t7, t8);
                a7.call(t1, t2, t3, t4, t5, t6, t7, t8);
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
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, T8> Action8<T1, T2, T3, T4, T5, T6, T7, T8> combine(@NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a1, @NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a2, @NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a3, @NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a4, @NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a5, @NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a6, @NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a7, @NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a8) {
        return new Action8<T1, T2, T3, T4, T5, T6, T7, T8>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
                a1.call(t1, t2, t3, t4, t5, t6, t7, t8);
                a2.call(t1, t2, t3, t4, t5, t6, t7, t8);
                a3.call(t1, t2, t3, t4, t5, t6, t7, t8);
                a4.call(t1, t2, t3, t4, t5, t6, t7, t8);
                a5.call(t1, t2, t3, t4, t5, t6, t7, t8);
                a6.call(t1, t2, t3, t4, t5, t6, t7, t8);
                a7.call(t1, t2, t3, t4, t5, t6, t7, t8);
                a8.call(t1, t2, t3, t4, t5, t6, t7, t8);
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
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, T8> Action8<T1, T2, T3, T4, T5, T6, T7, T8> combine(@NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a1, @NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a2, @NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a3, @NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a4, @NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a5, @NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a6, @NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a7, @NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a8, @NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8> a9) {
        return new Action8<T1, T2, T3, T4, T5, T6, T7, T8>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
                a1.call(t1, t2, t3, t4, t5, t6, t7, t8);
                a2.call(t1, t2, t3, t4, t5, t6, t7, t8);
                a3.call(t1, t2, t3, t4, t5, t6, t7, t8);
                a4.call(t1, t2, t3, t4, t5, t6, t7, t8);
                a5.call(t1, t2, t3, t4, t5, t6, t7, t8);
                a6.call(t1, t2, t3, t4, t5, t6, t7, t8);
                a7.call(t1, t2, t3, t4, t5, t6, t7, t8);
                a8.call(t1, t2, t3, t4, t5, t6, t7, t8);
                a9.call(t1, t2, t3, t4, t5, t6, t7, t8);
            }
        };
    }

    /**
     * Combines provided actions into a single action stream
     *
     * @param a Actions
     * @return Single action stream combined from provided actions
     */
    @SafeVarargs
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, T8> Action8<T1, T2, T3, T4, T5, T6, T7, T8> combine(@NonNull final Action8<T1, T2, T3, T4, T5, T6, T7, T8>... a) {
        return new Action8<T1, T2, T3, T4, T5, T6, T7, T8>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
                //noinspection ForLoopReplaceableByForEach
                for (int i = 0, count = a.length; i < count; i++) {
                    a[i].call(t1, t2, t3, t4, t5, t6, t7, t8);
                }
            }
        };
    }

    /**
     * Combines provided actions into a single action stream
     *
     * @param a1 Action
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9> Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> combine(@NonNull Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a1) {
        return a1;
    }

    /**
     * Combines provided actions into a single action stream
     *
     * @param a1 Action
     * @param a2 Action
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9> Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> combine(@NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a1, @NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a2) {
        return new Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9) {
                a1.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                a2.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
            }
        };
    }

    /**
     * Combines provided actions into a single action stream
     *
     * @param a1 Action
     * @param a2 Action
     * @param a3 Action
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9> Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> combine(@NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a1, @NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a2, @NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a3) {
        return new Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9) {
                a1.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                a2.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                a3.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
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
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9> Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> combine(@NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a1, @NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a2, @NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a3, @NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a4) {
        return new Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9) {
                a1.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                a2.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                a3.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                a4.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
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
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9> Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> combine(@NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a1, @NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a2, @NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a3, @NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a4, @NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a5) {
        return new Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9) {
                a1.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                a2.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                a3.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                a4.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                a5.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
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
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9> Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> combine(@NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a1, @NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a2, @NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a3, @NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a4, @NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a5, @NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a6) {
        return new Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9) {
                a1.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                a2.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                a3.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                a4.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                a5.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                a6.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
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
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9> Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> combine(@NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a1, @NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a2, @NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a3, @NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a4, @NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a5, @NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a6, @NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a7) {
        return new Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9) {
                a1.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                a2.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                a3.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                a4.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                a5.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                a6.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                a7.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
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
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9> Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> combine(@NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a1, @NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a2, @NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a3, @NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a4, @NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a5, @NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a6, @NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a7, @NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a8) {
        return new Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9) {
                a1.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                a2.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                a3.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                a4.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                a5.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                a6.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                a7.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                a8.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
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
     * @return Single action stream combined from provided actions
     */
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9> Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> combine(@NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a1, @NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a2, @NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a3, @NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a4, @NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a5, @NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a6, @NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a7, @NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a8, @NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> a9) {
        return new Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9) {
                a1.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                a2.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                a3.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                a4.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                a5.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                a6.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                a7.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                a8.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                a9.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
            }
        };
    }

    /**
     * Combines provided actions into a single action stream
     *
     * @param a Actions
     * @return Single action stream combined from provided actions
     */
    @SafeVarargs
    @CheckResult
    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9> Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> combine(@NonNull final Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9>... a) {
        return new Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9>() {
            @Override
            public void call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9) {
                //noinspection ForLoopReplaceableByForEach
                for (int i = 0, count = a.length; i < count; i++) {
                    a[i].call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                }
            }
        };
    }

    /**
     * Combines provided actions into a single action stream
     *
     * @param a1 Action
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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
     * @return Single action stream combined from provided actions
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

    private Actions() {
        throw new AssertionError("No instances.");
    }
}
