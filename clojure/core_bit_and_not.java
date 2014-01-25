package clojure;

import clojure.lang.*;

public final class core_bit_and_not extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "reduce1");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "bit-and-not");
 }
 public core_bit_and_not() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object x1, java.lang.Object y2, java.lang.Object more3) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), Numbers.num(clojure.lang.Numbers.andNot(((java.lang.Object)x1), ((java.lang.Object)y2))), more3);
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2) {
  return Numbers.num(clojure.lang.Numbers.andNot(((java.lang.Object)x1), ((java.lang.Object)y2)));
 }
 public int getRequiredArity() {
  return 2;
 }
}
