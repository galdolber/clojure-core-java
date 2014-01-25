package clojure;

import clojure.lang.*;

public final class pprint_render_clauses_fn__7838 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "execute-sub-format");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 Object navigator6;
 Object clause7;
 Object base_navigator3;
 public pprint_render_clauses_fn__7838(final Object navigator6, final Object clause7, final Object base_navigator3) {
  super();
  this.navigator6 = navigator6;
  this.clause7 = clause7;
  this.base_navigator3 = base_navigator3;
 }
 public java.lang.Object invoke() {
  try {
   return RT.vector(((IFn)const__0.getRawRoot()).invoke(this.clause7, this.navigator6, this.base_navigator3), ((java.lang.String)((java.lang.Object)const__1.get()).toString()));
  } finally {
   ((IFn)const__2.getRawRoot()).invoke();
  }
 }
}
