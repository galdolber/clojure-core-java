package clojure;

import clojure.lang.*;

public final class core_every_pred_epn__6463 extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "every?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "boolean");
 }
 Object ps5;
 public core_every_pred_epn__6463(final Object ps5) {
  super();
  this.ps5 = ps5;
 }
 public java.lang.Object doInvoke(java.lang.Object x1, java.lang.Object y2, java.lang.Object z3, java.lang.Object args4) {
  Object __r4240 = null;
  {
   Object and__3966__auto__5 = ((IFn)this).invoke(x1, y2, z3);
   Object __r4241;
   Object __r4242 = and__3966__auto__5;
   if (__r4242 != null && !(__r4242 == Boolean.FALSE)) {
    __r4241 = ((IFn)const__0.getRawRoot()).invoke(new clojure.core_every_pred_epn__6463_fn__6473(args4), this.ps5);
   } else {
    __r4241 = and__3966__auto__5;
   }
   __r4240 = __r4241;
  }
  return (clojure.lang.RT.booleanCast(((java.lang.Object)__r4240)) ? Boolean.TRUE : Boolean.FALSE);
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2, java.lang.Object z3) {
  return ((IFn)const__0.getRawRoot()).invoke(new clojure.core_every_pred_epn__6463_fn__6469(x1, y2, z3), this.ps5);
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2) {
  return ((IFn)const__0.getRawRoot()).invoke(new clojure.core_every_pred_epn__6463_fn__6466(x1, y2), this.ps5);
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return ((IFn)const__0.getRawRoot()).invoke(new clojure.core_every_pred_epn__6463_fn__6464(x1), this.ps5);
 }
 public java.lang.Object invoke() {
  return Boolean.TRUE;
 }
 public int getRequiredArity() {
  return 3;
 }
}
