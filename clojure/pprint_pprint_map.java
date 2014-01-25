package clojure;

import clojure.lang.*;

public final class pprint_pprint_map extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final java.lang.Object const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "level-exceeded");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__3 = (clojure.lang.Var)RT.var("clojure.pprint", "*current-level*");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "var-get");
  const__6 = (clojure.lang.Var)RT.var("clojure.pprint", "*current-length*");
  const__7 = (java.lang.Object)0L;
 }
 public pprint_pprint_map() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object amap1) {
  try {
   Object __r5937 = ((IFn)const__0).invoke();
   if (__r5937 != null && !(__r5937 == Boolean.FALSE)) {
    ((java.io.Writer)const__1.get()).write((java.lang.String)((java.lang.String)"#"));
   } else {
    ((IFn)const__2.getRawRoot()).invoke(RT.map(const__3, ((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)((IFn)const__5.getRawRoot()).invoke(const__3)))), const__6, const__7));
    ((IFn)new clojure.pprint_pprint_map_fn__8242(amap1)).invoke();
   }
   return null;
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
