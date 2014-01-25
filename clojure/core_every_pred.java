package clojure;

import clojure.lang.*;

public final class core_every_pred extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "list*");
 }
 public core_every_pred() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object p11, java.lang.Object p22, java.lang.Object p33, java.lang.Object ps4) {
  {
   Object ps5 = ((IFn)const__0.getRawRoot()).invoke(p11, p22, p33, ps4);
   return new clojure.core_every_pred_epn__6463(ps5);
  }
 }
 public java.lang.Object invoke(java.lang.Object p11, java.lang.Object p22, java.lang.Object p33) {
  return new clojure.core_every_pred_ep3__6441(p11, p22, p33);
 }
 public java.lang.Object invoke(java.lang.Object p11, java.lang.Object p22) {
  return new clojure.core_every_pred_ep2__6426(p11, p22);
 }
 public java.lang.Object invoke(java.lang.Object p1) {
  return new clojure.core_every_pred_ep1__6420(p1);
 }
 public int getRequiredArity() {
  return 3;
 }
}
