package clojure;

import clojure.lang.*;

public final class core_some_fn_spn__6527 extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "some");
 }
 Object ps5;
 public core_some_fn_spn__6527(final Object ps5) {
  super();
  this.ps5 = ps5;
 }
 public java.lang.Object doInvoke(java.lang.Object x1, java.lang.Object y2, java.lang.Object z3, java.lang.Object args4) {
  {
   Object or__3968__auto__5 = ((IFn)this).invoke(x1, y2, z3);
   Object __r4316 = or__3968__auto__5;
   if (__r4316 != null && !(__r4316 == Boolean.FALSE)) {
    return or__3968__auto__5;
   } else {
    return ((IFn)const__0.getRawRoot()).invoke(new clojure.core_some_fn_spn__6527_fn__6537(args4), this.ps5);
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2, java.lang.Object z3) {
  return ((IFn)const__0.getRawRoot()).invoke(new clojure.core_some_fn_spn__6527_fn__6533(x1, y2, z3), this.ps5);
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2) {
  return ((IFn)const__0.getRawRoot()).invoke(new clojure.core_some_fn_spn__6527_fn__6530(x1, y2), this.ps5);
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return ((IFn)const__0.getRawRoot()).invoke(new clojure.core_some_fn_spn__6527_fn__6528(x1), this.ps5);
 }
 public java.lang.Object invoke() {
  return null;
 }
 public int getRequiredArity() {
  return 3;
 }
}
