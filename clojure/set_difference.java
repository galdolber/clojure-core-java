package clojure;

import clojure.lang.*;

public final class set_difference extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "reduce");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "disj");
  const__4 = (clojure.lang.Var)RT.var("clojure.set", "difference");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "conj");
 }
 public set_difference() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object s11, java.lang.Object s22, java.lang.Object sets3) {
  return ((IFn)const__2.getRawRoot()).invoke(const__4.getRawRoot(), s11, ((IFn)const__5.getRawRoot()).invoke(sets3, s22));
 }
 public java.lang.Object invoke(java.lang.Object s11, java.lang.Object s22) {
  if (clojure.lang.Numbers.lt((long)clojure.lang.RT.count(((java.lang.Object)s11)), (long)clojure.lang.RT.count(((java.lang.Object)s22)))) {
   return ((IFn)const__2.getRawRoot()).invoke(new clojure.set_difference_fn__6864(s22), s11, s11);
  } else {
   return ((IFn)const__2.getRawRoot()).invoke(const__3.getRawRoot(), s11, s22);
  }
 }
 public java.lang.Object invoke(java.lang.Object s11) {
  return s11;
 }
 public int getRequiredArity() {
  return 2;
 }
}
