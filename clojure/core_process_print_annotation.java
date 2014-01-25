package clojure;

import clojure.lang.*;

public final class core_process_print_annotation extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "map?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "interpose");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "print-annotation-value");
 }
 public core_process_print_annotation() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object v1) {
  Object __r3004 = ((IFn)const__0.getRawRoot()).invoke(v1);
  if (__r3004 != null && !(__r3004 == Boolean.FALSE)) {
   return ((IFn)const__1.getRawRoot()).invoke(const__2.getRawRoot(), ((IFn)const__3.getRawRoot()).invoke(", ", ((IFn)const__4.getRawRoot()).invoke(new clojure.core_process_print_annotation_fn__4855(), v1)));
  } else {
   return ((IFn)const__5.getRawRoot()).invoke(v1);
  }
 }
}
