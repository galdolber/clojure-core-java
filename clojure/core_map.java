package clojure;

import clojure.lang.*;

public final class core_map extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "conj");
 }
 public core_map() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object f1, java.lang.Object c12, java.lang.Object c23, java.lang.Object c34, java.lang.Object colls5) {
  {
   Object step6 = new clojure.core_map_step__4243();
   return ((IFn)const__0.getRawRoot()).invoke(new clojure.core_map_fn__4247(f1), ((IFn)step6).invoke(((IFn)const__1.getRawRoot()).invoke(colls5, c34, c23, c12)));
  }
 }
 public java.lang.Object invoke(java.lang.Object f1, java.lang.Object c12, java.lang.Object c23, java.lang.Object c34) {
  return new clojure.lang.LazySeq((clojure.lang.IFn)((clojure.lang.IFn)new clojure.core_map_fn__4239(f1, c34, c23, c12)));
 }
 public java.lang.Object invoke(java.lang.Object f1, java.lang.Object c12, java.lang.Object c23) {
  return new clojure.lang.LazySeq((clojure.lang.IFn)((clojure.lang.IFn)new clojure.core_map_fn__4236(c12, c23, f1)));
 }
 public java.lang.Object invoke(java.lang.Object f1, java.lang.Object coll2) {
  return new clojure.lang.LazySeq((clojure.lang.IFn)((clojure.lang.IFn)new clojure.core_map_fn__4232(f1, coll2)));
 }
 public int getRequiredArity() {
  return 4;
 }
}
