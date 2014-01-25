package clojure;

import clojure.lang.*;

public final class core_fn__5454 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "*print-dup*");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "*print-readably*");
  const__2 = (java.lang.Object)Character.valueOf((char)92);
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "char-name-string");
 }
 public core_fn__5454() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object c1, java.lang.Object w2) {
  try {
   Object __r3466 = null;
   {
    Object or__3968__auto__3 = const__0.get();
    Object __r3467;
    Object __r3468 = or__3968__auto__3;
    if (__r3468 != null && !(__r3468 == Boolean.FALSE)) {
     __r3467 = or__3968__auto__3;
    } else {
     __r3467 = const__1.get();
    }
    __r3466 = __r3467;
   }
   Object __r3469 = __r3466;
   if (__r3469 != null && !(__r3469 == Boolean.FALSE)) {
    ((java.io.Writer)w2).append((char)((Character)const__2).charValue());
    {
     Object n4 = ((IFn)const__3.getRawRoot()).invoke(c1);
     Object __r3471 = n4;
     if (__r3471 != null && !(__r3471 == Boolean.FALSE)) {
      ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)n4));
     } else {
      ((java.io.Writer)w2).append((char)((Character)c1).charValue());
     }
    }
   } else {
    ((java.io.Writer)w2).append((char)((Character)c1).charValue());
   }
   return null;
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
