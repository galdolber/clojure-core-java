package clojure;

import clojure.lang.*;

public final class core_concat extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "concat");
 }
 public core_concat() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object x1, java.lang.Object y2, java.lang.Object zs3) {
  {
   Object cat4 = new clojure.core_concat_cat__3950();
   return ((IFn)cat4).invoke(((IFn)const__0.getRawRoot()).invoke(x1, y2), zs3);
  }
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2) {
  return new clojure.lang.LazySeq((clojure.lang.IFn)((clojure.lang.IFn)new clojure.core_concat_fn__3948(x1, y2)));
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return new clojure.lang.LazySeq((clojure.lang.IFn)((clojure.lang.IFn)new clojure.core_concat_fn__3946(x1)));
 }
 public java.lang.Object invoke() {
  return new clojure.lang.LazySeq((clojure.lang.IFn)((clojure.lang.IFn)new clojure.core_concat_fn__3944()));
 }
 public int getRequiredArity() {
  return 2;
 }
}
