package clojure.test;

import clojure.lang.*;

public final class tap_print_diagnostics extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Keyword const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Keyword const__9;
 public static final clojure.lang.Keyword const__10;
 public static final clojure.lang.Keyword const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.test", "*testing-contexts*");
  const__2 = (clojure.lang.Var)RT.var("clojure.test.tap", "print-tap-diagnostic");
  const__3 = (clojure.lang.Var)RT.var("clojure.test", "testing-contexts-str");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "message");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "pr-str");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "expected");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "pass");
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "type");
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "actual");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
 }
 public tap_print_diagnostics() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object data1) {
  Object __r4755 = ((IFn)const__0.getRawRoot()).invoke(const__1.get());
  if (__r4755 != null && !(__r4755 == Boolean.FALSE)) {
   ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke());
  } else {
  }
  Object __r4757 = RT.get(data1, Keyword.intern(null, "message"));
  if (__r4757 != null && !(__r4757 == Boolean.FALSE)) {
   ((IFn)const__2.getRawRoot()).invoke(RT.get(data1, Keyword.intern(null, "message")));
  } else {
  }
  ((IFn)const__2.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke("expected:", ((IFn)const__6.getRawRoot()).invoke(RT.get(data1, Keyword.intern(null, "expected")))));
  if (clojure.lang.Util.equiv(((java.lang.Object)const__9), ((java.lang.Object)RT.get(data1, Keyword.intern(null, "type"))))) {
   return ((IFn)const__2.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke("  actual:", ((IFn)const__6.getRawRoot()).invoke(RT.get(data1, Keyword.intern(null, "actual")))));
  } else {
   Object __r4759 = null;
   {
    Object s__4646__auto__2 = new java.io.StringWriter();
    Object __r4760 = null;
    {
     ((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(const__14, s__4646__auto__2));
     __r4760 = ((IFn)new clojure.test.tap_print_diagnostics_fn__7233(s__4646__auto__2, data1)).invoke();
    }
    __r4759 = __r4760;
   }
   return ((IFn)const__2.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke("  actual:", __r4759));
  }
 }
}
