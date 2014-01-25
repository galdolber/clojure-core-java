package clojure;

import clojure.lang.*;

public final class core_ns_process_reference__4938 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "nthnext");
  const__3 = (java.lang.Object)1L;
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "symbol");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "name");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "map");
 }
 public core_ns_process_reference__4938() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p__49371) {
  {
   Object vec__49392 = p__49371;
   Object kname3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__49392), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object args4 = ((IFn)const__2.getRawRoot()).invoke(vec__49392, const__3);
   return ((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke("clojure.core", ((IFn)const__8.getRawRoot()).invoke(kname3))), ((IFn)const__9.getRawRoot()).invoke(new clojure.core_ns_process_reference__4938_fn__4940(), args4)));
  }
 }
}
