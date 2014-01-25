package clojure;

import clojure.lang.*;

public final class core_generate_interface_fn__5722 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "name");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
 }
 public core_generate_interface_fn__5722() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p1__5717_SHARP_1) {
  return (((java.lang.String)((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(p1__5717_SHARP_1))).contains((java.lang.CharSequence)((java.lang.CharSequence)"-")) ? Boolean.TRUE : Boolean.FALSE);
 }
}
