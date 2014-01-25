package clojure;

import clojure.lang.*;

public final class walk_prewalk_replace extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.walk", "prewalk");
 }
 public walk_prewalk_replace() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object smap1, java.lang.Object form2) {
  return ((IFn)const__0.getRawRoot()).invoke(new clojure.walk_prewalk_replace_fn__6615(smap1), form2);
 }
}
