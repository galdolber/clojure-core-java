package clojure;

import clojure.lang.*;

public final class core_generate_class_fn__5585_fn__5587 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "overload-name");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "the-class");
 }
 Object m3;
 public core_generate_class_fn__5585_fn__5587(final Object m3) {
  super();
  this.m3 = m3;
 }
 public java.lang.Object invoke(java.lang.Object p1__5546_SHARP_1) {
  return ((IFn)const__0.getRawRoot()).invoke(this.m3, ((IFn)const__1.getRawRoot()).invoke(const__2.getRawRoot(), p1__5546_SHARP_1));
 }
}
