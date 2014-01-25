package clojure;

import clojure.lang.*;

public final class pprint_pprint_ns_reference extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "sequential?");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "brackets");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__3 = (java.lang.Object)0L;
  const__4 = (java.lang.Object)1L;
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "nthnext");
  const__6 = (clojure.lang.Var)RT.var("clojure.pprint", "level-exceeded");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__9 = (clojure.lang.Var)RT.var("clojure.pprint", "*current-level*");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "var-get");
  const__12 = (clojure.lang.Var)RT.var("clojure.pprint", "*current-length*");
  const__13 = (clojure.lang.Var)RT.var("clojure.pprint", "write-out");
 }
 public pprint_pprint_ns_reference() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object reference1) {
  try {
   Object __r6018 = ((IFn)const__0.getRawRoot()).invoke(reference1);
   if (__r6018 != null && !(__r6018 == Boolean.FALSE)) {
    {
     Object vec__82792 = ((IFn)const__1.getRawRoot()).invoke(reference1);
     Object start3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__82792), (int)RT.intCast(0L), ((java.lang.Object)null)));
     Object end4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__82792), (int)RT.intCast(1L), ((java.lang.Object)null)));
     Object vec__82805 = reference1;
     Object keyw6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__82805), (int)RT.intCast(0L), ((java.lang.Object)null)));
     Object args7 = ((IFn)const__5.getRawRoot()).invoke(vec__82805, const__4);
     Object __r6020 = ((IFn)const__6).invoke();
     if (__r6020 != null && !(__r6020 == Boolean.FALSE)) {
      ((java.io.Writer)const__7.get()).write((java.lang.String)((java.lang.String)"#"));
     } else {
      ((IFn)const__8.getRawRoot()).invoke(RT.map(const__9, ((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)((IFn)const__11.getRawRoot()).invoke(const__9)))), const__12, const__3));
      ((IFn)new clojure.pprint_pprint_ns_reference_fn__8281(keyw6, end4, start3, args7)).invoke();
     }
     return null;
    }
   } else {
    return ((IFn)const__13.getRawRoot()).invoke(reference1);
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
