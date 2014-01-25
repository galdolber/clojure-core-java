package clojure;

import clojure.lang.*;

public final class set_union extends clojure.lang.RestFn {
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
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__4 = (clojure.lang.Var)RT.var("clojure.set", "bubble-max-key");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "into");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "rest");
 }
 public set_union() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object s11, java.lang.Object s22, java.lang.Object sets3) {
  {
   Object bubbled_sets4 = ((IFn)const__4.getRawRoot()).invoke(const__1.getRawRoot(), ((IFn)const__3.getRawRoot()).invoke(sets3, s22, s11));
   return ((IFn)const__2.getRawRoot()).invoke(const__5.getRawRoot(), ((IFn)const__6.getRawRoot()).invoke(bubbled_sets4), ((IFn)const__7.getRawRoot()).invoke(bubbled_sets4));
  }
 }
 public java.lang.Object invoke(java.lang.Object s11, java.lang.Object s22) {
  if (clojure.lang.Numbers.lt((long)clojure.lang.RT.count(((java.lang.Object)s11)), (long)clojure.lang.RT.count(((java.lang.Object)s22)))) {
   return ((IFn)const__2.getRawRoot()).invoke(const__3.getRawRoot(), s22, s11);
  } else {
   return ((IFn)const__2.getRawRoot()).invoke(const__3.getRawRoot(), s11, s22);
  }
 }
 public java.lang.Object invoke(java.lang.Object s11) {
  return s11;
 }
 public java.lang.Object invoke() {
  return clojure.lang.PersistentHashSet.EMPTY;
 }
 public int getRequiredArity() {
  return 2;
 }
}
