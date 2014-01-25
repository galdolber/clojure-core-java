package clojure;

import clojure.lang.*;

public final class test_test_var extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Keyword const__7;
 public static final clojure.lang.Keyword const__8;
 public static final clojure.lang.Keyword const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Keyword const__11;
 public static final clojure.lang.Var const__12;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "test");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "meta");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__4 = (clojure.lang.Var)RT.var("clojure.test", "*testing-vars*");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__6 = (clojure.lang.Var)RT.var("clojure.test", "do-report");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "type");
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "begin-test-var");
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "var");
  const__10 = (clojure.lang.Var)RT.var("clojure.test", "inc-report-counter");
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "end-test-var");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 public test_test_var() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object v1) {
  {
   Object temp__4117__auto__2 = RT.get(((IFn)const__1.getRawRoot()).invoke(v1), Keyword.intern(null, "test"));
   Object __r4731 = temp__4117__auto__2;
   if (__r4731 != null && !(__r4731 == Boolean.FALSE)) {
    {
     Object t3 = temp__4117__auto__2;
     {
      ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__4, ((IFn)const__5.getRawRoot()).invoke(const__4.get(), v1)));
      try {
       ((IFn)const__6.getRawRoot()).invoke(RT.mapUniqueKeys(const__7, const__8, const__9, v1));
       ((IFn)const__10.getRawRoot()).invoke(const__0);
       ((IFn)new clojure.test_test_var_fn__7188(t3)).invoke();
       return ((IFn)const__6.getRawRoot()).invoke(RT.mapUniqueKeys(const__7, const__11, const__9, v1));
      } finally {
       ((IFn)const__12.getRawRoot()).invoke();
      }
     }
    }
   } else {
    return null;
   }
  }
 }
}
