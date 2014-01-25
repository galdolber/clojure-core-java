package clojure;

import clojure.lang.*;

public final class core_comp extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "identity");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "reverse");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "list*");
 }
 public core_comp() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object f11, java.lang.Object f22, java.lang.Object f33, java.lang.Object fs4) {
  {
   Object fs5 = ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(f11, f22, f33, fs4));
   return new clojure.core_comp_fn__4183(fs5);
  }
 }
 public java.lang.Object invoke(java.lang.Object f1, java.lang.Object g2, java.lang.Object h3) {
  return new clojure.core_comp_fn__4181(h3, g2, f1);
 }
 public java.lang.Object invoke(java.lang.Object f1, java.lang.Object g2) {
  return new clojure.core_comp_fn__4179(g2, f1);
 }
 public java.lang.Object invoke(java.lang.Object f1) {
  return f1;
 }
 public java.lang.Object invoke() {
  return const__0.getRawRoot();
 }
 public int getRequiredArity() {
  return 3;
 }
}
