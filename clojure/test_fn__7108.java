package clojure;

import clojure.lang.*;

public final class test_fn__7108 extends clojure.lang.AFunction {
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
 public static final clojure.lang.Keyword const__14;
 public static final clojure.lang.Var const__15;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__3 = (clojure.lang.Var)RT.var("clojure.test", "*test-out*");
  const__4 = (clojure.lang.Var)RT.var("clojure.test", "inc-report-counter");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "fail");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "println");
  const__7 = (clojure.lang.Var)RT.var("clojure.test", "testing-vars-str");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__9 = (clojure.lang.Var)RT.var("clojure.test", "*testing-contexts*");
  const__10 = (clojure.lang.Var)RT.var("clojure.test", "testing-contexts-str");
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "message");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "pr-str");
  const__13 = (clojure.lang.Keyword)Keyword.intern(null, "expected");
  const__14 = (clojure.lang.Keyword)Keyword.intern(null, "actual");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 public test_fn__7108() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object m1) {
  {
   ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2, const__3.get()));
   try {
    ((IFn)const__4.getRawRoot()).invoke(const__5);
    ((IFn)const__6.getRawRoot()).invoke("\nFAIL in", ((IFn)const__7.getRawRoot()).invoke(m1));
    Object __r4678 = ((IFn)const__8.getRawRoot()).invoke(const__9.get());
    if (__r4678 != null && !(__r4678 == Boolean.FALSE)) {
     ((IFn)const__6.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke());
    } else {
    }
    {
     Object temp__4117__auto__4 = RT.get(m1, Keyword.intern(null, "message"));
     Object __r4680 = temp__4117__auto__4;
     if (__r4680 != null && !(__r4680 == Boolean.FALSE)) {
      {
       Object message5 = temp__4117__auto__4;
       ((IFn)const__6.getRawRoot()).invoke(message5);
      }
     } else {
     }
    }
    ((IFn)const__6.getRawRoot()).invoke("expected:", ((IFn)const__12.getRawRoot()).invoke(RT.get(m1, Keyword.intern(null, "expected"))));
    return ((IFn)const__6.getRawRoot()).invoke("  actual:", ((IFn)const__12.getRawRoot()).invoke(RT.get(m1, Keyword.intern(null, "actual"))));
   } finally {
    ((IFn)const__15.getRawRoot()).invoke();
   }
  }
 }
}
