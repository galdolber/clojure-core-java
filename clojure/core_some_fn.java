package clojure;

import clojure.lang.*;

public final class core_some_fn extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "list*");
 }
 public core_some_fn() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object p11, java.lang.Object p22, java.lang.Object p33, java.lang.Object ps4) {
  {
   Object ps5 = ((IFn)const__0.getRawRoot()).invoke(p11, p22, p33, ps4);
   return new clojure.core_some_fn_spn__6527(ps5);
  }
 }
 public java.lang.Object invoke(java.lang.Object p11, java.lang.Object p22, java.lang.Object p33) {
  return new clojure.core_some_fn_sp3__6505(p11, p22, p33);
 }
 public java.lang.Object invoke(java.lang.Object p11, java.lang.Object p22) {
  return new clojure.core_some_fn_sp2__6490(p11, p22);
 }
 public java.lang.Object invoke(java.lang.Object p1) {
  return new clojure.core_some_fn_sp1__6484(p1);
 }
 public int getRequiredArity() {
  return 3;
 }
}
