package clojure;

import clojure.lang.*;

public final class core_find_field_fn__5535 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "=");
 }
 Object f2;
 public core_find_field_fn__5535(final Object f2) {
  super();
  this.f2 = f2;
 }
 public java.lang.Object invoke(java.lang.Object p1__5534_SHARP_1) {
  return (clojure.lang.Util.equiv(((java.lang.Object)this.f2), ((java.lang.Object)((java.lang.String)((java.lang.reflect.Field)p1__5534_SHARP_1).getName()))) ? Boolean.TRUE : Boolean.FALSE);
 }
}
