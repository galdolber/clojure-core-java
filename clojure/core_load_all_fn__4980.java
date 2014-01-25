package clojure;

import clojure.lang.*;

public final class core_load_all_fn__4980 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "commute");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "*loaded-libs*");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "ref");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "sorted-set");
 }
 Object require3;
 Object need_ns2;
 Object lib1;
 public core_load_all_fn__4980(final Object require3, final Object need_ns2, final Object lib1) {
  super();
  this.require3 = require3;
  this.need_ns2 = need_ns2;
  this.lib1 = lib1;
 }
 public java.lang.Object invoke() {
  Object __r3146 = null;
  {
   ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__1, ((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke())));
   __r3146 = ((IFn)new clojure.core_load_all_fn__4980_fn__4983(this.require3, this.need_ns2, this.lib1)).invoke();
  }
  return ((IFn)const__0.getRawRoot()).invoke(const__1.get(), new clojure.core_load_all_fn__4980_fn__4981(), __r3146);
 }
}
