package clojure;

import clojure.lang.*;

public final class pprint_group_by_STAR__fn__7693 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "reverse");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "take");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "drop");
 }
 Object unit1;
 public pprint_group_by_STAR__fn__7693(final Object unit1) {
  super();
  this.unit1 = unit1;
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return RT.vector(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(this.unit1, x1))), ((IFn)const__0.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(this.unit1, x1)));
 }
}
