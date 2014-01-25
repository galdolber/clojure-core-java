package clojure;

import clojure.lang.*;

public final class core_generate_class_arg_types__5569 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final java.lang.Object const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "pos?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "into-array");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "replicate");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "make-array");
  const__4 = (java.lang.Object)clojure.asm.Type.class;
  const__5 = (java.lang.Object)0L;
 }
 Object obj_type38;
 public core_generate_class_arg_types__5569(final Object obj_type38) {
  super();
  this.obj_type38 = obj_type38;
 }
 public java.lang.Object invoke(java.lang.Object n1) {
  if (clojure.lang.Numbers.isPos(((java.lang.Object)n1))) {
   return ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(n1, this.obj_type38));
  } else {
   return ((IFn)const__3.getRawRoot()).invoke(const__4, const__5);
  }
 }
}
