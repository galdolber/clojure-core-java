package clojure;

import clojure.lang.*;

public final class set_bubble_max_key_fn__6854 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "identical?");
 }
 Object max3;
 public set_bubble_max_key_fn__6854(final Object max3) {
  super();
  this.max3 = max3;
 }
 public java.lang.Object invoke(java.lang.Object p1__6853_SHARP_1) {
  return (clojure.lang.Util.identical(((java.lang.Object)this.max3), ((java.lang.Object)p1__6853_SHARP_1)) ? Boolean.TRUE : Boolean.FALSE);
 }
}
