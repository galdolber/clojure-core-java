package clojure;

import clojure.lang.*;

public final class pprint_pprint_let extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final java.lang.Object const__8;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "level-exceeded");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__4 = (clojure.lang.Var)RT.var("clojure.pprint", "*current-level*");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "var-get");
  const__7 = (clojure.lang.Var)RT.var("clojure.pprint", "*current-length*");
  const__8 = (java.lang.Object)0L;
 }
 public pprint_pprint_let() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object alis1) {
  try {
   {
    Object base_sym2 = ((IFn)const__0.getRawRoot()).invoke(alis1);
    Object __r6133 = ((IFn)const__1).invoke();
    if (__r6133 != null && !(__r6133 == Boolean.FALSE)) {
     ((java.io.Writer)const__2.get()).write((java.lang.String)((java.lang.String)"#"));
    } else {
     ((IFn)const__3.getRawRoot()).invoke(RT.map(const__4, ((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)((IFn)const__6.getRawRoot()).invoke(const__4)))), const__7, const__8));
     ((IFn)new clojure.pprint_pprint_let_fn__8408(alis1, base_sym2)).invoke();
    }
    return null;
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
