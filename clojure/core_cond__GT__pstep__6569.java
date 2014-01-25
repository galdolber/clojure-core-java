package clojure;

import clojure.lang.*;

public final class core_cond__GT__pstep__6569 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Symbol const__6;
 public static final clojure.lang.Symbol const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__6 = (clojure.lang.Symbol)Symbol.intern(null, "if");
  const__7 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "->");
 }
 Object g5;
 public core_cond__GT__pstep__6569(final Object g5) {
  super();
  this.g5 = g5;
 }
 public java.lang.Object invoke(java.lang.Object p__65681) {
  {
   Object vec__65702 = p__65681;
   Object test3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__65702), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object step4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__65702), (int)RT.intCast(1L), ((java.lang.Object)null)));
   return ((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(const__6), ((IFn)const__5.getRawRoot()).invoke(test3), ((IFn)const__5.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(const__7), ((IFn)const__5.getRawRoot()).invoke(this.g5), ((IFn)const__5.getRawRoot()).invoke(step4)))), ((IFn)const__5.getRawRoot()).invoke(this.g5)));
  }
 }
}
