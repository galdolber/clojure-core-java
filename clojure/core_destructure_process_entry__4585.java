package clojure;

import clojure.lang.*;

public final class core_destructure_process_entry__4585 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "second");
 }
 Object pb3;
 public core_destructure_process_entry__4585(final Object pb3) {
  super();
  this.pb3 = pb3;
 }
 public java.lang.Object invoke(java.lang.Object bvec1, java.lang.Object b2) {
  return ((IFn)this.pb3).invoke(bvec1, ((IFn)const__0.getRawRoot()).invoke(b2), ((IFn)const__1.getRawRoot()).invoke(b2));
 }
}
