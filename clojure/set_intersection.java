package clojure;

import clojure.lang.*;

public final class set_intersection extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "reduce");
  const__3 = (clojure.lang.Var)RT.var("clojure.set", "bubble-max-key");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__5 = (clojure.lang.Var)RT.var("clojure.set", "intersection");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "rest");
 }
 public set_intersection() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object s11, java.lang.Object s22, java.lang.Object sets3) {
  {
   Object bubbled_sets4 = ((IFn)const__3.getRawRoot()).invoke(new clojure.set_intersection_fn__6861(), ((IFn)const__4.getRawRoot()).invoke(sets3, s22, s11));
   return ((IFn)const__2.getRawRoot()).invoke(const__5.getRawRoot(), ((IFn)const__6.getRawRoot()).invoke(bubbled_sets4), ((IFn)const__7.getRawRoot()).invoke(bubbled_sets4));
  }
 }
 public java.lang.Object invoke(java.lang.Object s11, java.lang.Object s22) {
  while(true) {
   if (clojure.lang.Numbers.lt((long)clojure.lang.RT.count(((java.lang.Object)s22)), (long)clojure.lang.RT.count(((java.lang.Object)s11)))) {
    java.lang.Object s11___aux = s22;
    java.lang.Object s22___aux = s11;
    s11 = s11___aux;
    s22 = s22___aux;
    continue;
   } else {
    return ((IFn)const__2.getRawRoot()).invoke(new clojure.set_intersection_fn__6859(s22), s11, s11);
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object s11) {
  return s11;
 }
 public int getRequiredArity() {
  return 2;
 }
}
