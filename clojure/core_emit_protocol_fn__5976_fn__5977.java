package clojure;

import clojure.lang.*;

public final class core_emit_protocol_fn__5976_fn__5977 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Symbol const__5;
 public static final clojure.lang.Symbol const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "vec");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "repeat");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "dec");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__5 = (clojure.lang.Symbol)Symbol.intern(null, "Object");
  const__6 = (clojure.lang.Symbol)Symbol.intern(null, "Object");
 }
 Object m2;
 public core_emit_protocol_fn__5976_fn__5977(final Object m2) {
  super();
  this.m2 = m2;
 }
 public java.lang.Object invoke(java.lang.Object p1__5962_SHARP_1) {
  return ((IFn)const__0.getRawRoot()).invoke(this.m2, ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(Numbers.num(clojure.lang.Numbers.dec((long)clojure.lang.RT.count(((java.lang.Object)p1__5962_SHARP_1)))), const__5)), const__6);
 }
}
