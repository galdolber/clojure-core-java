package clojure;

import clojure.lang.*;

public final class core_nary_inline_fn__3986 extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Symbol const__4;
 public static final clojure.lang.Symbol const__5;
 public static final clojure.lang.Symbol const__6;
 public static final clojure.lang.Symbol const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Symbol const__9;
 public static final clojure.lang.Symbol const__10;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "*unchecked-math*");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__4 = (clojure.lang.Symbol)Symbol.intern(null, ".");
  const__5 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.lang.Numbers");
  const__6 = (clojure.lang.Symbol)Symbol.intern(null, ".");
  const__7 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.lang.Numbers");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "reduce1");
  const__9 = (clojure.lang.Symbol)Symbol.intern(null, ".");
  const__10 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.lang.Numbers");
 }
 Object op1;
 Object unchecked_op2;
 public core_nary_inline_fn__3986(final Object op1, final Object unchecked_op2) {
  super();
  this.op1 = op1;
  this.unchecked_op2 = unchecked_op2;
 }
 public java.lang.Object doInvoke(java.lang.Object x1, java.lang.Object y2, java.lang.Object more3) {
  {
   Object __r2349;
   Object __r2350 = const__0.get();
   if (__r2350 != null && !(__r2350 == Boolean.FALSE)) {
    __r2349 = this.unchecked_op2;
   } else {
    __r2349 = this.op1;
   }
   Object op4 = __r2349;
   return ((IFn)const__8.getRawRoot()).invoke(new clojure.core_nary_inline_fn__3986_fn__3987(op4), ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__9), ((IFn)const__3.getRawRoot()).invoke(const__10), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(op4), ((IFn)const__3.getRawRoot()).invoke(x1), ((IFn)const__3.getRawRoot()).invoke(y2)))))), more3);
  }
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2) {
  {
   Object __r2351;
   Object __r2352 = const__0.get();
   if (__r2352 != null && !(__r2352 == Boolean.FALSE)) {
    __r2351 = this.unchecked_op2;
   } else {
    __r2351 = this.op1;
   }
   Object op3 = __r2351;
   return ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__6), ((IFn)const__3.getRawRoot()).invoke(const__7), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(op3), ((IFn)const__3.getRawRoot()).invoke(x1), ((IFn)const__3.getRawRoot()).invoke(y2))))));
  }
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  {
   Object __r2353;
   Object __r2354 = const__0.get();
   if (__r2354 != null && !(__r2354 == Boolean.FALSE)) {
    __r2353 = this.unchecked_op2;
   } else {
    __r2353 = this.op1;
   }
   Object op2 = __r2353;
   return ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__4), ((IFn)const__3.getRawRoot()).invoke(const__5), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(op2), ((IFn)const__3.getRawRoot()).invoke(x1))))));
  }
 }
 public int getRequiredArity() {
  return 2;
 }
}
