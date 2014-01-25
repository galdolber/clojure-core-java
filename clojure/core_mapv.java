package clojure;

import clojure.lang.*;

public final class core_mapv extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "persistent!");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "reduce");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "transient");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "into");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "apply");
 }
 public core_mapv() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object f1, java.lang.Object c12, java.lang.Object c23, java.lang.Object c34, java.lang.Object colls5) {
  return ((IFn)const__3.getRawRoot()).invoke(clojure.lang.PersistentVector.EMPTY, ((IFn)const__5.getRawRoot()).invoke(const__4.getRawRoot(), f1, c12, c23, c34, colls5));
 }
 public java.lang.Object invoke(java.lang.Object f1, java.lang.Object c12, java.lang.Object c23, java.lang.Object c34) {
  return ((IFn)const__3.getRawRoot()).invoke(clojure.lang.PersistentVector.EMPTY, ((IFn)const__4.getRawRoot()).invoke(f1, c12, c23, c34));
 }
 public java.lang.Object invoke(java.lang.Object f1, java.lang.Object c12, java.lang.Object c23) {
  return ((IFn)const__3.getRawRoot()).invoke(clojure.lang.PersistentVector.EMPTY, ((IFn)const__4.getRawRoot()).invoke(f1, c12, c23));
 }
 public java.lang.Object invoke(java.lang.Object f1, java.lang.Object coll2) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(new clojure.core_mapv_fn__6317(f1), ((IFn)const__2.getRawRoot()).invoke(clojure.lang.PersistentVector.EMPTY), coll2));
 }
 public int getRequiredArity() {
  return 4;
 }
}
