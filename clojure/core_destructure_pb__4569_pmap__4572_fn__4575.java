package clojure;

import clojure.lang.*;

public final class core_destructure_pb__4569_pmap__4572_fn__4575 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "reduce1");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "dissoc");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "key");
 }
 public core_destructure_pb__4569_pmap__4572_fn__4575() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object bes1, java.lang.Object entry2) {
  return ((IFn)const__0.getRawRoot()).invoke(new clojure.core_destructure_pb__4569_pmap__4572_fn__4575_fn__4576(entry2), ((IFn)const__1.getRawRoot()).invoke(bes1, ((IFn)const__2.getRawRoot()).invoke(entry2)), ((IFn)((IFn)const__2.getRawRoot()).invoke(entry2)).invoke(bes1));
 }
}
