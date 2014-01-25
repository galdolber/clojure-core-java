package clojure;

import clojure.lang.*;

public final class core_check_cyclic_dependency_fn__5027 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 Object path1;
 public core_check_cyclic_dependency_fn__5027(final Object path1) {
  super();
  this.path1 = path1;
 }
 public java.lang.Object invoke(java.lang.Object p1__5026_SHARP_1) {
  if (clojure.lang.Util.equiv(((java.lang.Object)p1__5026_SHARP_1), ((java.lang.Object)this.path1))) {
   return ((IFn)const__1.getRawRoot()).invoke("[ ", p1__5026_SHARP_1, " ]");
  } else {
   return p1__5026_SHARP_1;
  }
 }
}
