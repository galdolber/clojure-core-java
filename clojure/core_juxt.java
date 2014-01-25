package clojure;

import clojure.lang.*;

public final class core_juxt extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "list*");
 }
 public core_juxt() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object f1, java.lang.Object g2, java.lang.Object h3, java.lang.Object fs4) {
  {
   Object fs5 = ((IFn)const__0.getRawRoot()).invoke(f1, g2, h3, fs4);
   return new clojure.core_juxt_fn__4202(fs5);
  }
 }
 public java.lang.Object invoke(java.lang.Object f1, java.lang.Object g2, java.lang.Object h3) {
  return new clojure.core_juxt_fn__4200(h3, f1, g2);
 }
 public java.lang.Object invoke(java.lang.Object f1, java.lang.Object g2) {
  return new clojure.core_juxt_fn__4198(f1, g2);
 }
 public java.lang.Object invoke(java.lang.Object f1) {
  return new clojure.core_juxt_fn__4196(f1);
 }
 public int getRequiredArity() {
  return 3;
 }
}
