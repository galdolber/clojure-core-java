package clojure;

import clojure.lang.*;

public final class test_test_ns extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
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
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Keyword const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Var const__18;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__2 = (clojure.lang.Var)RT.var("clojure.test", "*report-counters*");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "ref");
  const__4 = (clojure.lang.Var)RT.var("clojure.test", "*initial-report-counters*");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "the-ns");
  const__6 = (clojure.lang.Var)RT.var("clojure.test", "do-report");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "type");
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "begin-test-ns");
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "ns");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "find-var");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "symbol");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "ns-name");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "var-get");
  const__15 = (clojure.lang.Var)RT.var("clojure.test", "test-all-vars");
  const__16 = (clojure.lang.Keyword)Keyword.intern(null, "end-test-ns");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 public test_test_ns() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object ns1) {
  {
   ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2, ((IFn)const__3.getRawRoot()).invoke(const__4.get())));
   try {
    {
     Object ns_obj4 = ((IFn)const__5.getRawRoot()).invoke(ns1);
     ((IFn)const__6.getRawRoot()).invoke(RT.mapUniqueKeys(const__7, const__8, const__9, ns_obj4));
     {
      Object temp__4115__auto__5 = ((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(ns_obj4)), "test-ns-hook"));
      Object __r4742 = temp__4115__auto__5;
      if (__r4742 != null && !(__r4742 == Boolean.FALSE)) {
       {
        Object v6 = temp__4115__auto__5;
        ((IFn)((IFn)const__14.getRawRoot()).invoke(v6)).invoke();
       }
      } else {
       ((IFn)const__15.getRawRoot()).invoke(ns_obj4);
      }
     }
     ((IFn)const__6.getRawRoot()).invoke(RT.mapUniqueKeys(const__7, const__16, const__9, ns_obj4));
    }
    return ((IFn)const__17.getRawRoot()).invoke(const__2.get());
   } finally {
    ((IFn)const__18.getRawRoot()).invoke();
   }
  }
 }
}
