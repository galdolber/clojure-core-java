package clojure;

import clojure.lang.*;

public final class test_fn__7111 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Keyword const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Keyword const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Keyword const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Keyword const__15;
 public static final clojure.lang.Var const__16;
 public static final java.lang.Object const__17;
 public static final clojure.lang.Var const__18;
 public static final clojure.lang.Var const__19;
 public static final clojure.lang.Var const__20;
 public static final clojure.lang.Var const__21;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__3 = (clojure.lang.Var)RT.var("clojure.test", "*test-out*");
  const__4 = (clojure.lang.Var)RT.var("clojure.test", "inc-report-counter");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "error");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "println");
  const__7 = (clojure.lang.Var)RT.var("clojure.test", "testing-vars-str");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__9 = (clojure.lang.Var)RT.var("clojure.test", "*testing-contexts*");
  const__10 = (clojure.lang.Var)RT.var("clojure.test", "testing-contexts-str");
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "message");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "pr-str");
  const__13 = (clojure.lang.Keyword)Keyword.intern(null, "expected");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "print");
  const__15 = (clojure.lang.Keyword)Keyword.intern(null, "actual");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__17 = (java.lang.Object)java.lang.Throwable.class;
  const__18 = (clojure.lang.Var)RT.var("clojure.stacktrace", "print-cause-trace");
  const__19 = (clojure.lang.Var)RT.var("clojure.test", "*stack-trace-depth*");
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "prn");
  const__21 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 public test_fn__7111() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object m1) {
  {
   ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2, const__3.get()));
   try {
    ((IFn)const__4.getRawRoot()).invoke(const__5);
    ((IFn)const__6.getRawRoot()).invoke("\nERROR in", ((IFn)const__7.getRawRoot()).invoke(m1));
    Object __r4682 = ((IFn)const__8.getRawRoot()).invoke(const__9.get());
    if (__r4682 != null && !(__r4682 == Boolean.FALSE)) {
     ((IFn)const__6.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke());
    } else {
    }
    {
     Object temp__4117__auto__4 = RT.get(m1, Keyword.intern(null, "message"));
     Object __r4684 = temp__4117__auto__4;
     if (__r4684 != null && !(__r4684 == Boolean.FALSE)) {
      {
       Object message5 = temp__4117__auto__4;
       ((IFn)const__6.getRawRoot()).invoke(message5);
      }
     } else {
     }
    }
    ((IFn)const__6.getRawRoot()).invoke("expected:", ((IFn)const__12.getRawRoot()).invoke(RT.get(m1, Keyword.intern(null, "expected"))));
    ((IFn)const__14.getRawRoot()).invoke("  actual: ");
    {
     Object actual6 = RT.get(m1, Keyword.intern(null, "actual"));
     if ((actual6 instanceof java.lang.Throwable)) {
      return ((IFn)const__18.getRawRoot()).invoke(actual6, const__19.get());
     } else {
      return ((IFn)const__20.getRawRoot()).invoke(actual6);
     }
    }
   } finally {
    ((IFn)const__21.getRawRoot()).invoke();
   }
  }
 }
}
