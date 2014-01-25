package clojure;

import clojure.lang.*;

public final class pprint_pprint_condp extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final java.lang.Object const__10;
 public static final clojure.lang.Var const__11;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", ">");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__2 = (java.lang.Object)3L;
  const__3 = (clojure.lang.Var)RT.var("clojure.pprint", "level-exceeded");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__6 = (clojure.lang.Var)RT.var("clojure.pprint", "*current-level*");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "var-get");
  const__9 = (clojure.lang.Var)RT.var("clojure.pprint", "*current-length*");
  const__10 = (java.lang.Object)0L;
  const__11 = (clojure.lang.Var)RT.var("clojure.pprint", "pprint-simple-code-list");
 }
 public pprint_pprint_condp() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object alis1) {
  try {
   if (clojure.lang.Numbers.gt((long)clojure.lang.RT.count(((java.lang.Object)alis1)), (long)3L)) {
    Object __r6171 = ((IFn)const__3).invoke();
    if (__r6171 != null && !(__r6171 == Boolean.FALSE)) {
     ((java.io.Writer)const__4.get()).write((java.lang.String)((java.lang.String)"#"));
    } else {
     ((IFn)const__5.getRawRoot()).invoke(RT.map(const__6, ((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)((IFn)const__8.getRawRoot()).invoke(const__6)))), const__9, const__10));
     ((IFn)new clojure.pprint_pprint_condp_fn__8436(alis1)).invoke();
    }
    return null;
   } else {
    return ((IFn)const__11.getRawRoot()).invoke(alis1);
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
